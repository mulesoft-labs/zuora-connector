/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.zuora.AccountProfile;
import org.mule.modules.zuora.InvoiceItemProfile;
import org.mule.modules.zuora.InvoiceProfile;
import org.mule.modules.zuora.ProductProfile;
import org.mule.modules.zuora.ProductRatePlanChargeProfile;
import org.mule.modules.zuora.ProductRatePlanProfile;
import org.mule.modules.zuora.RatePlanProfile;
import org.mule.modules.zuora.SubscriptionProfile;
import org.mule.modules.zuora.User;

import com.zuora.api.AmendRequest;
import com.zuora.api.AmendResult;
import com.zuora.api.DeleteResult;
import com.zuora.api.ErrorCode;
import com.zuora.api.LoginFault;
import com.zuora.api.LoginResult;
import com.zuora.api.QueryResult;
import com.zuora.api.SaveResult;
import com.zuora.api.SessionHeader;
import com.zuora.api.Soap;
import com.zuora.api.SubscribeRequest;
import com.zuora.api.SubscribeResult;
import com.zuora.api.UnexpectedErrorFault;
import com.zuora.api.ZuoraService;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Invoice;
import com.zuora.api.object.InvoiceItem;
import com.zuora.api.object.Payment;
import com.zuora.api.object.PaymentMethod;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.RatePlanCharge;
import com.zuora.api.object.Subscription;
import com.zuora.api.object.TaxationItem;
import com.zuora.api.object.ZObject;

/**
 * Implementation of {@link ZuoraClient} based on a slightly modified version of
 * the open-source <a href="http://code.google.com/p/sfdc-wsc/">fsdc-wsc</a>.
 * Although that client is sales-force specific, it works with with Zuora since
 * both APIs have very similar WSDL interfaces
 *
 * @author flbulgarelli
 */
public class CxfZuoraClient implements ZuoraClient<Exception> {
    private final String username;
    private final String password;
    private final String endpoint;
    private JAXBDataBinding jSessionDataBinding;
    private final Soap soap;
    private final String sessionId;

    public CxfZuoraClient(@NotNull String username, @NotNull String password,
                          @NotNull String endpoint) throws UnexpectedErrorFault, LoginFault {
        Validate.notNull(username);
        Validate.notNull(password);
        Validate.notNull(endpoint);
        this.username = username;
        this.password = password;
        this.endpoint = endpoint;

        // @EL if multiple clients are created at the same time this JAXB code can
        // generate race condiitons on the ClassLoader when it searches for the
        // ObjectFactory:
        //
        // 1. Could not create a validated object, cause: loader (instance of
        // org/mule/module/launcher/MuleApplicationClassLoader): attempted  duplicate class
        // definition for name: "com/zuora/api/object/ObjectFactory" (java.util.NoSuchElementException)
        //
        // So I'm locking it so it can happen only one at a time
        synchronized (CxfZuoraClient.class) {
            try {
                jSessionDataBinding = new JAXBDataBinding(SessionHeader.class);
            } catch (JAXBException e) {
                throw new AssertionError(e);
            }
        }

        ZuoraService serviceLocator = new ZuoraService(getClass().getResource(
                "/zuora.a.43.0.wsdl"));
        this.soap = serviceLocator.getPort(Soap.class);

        BindingProvider bindingProvider = ((BindingProvider) this.soap);
        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

        LoginResult loginResult;
        loginResult = this.soap.login(username, password);

        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                loginResult.getServerUrl());
        bindingProvider.getRequestContext().put(
                MessageContext.HTTP_REQUEST_HEADERS,
                new HashMap<String, List<String>>());

        sessionId = loginResult.getSession();

        SessionHeader sh = new SessionHeader();
        sh.setSession(loginResult.getSession());

