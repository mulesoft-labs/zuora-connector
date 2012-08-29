/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.zuora.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.zuora.api.object.Account;
import com.zuora.api.object.Amendment;
import com.zuora.api.object.CommunicationProfile;
import com.zuora.api.object.CreditBalanceAdjustment;
import com.zuora.api.object.Dynamic;
import com.zuora.api.object.Export;
import com.zuora.api.object.Invoice;
import com.zuora.api.object.InvoiceAdjustment;
import com.zuora.api.object.InvoiceItem;
import com.zuora.api.object.InvoiceItemAdjustment;
import com.zuora.api.object.InvoicePayment;
import com.zuora.api.object.Payment;
import com.zuora.api.object.Product;
import com.zuora.api.object.ProductRatePlan;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.RatePlan;
import com.zuora.api.object.RatePlanCharge;
import com.zuora.api.object.RatePlanChargeTier;
import com.zuora.api.object.Refund;
import com.zuora.api.object.RefundInvoicePayment;
import com.zuora.api.object.Usage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://object.api.zuora.com/}Account" minOccurs="0"/>
 *         &lt;element name="InvoiceAdjustment" type="{http://object.api.zuora.com/}InvoiceAdjustment" minOccurs="0"/>
 *         &lt;element name="Amendment" type="{http://object.api.zuora.com/}Amendment" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://object.api.zuora.com/}Invoice" minOccurs="0"/>
 *         &lt;element name="InvoiceItem" type="{http://object.api.zuora.com/}InvoiceItem" minOccurs="0"/>
 *         &lt;element name="InvoicePayment" type="{http://object.api.zuora.com/}InvoicePayment" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://object.api.zuora.com/}Payment" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://object.api.zuora.com/}Product" minOccurs="0"/>
 *         &lt;element name="ProductRatePlan" type="{http://object.api.zuora.com/}ProductRatePlan" minOccurs="0"/>
 *         &lt;element name="ProductRatePlanCharge" type="{http://object.api.zuora.com/}ProductRatePlanCharge" minOccurs="0"/>
 *         &lt;element name="ProductRatePlanChargeTier" type="{http://object.api.zuora.com/}ProductRatePlanChargeTier" minOccurs="0"/>
 *         &lt;element name="RatePlan" type="{http://object.api.zuora.com/}RatePlan" minOccurs="0"/>
 *         &lt;element name="RatePlanCharge" type="{http://object.api.zuora.com/}RatePlanCharge" minOccurs="0"/>
 *         &lt;element name="RatePlanChargeTier" type="{http://object.api.zuora.com/}RatePlanChargeTier" minOccurs="0"/>
 *         &lt;element name="Usage" type="{http://object.api.zuora.com/}Usage" minOccurs="0"/>
 *         &lt;element name="Refund" type="{http://object.api.zuora.com/}Refund" minOccurs="0"/>
 *         &lt;element name="RefundInvoicePayment" type="{http://object.api.zuora.com/}RefundInvoicePayment" minOccurs="0"/>
 *         &lt;element name="CreditBalanceAdjustment" type="{http://object.api.zuora.com/}CreditBalanceAdjustment" minOccurs="0"/>
 *         &lt;element name="Export" type="{http://object.api.zuora.com/}Export" minOccurs="0"/>
 *         &lt;element name="InvoiceItemAdjustment" type="{http://object.api.zuora.com/}InvoiceItemAdjustment" minOccurs="0"/>
 *         &lt;element name="CommunicationProfile" type="{http://object.api.zuora.com/}CommunicationProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "account",
    "invoiceAdjustment",
    "amendment",
    "invoice",
    "invoiceItem",
    "invoicePayment",
    "payment",
    "product",
    "productRatePlan",
    "productRatePlanCharge",
    "productRatePlanChargeTier",
    "ratePlan",
    "ratePlanCharge",
    "ratePlanChargeTier",
    "usage",
    "refund",
    "refundInvoicePayment",
    "creditBalanceAdjustment",
    "export",
    "invoiceItemAdjustment",
    "communicationProfile"
})
@XmlRootElement(name = "DummyHeader")
public class DummyHeader
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "InvoiceAdjustment", nillable = true)
    protected InvoiceAdjustment invoiceAdjustment;
    @XmlElement(name = "Amendment", nillable = true)
    protected Amendment amendment;
    @XmlElement(name = "Invoice", nillable = true)
    protected Invoice invoice;
    @XmlElement(name = "InvoiceItem", nillable = true)
    protected InvoiceItem invoiceItem;
    @XmlElement(name = "InvoicePayment", nillable = true)
    protected InvoicePayment invoicePayment;
    @XmlElement(name = "Payment", nillable = true)
    protected Payment payment;
    @XmlElement(name = "Product", nillable = true)
    protected Product product;
    @XmlElement(name = "ProductRatePlan", nillable = true)
    protected ProductRatePlan productRatePlan;
    @XmlElement(name = "ProductRatePlanCharge", nillable = true)
    protected ProductRatePlanCharge productRatePlanCharge;
    @XmlElement(name = "ProductRatePlanChargeTier", nillable = true)
    protected ProductRatePlanChargeTier productRatePlanChargeTier;
    @XmlElement(name = "RatePlan", nillable = true)
    protected RatePlan ratePlan;
    @XmlElement(name = "RatePlanCharge", nillable = true)
    protected RatePlanCharge ratePlanCharge;
    @XmlElement(name = "RatePlanChargeTier", nillable = true)
    protected RatePlanChargeTier ratePlanChargeTier;
    @XmlElement(name = "Usage", nillable = true)
    protected Usage usage;
    @XmlElement(name = "Refund", nillable = true)
    protected Refund refund;
    @XmlElement(name = "RefundInvoicePayment", nillable = true)
    protected RefundInvoicePayment refundInvoicePayment;
    @XmlElement(name = "CreditBalanceAdjustment", nillable = true)
    protected CreditBalanceAdjustment creditBalanceAdjustment;
    @XmlElement(name = "Export", nillable = true)
    protected Export export;
    @XmlElement(name = "InvoiceItemAdjustment", nillable = true)
    protected InvoiceItemAdjustment invoiceItemAdjustment;
    @XmlElement(name = "CommunicationProfile", nillable = true)
    protected CommunicationProfile communicationProfile;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the invoiceAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAdjustment }
     *     
     */
    public InvoiceAdjustment getInvoiceAdjustment() {
        return invoiceAdjustment;
    }

    /**
     * Sets the value of the invoiceAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAdjustment }
     *     
     */
    public void setInvoiceAdjustment(InvoiceAdjustment value) {
        this.invoiceAdjustment = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment }
     *     
     */
    public Amendment getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment }
     *     
     */
    public void setAmendment(Amendment value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the invoiceItem property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItem }
     *     
     */
    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * Sets the value of the invoiceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItem }
     *     
     */
    public void setInvoiceItem(InvoiceItem value) {
        this.invoiceItem = value;
    }

    /**
     * Gets the value of the invoicePayment property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePayment }
     *     
     */
    public InvoicePayment getInvoicePayment() {
        return invoicePayment;
    }

    /**
     * Sets the value of the invoicePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePayment }
     *     
     */
    public void setInvoicePayment(InvoicePayment value) {
        this.invoicePayment = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the productRatePlan property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRatePlan }
     *     
     */
    public ProductRatePlan getProductRatePlan() {
        return productRatePlan;
    }

    /**
     * Sets the value of the productRatePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRatePlan }
     *     
     */
    public void setProductRatePlan(ProductRatePlan value) {
        this.productRatePlan = value;
    }

    /**
     * Gets the value of the productRatePlanCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRatePlanCharge }
     *     
     */
    public ProductRatePlanCharge getProductRatePlanCharge() {
        return productRatePlanCharge;
    }

    /**
     * Sets the value of the productRatePlanCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRatePlanCharge }
     *     
     */
    public void setProductRatePlanCharge(ProductRatePlanCharge value) {
        this.productRatePlanCharge = value;
    }

    /**
     * Gets the value of the productRatePlanChargeTier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRatePlanChargeTier }
     *     
     */
    public ProductRatePlanChargeTier getProductRatePlanChargeTier() {
        return productRatePlanChargeTier;
    }

    /**
     * Sets the value of the productRatePlanChargeTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRatePlanChargeTier }
     *     
     */
    public void setProductRatePlanChargeTier(ProductRatePlanChargeTier value) {
        this.productRatePlanChargeTier = value;
    }

    /**
     * Gets the value of the ratePlan property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlan }
     *     
     */
    public RatePlan getRatePlan() {
        return ratePlan;
    }

    /**
     * Sets the value of the ratePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlan }
     *     
     */
    public void setRatePlan(RatePlan value) {
        this.ratePlan = value;
    }

    /**
     * Gets the value of the ratePlanCharge property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanCharge }
     *     
     */
    public RatePlanCharge getRatePlanCharge() {
        return ratePlanCharge;
    }

    /**
     * Sets the value of the ratePlanCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanCharge }
     *     
     */
    public void setRatePlanCharge(RatePlanCharge value) {
        this.ratePlanCharge = value;
    }

    /**
     * Gets the value of the ratePlanChargeTier property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanChargeTier }
     *     
     */
    public RatePlanChargeTier getRatePlanChargeTier() {
        return ratePlanChargeTier;
    }

    /**
     * Sets the value of the ratePlanChargeTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanChargeTier }
     *     
     */
    public void setRatePlanChargeTier(RatePlanChargeTier value) {
        this.ratePlanChargeTier = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Usage }
     *     
     */
    public Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage }
     *     
     */
    public void setUsage(Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Refund }
     *     
     */
    public Refund getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refund }
     *     
     */
    public void setRefund(Refund value) {
        this.refund = value;
    }

    /**
     * Gets the value of the refundInvoicePayment property.
     * 
     * @return
     *     possible object is
     *     {@link RefundInvoicePayment }
     *     
     */
    public RefundInvoicePayment getRefundInvoicePayment() {
        return refundInvoicePayment;
    }

    /**
     * Sets the value of the refundInvoicePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundInvoicePayment }
     *     
     */
    public void setRefundInvoicePayment(RefundInvoicePayment value) {
        this.refundInvoicePayment = value;
    }

    /**
     * Gets the value of the creditBalanceAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link CreditBalanceAdjustment }
     *     
     */
    public CreditBalanceAdjustment getCreditBalanceAdjustment() {
        return creditBalanceAdjustment;
    }

    /**
     * Sets the value of the creditBalanceAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditBalanceAdjustment }
     *     
     */
    public void setCreditBalanceAdjustment(CreditBalanceAdjustment value) {
        this.creditBalanceAdjustment = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link Export }
     *     
     */
    public Export getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link Export }
     *     
     */
    public void setExport(Export value) {
        this.export = value;
    }

    /**
     * Gets the value of the invoiceItemAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemAdjustment }
     *     
     */
    public InvoiceItemAdjustment getInvoiceItemAdjustment() {
        return invoiceItemAdjustment;
    }

    /**
     * Sets the value of the invoiceItemAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemAdjustment }
     *     
     */
    public void setInvoiceItemAdjustment(InvoiceItemAdjustment value) {
        this.invoiceItemAdjustment = value;
    }

    /**
     * Gets the value of the communicationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationProfile }
     *     
     */
    public CommunicationProfile getCommunicationProfile() {
        return communicationProfile;
    }

    /**
     * Sets the value of the communicationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationProfile }
     *     
     */
    public void setCommunicationProfile(CommunicationProfile value) {
        this.communicationProfile = value;
    }

}
