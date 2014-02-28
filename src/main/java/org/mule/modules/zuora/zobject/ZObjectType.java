/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zobject;

import com.zuora.api.object.Account;
import com.zuora.api.object.AccountingCode;
import com.zuora.api.object.Amendment;
import com.zuora.api.object.CommunicationProfile;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Export;
import com.zuora.api.object.GatewayOption;
import com.zuora.api.object.Import;
import com.zuora.api.object.Invoice;
import com.zuora.api.object.InvoiceAdjustment;
import com.zuora.api.object.InvoiceItem;
import com.zuora.api.object.InvoiceItemAdjustment;
import com.zuora.api.object.InvoicePayment;
import com.zuora.api.object.Payment;
import com.zuora.api.object.PaymentMethod;
import com.zuora.api.object.PaymentTransactionLog;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.RatePlanCharge;
import com.zuora.api.object.RatePlanChargeTier;
import com.zuora.api.object.Refund;
import com.zuora.api.object.CreditBalanceAdjustment;
import com.zuora.api.object.RefundInvoicePayment;
import com.zuora.api.object.RefundTransactionLog;
import com.zuora.api.object.Subscription;
import com.zuora.api.object.TaxationItem;
import com.zuora.api.object.Usage;
import com.zuora.api.object.ZObject;

/**
 * Enumeration of available ZObject classes. 
 * @author flbulgarelli
 */
public enum ZObjectType
{
    Account(Account.class),
    AccountingCode(AccountingCode.class),
    InvoiceAdjustment(InvoiceAdjustment.class),
    Amendment(Amendment.class),
    Invoice(Invoice.class),
    InvoiceItem(InvoiceItem.class),
    InvoicePayment(InvoicePayment.class),
    Import(Import.class),
    Payment(Payment.class),
    Product(Product.class),
    ProductRatePlan(ProductRatePlan.class),
    ProductRatePlanCharge(ProductRatePlanCharge.class),
    ProductRatePlanChargeTier(ProductRatePlanChargeTier.class),
    RatePlan(RatePlan.class),
    RatePlanCharge(RatePlanCharge.class),
    RatePlanChargeTier(RatePlanChargeTier.class),
    TaxationItem(TaxationItem.class),
    Usage(Usage.class),
    Refund(Refund.class),
    RefundInvoicePayment(RefundInvoicePayment.class),
    CreditBalanceAdjustment(CreditBalanceAdjustment.class),
    Export(Export.class),
    InvoiceItemAdjustment(InvoiceItemAdjustment.class),
    CommunicationProfile(CommunicationProfile.class),
    RefundTransactionLog(RefundTransactionLog.class),
    PaymentTransactionLog(PaymentTransactionLog.class),
    GatewayOption(GatewayOption.class),
    Contact(Contact.class),
    PaymentMethod(PaymentMethod.class),
    Subscription(Subscription.class);

    
    private Class<? extends ZObject> clazz;

    private ZObjectType(Class<? extends ZObject> clazz)
    {
        this.clazz = clazz;
    }

    /**
     * Currently this attribute has no usage. It is here just to ensure that 
     * each object has a corresponding class
     * @return the associated class
     */
    public Class<? extends ZObject> getZObjectClass()
    {
        return clazz;
    }

    public String getTypeName()
    {
        return name();
    }

    public ZObject newInstance()
    {
        try
        {
            return clazz.newInstance();
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }

}
