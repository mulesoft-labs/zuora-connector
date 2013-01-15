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

import com.zuora.api.*;
import com.zuora.api.object.ZObject;
import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.zuora.User;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

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
        // generate race conditions on the ClassLoader when it searches for the
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
                "/zuora.a.43.0-modified.wsdl"));
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
            Albin 2012-10-29: Query more not supported in the WSDL any more.
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
    public Map<String, Object> productProfile(String productId)
            throws Exception {
        // TODO Auto-generated method stub
        HashMap<String, Object> productprofile = new HashMap<String, Object>();

        try {
            Validate.notEmpty(productId);

            String productQuery = "select Category,Description,EffectiveEndDate,EffectiveStartDate,Name,SKU from Product where id = '"
                    + productId + "'";

            QueryResult qr = this.soap.query(productQuery);
            if (qr.getSize() != 0) {

                Collection<Entry<String, Object>> productCollection = qr
                        .getRecords().get(0).properties();
                productprofile = getAsHashMap(productCollection);

                String productRatePlanQuery = "select Description,EffectiveEndDate,EffectiveStartDate,Name from ProductRatePlan where ProductId = '"
                        + productId + "'";
                List<ZObject> ratePlans = this.soap.query(productRatePlanQuery)
                        .getRecords();
                List<HashMap<String, Object>> ratePlanList = new ArrayList<HashMap<String, Object>>();

                for (ZObject ratePlan : ratePlans) {
                    Collection<Entry<String, Object>> rateplanCollection = ratePlan
                            .properties();
                    HashMap<String, Object> productRatePlanMap = getAsHashMap(rateplanCollection);

                    String productRatePlanChargesQuery = "select AccountingCode,BillCycleDay,BillCycleType,BillingPeriod,BillingPeriodAlignment,ChargeModel,ChargeType,DefaultQuantity,Description,IncludedUnits,MaxQuantity,MinQuantity,Name,NumberOfPeriod,OverageCalculationOption,OverageUnusedUnitsCreditOption,RevRecCode,RevRecTriggerCondition,SmoothingModel,SpecificBillingPeriod,Taxable,TaxCode,TriggerEvent,UOM from ProductRatePlanCharge where ProductRatePlanId ='"
                            + productRatePlanMap.get("id") + "'";
                    List<ZObject> productRatePlanCharges = this.soap.query(
                            productRatePlanChargesQuery).getRecords();
                    List<HashMap<String, Object>> productRatePlanChargeList = new ArrayList<HashMap<String, Object>>();

                    for (ZObject ratePlanCharge : productRatePlanCharges) {
                        Collection<Entry<String, Object>> rateplanCargeCollection = ratePlanCharge
                                .properties();
                        HashMap<String, Object> productRatePlanChargeMap = getAsHashMap(rateplanCargeCollection);

                        String productRatePlanChargesTierQuery = "select Active,Currency,EndingUnit,IsOveragePrice,Price,PriceFormat,StartingUnit,Tier from ProductRatePlanChargeTier where ProductRatePlanChargeId ='"
                                + productRatePlanChargeMap.get("id") + "'";
                        List<ZObject> productRatePlanChargeTiers = this.soap
                                .query(productRatePlanChargesTierQuery)
                                .getRecords();
                        List<HashMap<String, Object>> productRatePlanChargeTierList = new ArrayList<HashMap<String, Object>>();
                        for (ZObject ratePlanChargeTier : productRatePlanChargeTiers) {
                            Collection<Entry<String, Object>> rateplanCargeTierCollection = ratePlanChargeTier
                                    .properties();
                            HashMap<String, Object> productRatePlanChargeTierMap = getAsHashMap(rateplanCargeTierCollection);
                            productRatePlanChargeTierList
                                    .add(productRatePlanChargeTierMap);

                        }
                        productRatePlanChargeMap.put(
                                "productRatePlanChargeTiers",
                                productRatePlanChargeTierList);

                        productRatePlanChargeList.add(productRatePlanChargeMap);
                    }
                    productRatePlanMap.put("productRatePlanCharges",
                            productRatePlanChargeList);
                    ratePlanList.add(productRatePlanMap);

                }
                productprofile.put("productRatePlans", ratePlanList);
            } else {
                productprofile.put("error",
                        "Unable to find a product with the id: " + productId);
            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

        return productprofile;
    }

    @Override
    public Map<String, Object> accountProfile(String accountId)
            throws Exception {
        // TODO Auto-generated method stub

        HashMap<String, Object> accountMap = new HashMap<String, Object>();
        Validate.notEmpty(accountId);

        String accountQuery = "select AccountNumber,AdditionalEmailAddresses,AllowInvoiceEdit,AutoPay,Balance,Batch,BillCycleDay,BillToId,CommunicationProfileId,CreatedById,CreatedDate,CreditBalance,CrmId,Currency,CustomerServiceRepName,DefaultPaymentMethodId,InvoiceDeliveryPrefsEmail,InvoiceDeliveryPrefsPrint,InvoiceTemplateId,LastInvoiceDate,Name,Notes,ParentId,PaymentGateway,PaymentTerm,PurchaseOrderNumber,SalesRepName,SoldToId,Status,TaxExemptCertificateId,TaxExemptCertificateType,TaxExemptDescription,TaxExemptEffectiveDate,TaxExemptExpirationDate,TaxExemptIssuingJurisdiction,TaxExemptStatus,TotalInvoiceBalance,UpdatedById,UpdatedDate  from Account where id = '"
                + accountId + "'";

        QueryResult qr = this.soap.query(accountQuery);

        if (qr.getSize() != 0) {

            Collection<Entry<String, Object>> accountCollection = qr
                    .getRecords().get(0).properties();

            accountMap = getAsHashMap(accountCollection);
            if (accountMap.get("defaultPaymentMethodId") != null) {
                String paymentMethodQuery = "SELECT AchAbaCode,AchAccountName,AchAccountNumberMask,AchAccountType,AchBankName,Active,BankBranchCode,BankCheckDigit,BankCity,BankCode,BankIdentificationNumber,BankName,BankPostalCode,BankStreetName,BankStreetNumber,BankTransferAccountName,BankTransferAccountType,BankTransferType,CreatedById,CreatedDate,CreditCardAddress1,CreditCardAddress2,CreditCardCity,CreditCardCountry,Id, CreditCardExpirationMonth, CreditCardExpirationYear, CreditCardMaskNumber,CreditCardHolderName,CreditCardPostalCode,CreditCardState,CreditCardType,DeviceSessionId,Email,IPAddress,LastFailedSaleTransactionDate,LastTransactionDateTime,LastTransactionStatus,MaxConsecutivePaymentFailures,Name,NumConsecutiveFailures,PaymentMethodStatus,PaymentRetryWindow,PaypalBaid,PaypalEmail,PaypalPreapprovalKey,PaypalType,Phone,TotalNumberOfErrorPayments,TotalNumberOfProcessedPayments,Type,UpdatedById,UpdatedDate,UseDefaultRetryRule from PaymentMethod where Id = '"
                        + accountMap.get("defaultPaymentMethodId") + "'";

                Collection<Entry<String, Object>> paymentMethodCollection = this.soap
                        .query(paymentMethodQuery).getRecords().get(0)
                        .properties();

                if (paymentMethodCollection.size() > 0) {
                    accountMap.put("paymentMethod",
                            getAsHashMap(paymentMethodCollection));
                }
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

            List<ZObject> paymentZList = this.soap.query(paymentQuery)
                    .getRecords();

            List<Map<String, Object>> paymentResultList = new ArrayList<Map<String, Object>>();
            for (ZObject zPayment : paymentZList) {
                if (zPayment != null) {
                    Collection<Entry<String, Object>> paymentCollection = zPayment
                            .properties();
                    paymentResultList.add(getAsHashMap(paymentCollection));
                }
            }

            if (paymentResultList.size() > 0) {
                accountMap.put("payments", paymentResultList);
            }
            String billToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                    + accountMap.get("billToId") + "'";
            QueryResult qrBillTo = this.soap.query(billToQuery);
            if (qrBillTo.getSize() > 0) {
                Collection<Entry<String, Object>> billToCollection = qrBillTo
                        .getRecords().get(0).properties();
                HashMap<String, Object> billToMap = new HashMap<String, Object>();
                billToMap = getAsHashMap(billToCollection);
                if (billToMap.size() > 0) {
                    accountMap.put("billTo", billToMap);
                }
            }

            String subscriptionQuery = "SELECT AutoRenew,CancelledDate,ContractAcceptanceDate,ContractEffectiveDate,CreatedById,CreatedDate,CreatorAccountId,InitialTerm,IsInvoiceSeparate,Name,Notes,OriginalCreatedDate,OriginalId,PreviousSubscriptionId,RenewalTerm,ServiceActivationDate,Status,SubscriptionEndDate,SubscriptionStartDate,TermEndDate,TermStartDate,TermType,UpdatedById,UpdatedDate,Version from Subscription where AccountId = '"
                    + accountId + "' and status='Active'";

            List<ZObject> subscriptionZList = this.soap
                    .query(subscriptionQuery).getRecords();

            List<Map<String, Object>> subscriptionResultList = new ArrayList<Map<String, Object>>();
            for (ZObject zSubscription : subscriptionZList) {
                if (zSubscription != null) {
                    Collection<Entry<String, Object>> subscriptionCollection = zSubscription.properties();

                    Map<String, Object> subscriptionMap = getAsHashMap(subscriptionCollection);

                    String rateplanQuery = "SELECT AmendmentId,AmendmentSubscriptionRatePlanId,AmendmentType,CreatedById,CreatedDate,Name,ProductRatePlanId,UpdatedById,UpdatedDate from RatePlan where SubscriptionId ='"
                            + subscriptionMap.get("id") + "'";

                    List<ZObject> ratePlanZList = this.soap
                            .query(rateplanQuery).getRecords();

                    List<Map<String, Object>> ratePlanResultList = new ArrayList<Map<String, Object>>();
                    for (ZObject zRatePlan : ratePlanZList) {
                        if (zRatePlan != null) {
                            Collection<Entry<String, Object>> ratePlanCollection = zRatePlan
                                    .properties();

                            Map<String, Object> ratePlanMap = getAsHashMap(ratePlanCollection);
                            List<Map<String, Object>> ratePlanChargeResultList = new ArrayList<Map<String, Object>>();
                            String rateplanchargeQuery = "SELECT AccountingCode,ApplyDiscountTo,BillCycleDay,BillCycleType,BillingPeriodAlignment,ChargedThroughDate,ChargeModel,ChargeNumber,ChargeType,CreatedById,CreatedDate,Description,DiscountLevel,DMRC,DTCV,EffectiveEndDate,EffectiveStartDate,IsLastSegment,MRR,Name,NumberOfPeriods,OriginalId,OverageCalculationOption,OverageUnusedUnitsCreditOption,Price,ProcessedThroughDate,ProductRatePlanChargeId,Quantity,Segment,TCV,TriggerDate,TriggerEvent,UnusedUnitsCreditRates,UOM,UpdatedById,UpdatedDate,UpToPeriods,Version from RatePlanCharge where RatePlanId ='"
                                    + ratePlanMap.get("id") + "'";
                            List<ZObject> ratePlanChargeZList = this.soap
                                    .query(rateplanchargeQuery).getRecords();
                            for (ZObject zRatePlanCharge : ratePlanChargeZList) {
                                if (zRatePlanCharge != null) {
                                    Collection<Entry<String, Object>> ratePlanChargeCollection = zRatePlanCharge
                                            .properties();
                                    ratePlanChargeResultList
                                            .add(getAsHashMap(ratePlanChargeCollection));

                                }
                            }
                            ratePlanMap.put("ratePlanCharges",
                                    ratePlanChargeResultList);
                            ratePlanResultList.add(ratePlanMap);
                        }
                    }
                    subscriptionMap.put("ratePlans", ratePlanResultList);

                    subscriptionResultList.add(subscriptionMap);
                }
            }

            if (subscriptionResultList.size() > 0) {
                accountMap.put("subscriptions", subscriptionResultList);
            }

        } else {
            accountMap.put("error", "Unable to find an account with the id: "
                    + accountId);
        }

        return accountMap;
    }

    @Override
    public Map<String, Object> getInvoice(String invoiceId)
            throws Exception {
        HashMap<String, Object> invoiceMap = new HashMap<String, Object>();
        try {
            Validate.notEmpty(invoiceId);

            String invoiceQuery = "select AccountID,AdjustmentAmount,Amount,AmountWithoutTax,Balance,Comments,CreatedById,CreatedDate,DueDate,IncludesOneTime,IncludesRecurring,IncludesUsage,InvoiceDate,InvoiceNumber,LastEmailSentDate,PaymentAmount,PostedBy,PostedDate,RefundAmount,Source,Status,TargetDate,TaxAmount,TaxExemptAmount,TransferredToAccounting,UpdatedDate from Invoice where id = '"
                    + invoiceId + "'";

            QueryResult invoceQR = this.soap.query(invoiceQuery);
            if (invoceQR.getSize() != 0) {
                Collection<Entry<String, Object>> invoiceCollection = invoceQR
                        .getRecords().get(0).properties();

                invoiceMap = getAsHashMap(invoiceCollection);


                String accountQuery = "select AccountNumber,AdditionalEmailAddresses,AllowInvoiceEdit,AutoPay,Balance,Batch,BillCycleDay,BillToId,CommunicationProfileId,CreditBalance,CrmId,Currency,CustomerServiceRepName,DefaultPaymentMethodId,InvoiceDeliveryPrefsEmail,InvoiceDeliveryPrefsPrint,InvoiceTemplateId,LastInvoiceDate,Name,Notes,ParentId,PaymentGateway,PaymentTerm,PurchaseOrderNumber,SalesRepName,SoldToId,Status,TaxExemptCertificateId,TaxExemptCertificateType,TaxExemptDescription,TaxExemptEffectiveDate,TaxExemptExpirationDate,TaxExemptIssuingJurisdiction,TaxExemptStatus,TotalInvoiceBalance from Account where id = '"
                        + invoiceMap.get("accountId") + "'";
                QueryResult accountQR = this.soap.query(accountQuery);
                if (accountQR.getSize() != 0) {
                    HashMap<String, Object> accountMap = new HashMap<String, Object>();
                    Collection<Entry<String, Object>> accountCollection = accountQR
                            .getRecords().get(0).properties();

                    accountMap = getAsHashMap(accountCollection);
                    invoiceMap.put("account", accountMap);


                    String paymentMethodQuery = "select AchAbaCode,AchAccountName,AchAccountNumberMask,AchAccountType,AchBankName,Active,BankBranchCode,BankCheckDigit,BankCity,BankCode,BankIdentificationNumber,BankName,BankPostalCode,BankStreetName,BankStreetNumber,BankTransferAccountName,BankTransferAccountType,BankTransferType,City,Country,CreditCardAddress1,CreditCardAddress2,CreditCardCity,CreditCardCity,CreditCardExpirationMonth,CreditCardExpirationYear,CreditCardHolderName,CreditCardMaskNumber,CreditCardPostalCode,CreditCardState,CreditCardType,DeviceSessionId,Email,FirstName,IBAN,IPAddress,LastFailedSaleTransactionDate,LastName,LastTransactionDateTime,LastTransactionDateTime,MandateCreationDate,MandateID,MandateReceived,MandateUpdateDate,MaxConsecutivePaymentFailures,Name,NumConsecutiveFailures,PaymentMethodStatus,PaymentRetryWindow,PaypalBaid,PaypalEmail,PaypalPreapprovalKey,PaypalType,Phone,PostalCode,State,StreetName,StreetNumber,TotalNumberOfErrorPayments,TotalNumberOfProcessedPayments,Type,UseDefaultRetryRule from PaymentMethod where id = '"
                            + accountMap.get("defaultPaymentMethodId") + "'";
                    QueryResult paymentMethodQR = this.soap.query(paymentMethodQuery);
                    if (paymentMethodQR.getSize() != 0) {
                        HashMap<String, Object> paymentMethodMap = new HashMap<String, Object>();
                        Collection<Entry<String, Object>> paymentMethodCollection = paymentMethodQR
                                .getRecords().get(0).properties();

                        paymentMethodMap = getAsHashMap(paymentMethodCollection);
                        invoiceMap.put("paymentMethod", paymentMethodMap);



                    }

                    String billToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                            + accountMap.get("billToId") + "'";

                    QueryResult billToQR = this.soap.query(billToQuery);
                    if (billToQR.getSize() != 0) {
                        HashMap<String, Object> billToMap = new HashMap<String, Object>();
                        Collection<Entry<String, Object>> billToCollection = billToQR
                                .getRecords().get(0).properties();

                        billToMap = getAsHashMap(billToCollection);
                        invoiceMap.put("billTo", billToMap);
                    }
                    String soldToQuery = "select AccountId, Address1, Address2, City, Country, County, CreatedById, CreatedDate, Description, Fax, FirstName, HomePhone, LastName, MobilePhone, NickName, OtherPhone, OtherPhoneType, PersonalEmail, PostalCode, State, TaxRegion, UpdatedById, UpdatedDate, WorkEmail, WorkPhone from contact where id='"
                            + accountMap.get("soldToId") + "'";

                    QueryResult soldToQR = this.soap.query(soldToQuery);
                    if (soldToQR.getSize() != 0) {
                        HashMap<String, Object> soldToMap = new HashMap<String, Object>();
                        Collection<Entry<String, Object>> soldToCollection = soldToQR
                                .getRecords().get(0).properties();

                        soldToMap = getAsHashMap(soldToCollection);
                        invoiceMap.put("soldTo", soldToMap);
                    }

                }


                String invoiceItemQuery = "select AccountingCode,ChargeAmount,ChargeDate,ChargeDescription,ChargeName,ChargeNumber,ProcessingType,ProductDescription,ProductId,ProductName,Quantity,RatePlanChargeId,RevRecCode,RevRecStartDate,RevRecTriggerCondition,ServiceEndDate,ServiceStartDate,SKU,SubscriptionId,SubscriptionNumber,TaxAmount,TaxCode,TaxExemptAmount,UnitPrice,UOM from InvoiceItem where invoiceid = '"
                        + invoiceMap.get("id") + "'";

                List<ZObject> invoiceItemZList = this.soap.query(invoiceItemQuery)
                        .getRecords();

                List<Map<String, Object>> invoiceItemResultList = new ArrayList<Map<String, Object>>();
                for (ZObject zInvoiceItem : invoiceItemZList) {

                    if (zInvoiceItem != null) {
                        Collection<Entry<String, Object>> invoiceItemCollection = zInvoiceItem
                                .properties();


                        HashMap<String, Object> invoiceItemMap = getAsHashMap(invoiceItemCollection);

                        String taxationItemQuery = "select AccountingCode,ExemptAmount,Jurisdiction,LocationCode,Name,TaxAmount,TaxCode,TaxCodeDescription,TaxDate,TaxRate,TaxRateDescription,TaxRateType from TaxationItem where invoiceitemid = '"
                                + invoiceItemMap.get("id") + "'";

                        List<ZObject> taxationItemZList = this.soap.query(taxationItemQuery)
                                .getRecords();
                        List<Map<String, Object>> taxationItemResultList = new ArrayList<Map<String, Object>>();
                        for (ZObject taxationItem : taxationItemZList) {
                            if (taxationItem != null) {
                                Collection<Entry<String, Object>> taxationItemCollection = taxationItem.properties();
                                taxationItemResultList.add(getAsHashMap(taxationItemCollection));
                            }
                        }
                        if(!taxationItemResultList.isEmpty()){
                            invoiceItemMap.put("taxationitems", taxationItemResultList);
                        }

                        invoiceItemResultList.add(invoiceItemMap);
                    }
                }
                invoiceMap.put("invoiceitems", invoiceItemResultList);


            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
        return invoiceMap;
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
