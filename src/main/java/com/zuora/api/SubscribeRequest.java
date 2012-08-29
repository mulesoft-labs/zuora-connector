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
import javax.xml.bind.annotation.XmlType;
import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Dynamic;
import com.zuora.api.object.PaymentMethod;


/**
 * <p>Java class for SubscribeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://object.api.zuora.com/}Account" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://object.api.zuora.com/}PaymentMethod" minOccurs="0"/>
 *         &lt;element name="BillToContact" type="{http://object.api.zuora.com/}Contact" minOccurs="0"/>
 *         &lt;element name="PreviewOptions" type="{http://api.zuora.com/}PreviewOptions" minOccurs="0"/>
 *         &lt;element name="SoldToContact" type="{http://object.api.zuora.com/}Contact" minOccurs="0"/>
 *         &lt;element name="SubscribeOptions" type="{http://api.zuora.com/}SubscribeOptions" minOccurs="0"/>
 *         &lt;element name="SubscriptionData" type="{http://api.zuora.com/}SubscriptionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeRequest", propOrder = {
    "account",
    "paymentMethod",
    "billToContact",
    "previewOptions",
    "soldToContact",
    "subscribeOptions",
    "subscriptionData"
})
public class SubscribeRequest
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "PaymentMethod", nillable = true)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "BillToContact", nillable = true)
    protected Contact billToContact;
    @XmlElement(name = "PreviewOptions", nillable = true)
    protected PreviewOptions previewOptions;
    @XmlElement(name = "SoldToContact", nillable = true)
    protected Contact soldToContact;
    @XmlElement(name = "SubscribeOptions", nillable = true)
    protected SubscribeOptions subscribeOptions;
    @XmlElement(name = "SubscriptionData", nillable = true)
    protected SubscriptionData subscriptionData;

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
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the billToContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getBillToContact() {
        return billToContact;
    }

    /**
     * Sets the value of the billToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setBillToContact(Contact value) {
        this.billToContact = value;
    }

    /**
     * Gets the value of the previewOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewOptions }
     *     
     */
    public PreviewOptions getPreviewOptions() {
        return previewOptions;
    }

    /**
     * Sets the value of the previewOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewOptions }
     *     
     */
    public void setPreviewOptions(PreviewOptions value) {
        this.previewOptions = value;
    }

    /**
     * Gets the value of the soldToContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getSoldToContact() {
        return soldToContact;
    }

    /**
     * Sets the value of the soldToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setSoldToContact(Contact value) {
        this.soldToContact = value;
    }

    /**
     * Gets the value of the subscribeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribeOptions }
     *     
     */
    public SubscribeOptions getSubscribeOptions() {
        return subscribeOptions;
    }

    /**
     * Sets the value of the subscribeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribeOptions }
     *     
     */
    public void setSubscribeOptions(SubscribeOptions value) {
        this.subscribeOptions = value;
    }

    /**
     * Gets the value of the subscriptionData property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionData }
     *     
     */
    public SubscriptionData getSubscriptionData() {
        return subscriptionData;
    }

    /**
     * Sets the value of the subscriptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionData }
     *     
     */
    public void setSubscriptionData(SubscriptionData value) {
        this.subscriptionData = value;
    }

}