        bindingProvider.getRequestContext().put(
                Header.HEADER_LIST,
                Arrays.asList(new Header(new QName(
                        "urn:partner.soap.sforce.com", "SessionHeader"), sh,
                        jSessionDataBinding)));

    }

    public String getSessionId() {
        return sessionId;
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments)
            throws Exception {
        Validate.notEmpty(amendaments);

        try {
            return soap.amend(amendaments);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.create(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids)
            throws Exception {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);

        try {
            return this.soap.delete(type, ids);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public Iterable<ZObject> find(final String zquery) throws Exception {
        Validate.notEmpty(zquery);

        List<ZObject> allRecords = new ArrayList<ZObject>();

        try {
            QueryResult result = soap.query(zquery);
            if (result.getRecords().get(0) != null) {
                allRecords.addAll(result.getRecords());
            }
             /*
            //Albin: This has been removed from latest version of the wsdl
            while (!result.isDone()) {
                result = soap.queryMore(result.getQueryLocator());
                allRecords.addAll(result.getRecords());
            }
            */

        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

        return allRecords;
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.generate(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public User getUserInfo() throws Exception {

        try {
            Holder<String> userId = new Holder<String>();
            Holder<String> tenantId = new Holder<String>();
            Holder<String> tenantName = new Holder<String>();
            Holder<String> userEmail = new Holder<String>();
            Holder<String> userFullName = new Holder<String>();
            Holder<String> username = new Holder<String>();
            this.soap.getUserInfo(tenantId, tenantName, userEmail,
                    userFullName, userId, username);
            // TODO
            return new User(userId.value, username.value, userEmail.value,
                    userFullName.value, tenantId.value, tenantName.value);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions)
            throws Exception {
        Validate.notEmpty(subscriptions);

        try {
            return this.soap.subscribe(subscriptions);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);
        try {
            return this.soap.update(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

    }

    @Override
    public ProductProfile productProfile(String productId)
            throws Exception {
        
        ProductProfile productProfile = new ProductProfile();

        try {
            Validate.notEmpty(productId);

            String productQuery = "select Category,Description,EffectiveEndDate,EffectiveStartDate,Name,SKU from Product where id = '"
                    + productId + "'";

            QueryResult qr = this.soap.query(productQuery);
            if (qr.getSize() != 0) {

                Product product = (Product) qr.getRecords().get(0);
                productProfile.setProduct(product);

                String productRatePlanQuery = "select Description,EffectiveEndDate,EffectiveStartDate,Name from ProductRatePlan where ProductId = '"
                        + productId + "'";
                List<ZObject> ratePlans = this.soap.query(productRatePlanQuery)
                        .getRecords();
                List<HashMap<String, Object>> ratePlanList = new ArrayList<HashMap<String, Object>>();
                List<ProductRatePlanProfile> productRatePlanProfiles = new ArrayList<ProductRatePlanProfile>();

                for (ZObject ratePlan : ratePlans) {
                    if (ratePlan == null) continue;
                    final ProductRatePlanProfile productRatePlanProfile = new ProductRatePlanProfile();
                    final ProductRatePlan productRatePlan = (ProductRatePlan) ratePlan;
                    productRatePlanProfile.setProductRatePlan(productRatePlan);

                    String productRatePlanChargesQuery = "select AccountingCode,BillCycleDay,BillCycleType,BillingPeriod,BillingPeriodAlignment,ChargeModel,ChargeType,DefaultQuantity,Description,IncludedUnits,MaxQuantity,MinQuantity,Name,NumberOfPeriod,OverageCalculationOption,OverageUnusedUnitsCreditOption,RevRecCode,RevRecTriggerCondition,SmoothingModel,SpecificBillingPeriod,Taxable,TaxCode,TriggerEvent,UOM from ProductRatePlanCharge where ProductRatePlanId ='"
                            + productRatePlan.getId() + "'";
                    
                    @SuppressWarnings("unchecked")
                    List<ProductRatePlanCharge> productRatePlanCharges = (List<ProductRatePlanCharge>) CollectionUtils.collect(this.soap.query(
                            productRatePlanChargesQuery).getRecords(), new Transformer()
                            {
                                @Override
                                public Object transform(Object input)
                                {
                                    return (ProductRatePlanCharge) input;
                                }
                            });
                    

                    List<ProductRatePlanChargeProfile> productRatePlanChargeProfiles = new ArrayList<ProductRatePlanChargeProfile>();
                    for (ProductRatePlanCharge ratePlanCharge : productRatePlanCharges) {
                        final ProductRatePlanChargeProfile productRatePlanChargeProfile = new ProductRatePlanChargeProfile();
                        productRatePlanChargeProfile.setProductRatePlanCharge(ratePlanCharge);

                        String productRatePlanChargesTierQuery = "select Active,Currency,EndingUnit,IsOveragePrice,Price,PriceFormat,StartingUnit,Tier from ProductRatePlanChargeTier where ProductRatePlanChargeId ='"
                                + ratePlanCharge.getId() + "'";
                        
                        @SuppressWarnings("unchecked")
                        List<ProductRatePlanChargeTier> productRatePlanChargeTiers = (List<ProductRatePlanChargeTier>) CollectionUtils.collect(
                                this.soap.query(productRatePlanChargesTierQuery).getRecords(),
                                new Transformer()
                                {
                                    @Override
                                    public Object transform(Object input)
                                    {
                                        return (ProductRatePlanChargeTier) input;
                                    }
                                });
                        productRatePlanChargeProfile.setProductRatePlanChargeTiers(productRatePlanChargeTiers);
                        
                        productRatePlanChargeProfiles.add(productRatePlanChargeProfile);
                        
                    }
                    productRatePlanProfile.setProductRatePlanChargeProfiles(productRatePlanChargeProfiles);
                    productRatePlanProfiles.add(productRatePlanProfile);
                }
                productProfile.setProductRatePlanProfiles(productRatePlanProfiles);
            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

        return productProfile;
    }

    @Override
    public AccountProfile accountProfile(String accountId)
            throws Exception {

        Validate.notEmpty(accountId);
        
        AccountProfile accountProfile = new AccountProfile();

        String accountQuery = "select AccountNumber,AdditionalEmailAddresses,AllowInvoiceEdit,AutoPay,Balance,Batch,BillCycleDay,BillToId,CommunicationProfileId,CreatedById,CreatedDate,CreditBalance,CrmId,Currency,CustomerServiceRepName,DefaultPaymentMethodId,InvoiceDeliveryPrefsEmail,InvoiceDeliveryPrefsPrint,InvoiceTemplateId,LastInvoiceDate,Name,Notes,ParentId,PaymentGateway,PaymentTerm,PurchaseOrderNumber,SalesRepName,SoldToId,Status,TaxExemptCertificateId,TaxExemptCertificateType,TaxExemptDescription,TaxExemptEffectiveDate,TaxExemptExpirationDate,TaxExemptIssuingJurisdiction,TaxExemptStatus,TotalInvoiceBalance,UpdatedById,UpdatedDate  from Account where id = '"
                + accountId + "'";

        QueryResult qr = this.soap.query(accountQuery);

        if (qr.getSize() != 0) {

            final Account account = (Account) qr.getRecords().get(0);
            accountProfile.setAccount(account);

            if (account.getDefaultPaymentMethodId() != null && !account.getDefaultPaymentMethodId().isEmpty()) {
                String paymentMethodQuery = "SELECT AchAbaCode,AchAccountName,AchAccountNumberMask,AchAccountType,AchBankName,Active,BankBranchCode,BankCheckDigit,BankCity,BankCode,BankIdentificationNumber,BankName,BankPostalCode,BankStreetName,BankStreetNumber,BankTransferAccountName,BankTransferAccountType,BankTransferType,CreatedById,CreatedDate,CreditCardAddress1,CreditCardAddress2,CreditCardCity,CreditCardCountry,Id, CreditCardExpirationMonth, CreditCardExpirationYear, CreditCardMaskNumber,CreditCardHolderName,CreditCardPostalCode,CreditCardState,CreditCardType,DeviceSessionId,Email,IPAddress,LastFailedSaleTransactionDate,LastTransactionDateTime,LastTransactionStatus,MaxConsecutivePaymentFailures,Name,NumConsecutiveFailures,PaymentMethodStatus,PaymentRetryWindow,PaypalBaid,PaypalEmail,PaypalPreapprovalKey,PaypalType,Phone,TotalNumberOfErrorPayments,TotalNumberOfProcessedPayments,Type,UpdatedById,UpdatedDate,UseDefaultRetryRule from PaymentMethod where Id = '"
                        + account.getDefaultPaymentMethodId() + "'";

                final PaymentMethod paymentMethod = (PaymentMethod) this.soap.query(paymentMethodQuery)
                    .getRecords().get(0);
                accountProfile.setPaymentMethod(paymentMethod);

            }
            GregorianCalendar lastMonth = new GregorianCalendar();
            lastMonth.add(GregorianCalendar.MONTH, -1);
            SimpleDateFormat df = new SimpleDateFormat(
                    "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            String lastMonthString = df.format(lastMonth.getTime());

            String paymentQuery = "SELECT AccountingCode,Amount,AppliedCreditBalanceAmount,AuthTransactionId,BankIdentificationNumber,CancelledOn,Comment,CreatedById,CreatedDate,EffectiveDate,GatewayOrderId,GatewayResponse,GatewayResponseCode,GatewayState,MarkedForSubmissionOn,PaymentMethodID,PaymentNumber,ReferenceId,RefundAmount,SecondPaymentReferenceId,SettledOn,SoftDescriptor, SoftDescriptorPhone, Status, SubmittedOn,TransferredToAccounting,Type,UpdatedById,UpdatedDate from Payment where Id = '"
                    + accountId
                    + "' and EffectiveDate >= '"
                    + lastMonthString
                    + "'";

            @SuppressWarnings("unchecked")
            List<Payment> payments = (List<Payment>) CollectionUtils.collect(this.soap.query(paymentQuery)
                    .getRecords(), new Transformer()
                    {
                        @Override
                        public Object transform(Object input)
                        {
                            Payment payment = (Payment) input;
                            return payment;
                        }
                    });
            if(payments.size() > 0)
            {
                accountProfile.setPayments(payments);
            }

            String billToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                    + accountProfile.getAccount().getBillToId() + "'";
            QueryResult qrBillTo = this.soap.query(billToQuery);
            if (qrBillTo.getSize() > 0) {
                accountProfile.setBillTo((Contact) qrBillTo.getRecords().get(0));
            }

            String subscriptionQuery = "SELECT AutoRenew,CancelledDate,ContractAcceptanceDate,ContractEffectiveDate,CreatedById,CreatedDate,CreatorAccountId,InitialTerm,IsInvoiceSeparate,Name,Notes,OriginalCreatedDate,OriginalId,PreviousSubscriptionId,RenewalTerm,ServiceActivationDate,Status,SubscriptionEndDate,SubscriptionStartDate,TermEndDate,TermStartDate,TermType,UpdatedById,UpdatedDate,Version from Subscription where AccountId = '"
                    + accountId + "' and status='Active'";

            List<ZObject> subscriptionZList = this.soap
                    .query(subscriptionQuery).getRecords();

            final List<SubscriptionProfile> subscriptionProfiles = new ArrayList<SubscriptionProfile>();
            for (ZObject zSubscription : subscriptionZList) {
                if (zSubscription != null) {
                    final SubscriptionProfile subscriptionProfile = new SubscriptionProfile();
                    final Subscription subscription = (Subscription) zSubscription;
                    subscriptionProfile.setSubscription(subscription);

                    String rateplanQuery = "SELECT AmendmentId,AmendmentSubscriptionRatePlanId,AmendmentType,CreatedById,CreatedDate,Name,ProductRatePlanId,UpdatedById,UpdatedDate from RatePlan where SubscriptionId ='"
                            + subscription.getId() + "'";

                    List<ZObject> ratePlanZList = this.soap
                            .query(rateplanQuery).getRecords();

                    List<RatePlanProfile> ratePlanProfiles = new ArrayList<RatePlanProfile>();
                    for (ZObject zRatePlan : ratePlanZList) {
                        if (zRatePlan != null) {
                            final RatePlanProfile ratePlanProfile = new RatePlanProfile();
                            final RatePlan ratePlan = (RatePlan) zRatePlan;
                            ratePlanProfile.setRatePlan(ratePlan);
                            String rateplanchargeQuery = "SELECT AccountingCode,ApplyDiscountTo,BillCycleDay,BillCycleType,BillingPeriodAlignment,ChargedThroughDate,ChargeModel,ChargeNumber,ChargeType,CreatedById,CreatedDate,Description,DiscountLevel,DMRC,DTCV,EffectiveEndDate,EffectiveStartDate,IsLastSegment,MRR,Name,NumberOfPeriods,OriginalId,OverageCalculationOption,OverageUnusedUnitsCreditOption,Price,ProcessedThroughDate,ProductRatePlanChargeId,Quantity,Segment,TCV,TriggerDate,TriggerEvent,UnusedUnitsCreditRates,UOM,UpdatedById,UpdatedDate,UpToPeriods,Version from RatePlanCharge where RatePlanId ='"
                                    + ratePlan.getId() + "'";
                            List<ZObject> ratePlanChargeZList = this.soap
                                    .query(rateplanchargeQuery).getRecords();
                            final List<RatePlanCharge> ratePlanCharges = new ArrayList<RatePlanCharge>();
                            for (ZObject zRatePlanCharge : ratePlanChargeZList) {
                                if (zRatePlanCharge != null) {
                                    ratePlanCharges.add((RatePlanCharge) zRatePlanCharge);
                                }
                            }
                            ratePlanProfile.setRatePlanCharge(ratePlanCharges);
                            ratePlanProfiles.add(ratePlanProfile);
                        }
                    }
                    subscriptionProfile.setRatePlanProfiles(ratePlanProfiles);
                    subscriptionProfiles.add(subscriptionProfile);
                }
            }

            accountProfile.setSubscriptionProfiles(subscriptionProfiles);

        }
        return accountProfile;
    }

    @Override
    public InvoiceProfile getInvoice(String invoiceId)
            throws Exception {
        final InvoiceProfile invoiceProfile = new InvoiceProfile();
        
        try {
            Validate.notEmpty(invoiceId);

            String invoiceQuery = "select AccountID,AdjustmentAmount,Amount,AmountWithoutTax,Balance,Comments,CreatedById,CreatedDate,DueDate,IncludesOneTime,IncludesRecurring,IncludesUsage,InvoiceDate,InvoiceNumber,LastEmailSentDate,PaymentAmount,PostedBy,PostedDate,RefundAmount,Source,Status,TargetDate,TaxAmount,TaxExemptAmount,TransferredToAccounting,UpdatedDate from Invoice where id = '"
                    + invoiceId + "'";

            QueryResult invoceQR = this.soap.query(invoiceQuery);
            if (invoceQR.getSize() != 0) {
                final Invoice invoice = (Invoice)invoceQR.getRecords().get(0);
                invoiceProfile.setInvoice(invoice);

                String accountQuery = "select AccountNumber,AdditionalEmailAddresses,AllowInvoiceEdit,AutoPay,Balance,Batch,BillCycleDay,BillToId,CommunicationProfileId,CreditBalance,CrmId,Currency,CustomerServiceRepName,DefaultPaymentMethodId,InvoiceDeliveryPrefsEmail,InvoiceDeliveryPrefsPrint,InvoiceTemplateId,LastInvoiceDate,Name,Notes,ParentId,PaymentGateway,PaymentTerm,PurchaseOrderNumber,SalesRepName,SoldToId,Status,TaxExemptCertificateId,TaxExemptCertificateType,TaxExemptDescription,TaxExemptEffectiveDate,TaxExemptExpirationDate,TaxExemptIssuingJurisdiction,TaxExemptStatus,TotalInvoiceBalance from Account where id = '"
                        + invoice.getAccountId() + "'";
                QueryResult accountQR = this.soap.query(accountQuery);
                if (accountQR.getSize() != 0) {
                    final Account account = (Account) accountQR.getRecords().get(0);
                    invoiceProfile.setAccount(account);

                    String paymentMethodQuery = "select AchAbaCode,AchAccountName,AchAccountNumberMask,AchAccountType,AchBankName,Active,BankBranchCode,BankCheckDigit,BankCity,BankCode,BankIdentificationNumber,BankName,BankPostalCode,BankStreetName,BankStreetNumber,BankTransferAccountName,BankTransferAccountType,BankTransferType,City,Country,CreditCardAddress1,CreditCardAddress2,CreditCardCity,CreditCardCity,CreditCardExpirationMonth,CreditCardExpirationYear,CreditCardHolderName,CreditCardMaskNumber,CreditCardPostalCode,CreditCardState,CreditCardType,DeviceSessionId,Email,FirstName,IBAN,IPAddress,LastFailedSaleTransactionDate,LastName,LastTransactionDateTime,LastTransactionDateTime,MandateCreationDate,MandateID,MandateReceived,MandateUpdateDate,MaxConsecutivePaymentFailures,Name,NumConsecutiveFailures,PaymentMethodStatus,PaymentRetryWindow,PaypalBaid,PaypalEmail,PaypalPreapprovalKey,PaypalType,Phone,PostalCode,State,StreetName,StreetNumber,TotalNumberOfErrorPayments,TotalNumberOfProcessedPayments,Type,UseDefaultRetryRule from PaymentMethod where id = '"
                            + account.getDefaultPaymentMethodId() + "'";
                    QueryResult paymentMethodQR = this.soap.query(paymentMethodQuery);
                    if (paymentMethodQR.getSize() != 0) {
                        final PaymentMethod paymentMethod = (PaymentMethod) paymentMethodQR.getRecords().get(0);
                        invoiceProfile.setPaymentMethod(paymentMethod);

                    }

                    String billToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                            + account.getBillToId() + "'";

                    QueryResult billToQR = this.soap.query(billToQuery);
                    if (billToQR.getSize() != 0) {
                        final Contact billTo = (Contact) billToQR.getRecords().get(0);
                        invoiceProfile.setBillTo(billTo);
                    }
                    String soldToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                            + account.getSoldToId() + "'";

                    QueryResult soldToQR = this.soap.query(soldToQuery);
                    if (soldToQR.getSize() != 0) {
                        final Contact soldTo = (Contact) soldToQR.getRecords().get(0);
                        invoiceProfile.setSoldTo(soldTo);
                    }

                }


                String invoiceItemQuery = "select AccountingCode,ChargeAmount,ChargeDate,ChargeDescription,ChargeName,ChargeNumber,ProcessingType,ProductDescription,ProductId,ProductName,Quantity,RatePlanChargeId,RevRecCode,RevRecStartDate,RevRecTriggerCondition,ServiceEndDate,ServiceStartDate,SKU,SubscriptionId,SubscriptionNumber,TaxAmount,TaxCode,TaxExemptAmount,UnitPrice,UOM from InvoiceItem where invoiceid = '"
                        + invoice.getId() + "'";

                @SuppressWarnings("unchecked")
                List<InvoiceItem> invoiceItemList = (List<InvoiceItem>) CollectionUtils.collect(this.soap.query(invoiceItemQuery)
                        .getRecords(), new Transformer()
                        {
                            @Override
                            public Object transform(Object input)
                            {
                                return (InvoiceItem) input;
                            }
                        });

                final List<InvoiceItemProfile> invoiceItemProfiles = new ArrayList<InvoiceItemProfile>();
                for (InvoiceItem invoiceItem : invoiceItemList) {
                    if (invoiceItem != null) {
                        InvoiceItemProfile invoiceItemProfile = new InvoiceItemProfile();
                        invoiceItemProfile.setInvoiceItem(invoiceItem);

                        String taxationItemQuery = "select AccountingCode,ExemptAmount,Jurisdiction,LocationCode,Name,TaxAmount,TaxCode,TaxCodeDescription,TaxDate,TaxRate,TaxRateDescription,TaxRateType from TaxationItem where invoiceitemid = '"
                                + invoiceItem.getId() + "'";

                        @SuppressWarnings("unchecked")
                        List<TaxationItem> taxationItemList = (List<TaxationItem>) CollectionUtils.collect(
                            this.soap.query(taxationItemQuery).getRecords(), new Transformer()
                                {
                                    @Override
                                    public Object transform(Object input)
                                    {
                                        return (TaxationItem) input;
                                    }
                                });
                        
                        if(!taxationItemList.isEmpty()){
                            invoiceItemProfile.setTaxationItems(taxationItemList);
                        }
                        invoiceItemProfiles.add(invoiceItemProfile);
                    }
                }
                invoiceProfile.setInvoiceItemProfiles(invoiceItemProfiles);


            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
        return invoiceProfile;
    }

    private HashMap<String, Object> getAsHashMap(
            Collection<Entry<String, Object>> col) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        for (Entry<String, Object> e : col) {
            hm.put(e.getKey().toString(), e.getValue().toString());
        }
        return hm;
    }

}
