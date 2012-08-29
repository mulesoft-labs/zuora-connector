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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.zuora.api.GatewayOptionData;


/**
 * <p>Java class for Refund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Refund">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CancelledOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Gateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayOptionData" type="{http://api.zuora.com/}GatewayOptionData" minOccurs="0"/>
 *         &lt;element name="GatewayResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkedForSubmissionOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MethodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="PaymentMethodId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundTransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SettledOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmittedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransferredToAccounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Refund", propOrder = {
    "accountId",
    "accountingCode",
    "amount",
    "cancelledOn",
    "comment",
    "createdById",
    "createdDate",
    "gateway",
    "gatewayOptionData",
    "gatewayResponse",
    "gatewayResponseCode",
    "gatewayState",
    "markedForSubmissionOn",
    "methodType",
    "paymentId",
    "paymentMethodId",
    "referenceID",
    "refundDate",
    "refundNumber",
    "refundTransactionTime",
    "settledOn",
    "sourceType",
    "status",
    "submittedOn",
    "transferredToAccounting",
    "type",
    "updatedById",
    "updatedDate"
})
public class Refund
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "AccountingCode", nillable = true)
    protected String accountingCode;
    @XmlElement(name = "Amount", nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "CancelledOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledOn;
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Gateway", nillable = true)
    protected String gateway;
    @XmlElement(name = "GatewayOptionData", nillable = true)
    protected GatewayOptionData gatewayOptionData;
    @XmlElement(name = "GatewayResponse", nillable = true)
    protected String gatewayResponse;
    @XmlElement(name = "GatewayResponseCode", nillable = true)
    protected String gatewayResponseCode;
    @XmlElement(name = "GatewayState", nillable = true)
    protected String gatewayState;
    @XmlElement(name = "MarkedForSubmissionOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar markedForSubmissionOn;
    @XmlElement(name = "MethodType", nillable = true)
    protected String methodType;
    @XmlElement(name = "PaymentId", nillable = true)
    protected String paymentId;
    @XmlElement(name = "PaymentMethodId", nillable = true)
    protected String paymentMethodId;
    @XmlElement(name = "ReferenceID", nillable = true)
    protected String referenceID;
    @XmlElement(name = "RefundDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundDate;
    @XmlElement(name = "RefundNumber", nillable = true)
    protected String refundNumber;
    @XmlElement(name = "RefundTransactionTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTransactionTime;
    @XmlElement(name = "SettledOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settledOn;
    @XmlElement(name = "SourceType", nillable = true)
    protected String sourceType;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SubmittedOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedOn;
    @XmlElement(name = "TransferredToAccounting", nillable = true)
    protected String transferredToAccounting;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Sets the value of the accountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCode(String value) {
        this.accountingCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the cancelledOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledOn() {
        return cancelledOn;
    }

    /**
     * Sets the value of the cancelledOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledOn(XMLGregorianCalendar value) {
        this.cancelledOn = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateway(String value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the gatewayOptionData property.
     * 
     * @return
     *     possible object is
     *     {@link GatewayOptionData }
     *     
     */
    public GatewayOptionData getGatewayOptionData() {
        return gatewayOptionData;
    }

    /**
     * Sets the value of the gatewayOptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayOptionData }
     *     
     */
    public void setGatewayOptionData(GatewayOptionData value) {
        this.gatewayOptionData = value;
    }

    /**
     * Gets the value of the gatewayResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayResponse() {
        return gatewayResponse;
    }

    /**
     * Sets the value of the gatewayResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayResponse(String value) {
        this.gatewayResponse = value;
    }

    /**
     * Gets the value of the gatewayResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayResponseCode() {
        return gatewayResponseCode;
    }

    /**
     * Sets the value of the gatewayResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayResponseCode(String value) {
        this.gatewayResponseCode = value;
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
     * Gets the value of the markedForSubmissionOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarkedForSubmissionOn() {
        return markedForSubmissionOn;
    }

    /**
     * Sets the value of the markedForSubmissionOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarkedForSubmissionOn(XMLGregorianCalendar value) {
        this.markedForSubmissionOn = value;
    }

    /**
     * Gets the value of the methodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodType() {
        return methodType;
    }

    /**
     * Sets the value of the methodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodType(String value) {
        this.methodType = value;
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
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the refundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundDate() {
        return refundDate;
    }

    /**
     * Sets the value of the refundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundDate(XMLGregorianCalendar value) {
        this.refundDate = value;
    }

    /**
     * Gets the value of the refundNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundNumber() {
        return refundNumber;
    }

    /**
     * Sets the value of the refundNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundNumber(String value) {
        this.refundNumber = value;
    }

    /**
     * Gets the value of the refundTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundTransactionTime() {
        return refundTransactionTime;
    }

    /**
     * Sets the value of the refundTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundTransactionTime(XMLGregorianCalendar value) {
        this.refundTransactionTime = value;
    }

    /**
     * Gets the value of the settledOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettledOn() {
        return settledOn;
    }

    /**
     * Sets the value of the settledOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettledOn(XMLGregorianCalendar value) {
        this.settledOn = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the submittedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Sets the value of the submittedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedOn(XMLGregorianCalendar value) {
        this.submittedOn = value;
    }

    /**
     * Gets the value of the transferredToAccounting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferredToAccounting() {
        return transferredToAccounting;
    }

    /**
     * Sets the value of the transferredToAccounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferredToAccounting(String value) {
        this.transferredToAccounting = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the updatedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Sets the value of the updatedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedById(String value) {
        this.updatedById = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

}
