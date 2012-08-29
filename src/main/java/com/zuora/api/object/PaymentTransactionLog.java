/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.zuora.api.object;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentTransactionLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransactionLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AVSResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVVResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="RequestString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionLog", propOrder = {
    "avsResponseCode",
    "batchId",
    "cvvResponseCode",
    "gatewayReasonCode",
    "gatewayReasonCodeDescription",
    "gatewayState",
    "gatewayTransactionType",
    "paymentId",
    "requestString",
    "responseString",
    "transactionDate",
    "transactionId"
})
public class PaymentTransactionLog
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AVSResponseCode", nillable = true)
    protected String avsResponseCode;
    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "CVVResponseCode", nillable = true)
    protected String cvvResponseCode;
    @XmlElement(name = "GatewayReasonCode", nillable = true)
    protected String gatewayReasonCode;
    @XmlElement(name = "GatewayReasonCodeDescription", nillable = true)
    protected String gatewayReasonCodeDescription;
    @XmlElement(name = "GatewayState", nillable = true)
    protected String gatewayState;
    @XmlElement(name = "GatewayTransactionType", nillable = true)
    protected String gatewayTransactionType;
    @XmlElement(name = "PaymentId", nillable = true)
    protected String paymentId;
    @XmlElement(name = "RequestString", nillable = true)
    protected String requestString;
    @XmlElement(name = "ResponseString", nillable = true)
    protected String responseString;
    @XmlElement(name = "TransactionDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionId", nillable = true)
    protected String transactionId;

    /**
     * Gets the value of the avsResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSResponseCode() {
        return avsResponseCode;
    }

    /**
     * Sets the value of the avsResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSResponseCode(String value) {
        this.avsResponseCode = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the cvvResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVVResponseCode() {
        return cvvResponseCode;
    }

    /**
     * Sets the value of the cvvResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVVResponseCode(String value) {
        this.cvvResponseCode = value;
    }

    /**
     * Gets the value of the gatewayReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayReasonCode() {
        return gatewayReasonCode;
    }

    /**
     * Sets the value of the gatewayReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayReasonCode(String value) {
        this.gatewayReasonCode = value;
    }

    /**
     * Gets the value of the gatewayReasonCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayReasonCodeDescription() {
        return gatewayReasonCodeDescription;
    }

    /**
     * Sets the value of the gatewayReasonCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayReasonCodeDescription(String value) {
        this.gatewayReasonCodeDescription = value;
    }

    /**
     * Gets the value of the gatewayState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayState() {
        return gatewayState;
    }

    /**
     * Sets the value of the gatewayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayState(String value) {
        this.gatewayState = value;
    }

    /**
     * Gets the value of the gatewayTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayTransactionType() {
        return gatewayTransactionType;
    }

    /**
     * Sets the value of the gatewayTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayTransactionType(String value) {
        this.gatewayTransactionType = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the requestString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestString() {
        return requestString;
    }

    /**
     * Sets the value of the requestString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestString(String value) {
        this.requestString = value;
    }

    /**
     * Gets the value of the responseString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseString() {
        return responseString;
    }

    /**
     * Sets the value of the responseString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseString(String value) {
        this.responseString = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
