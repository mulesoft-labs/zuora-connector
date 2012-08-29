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
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AppliedCreditBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AppliedInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AuthTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelledOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GatewayOptionData" type="{http://api.zuora.com/}GatewayOptionData" minOccurs="0"/>
 *         &lt;element name="GatewayOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkedForSubmissionOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethodId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SecondPaymentReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettledOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "Payment", propOrder = {
    "accountId",
    "accountingCode",
    "amount",
    "appliedCreditBalanceAmount",
    "appliedInvoiceAmount",
    "authTransactionId",
    "bankIdentificationNumber",
    "cancelledOn",
    "comment",
    "createdById",
    "createdDate",
    "effectiveDate",
    "gatewayOptionData",
    "gatewayOrderId",
    "gatewayResponse",
    "gatewayResponseCode",
    "gatewayState",
    "invoiceId",
    "invoiceNumber",
    "markedForSubmissionOn",
    "paymentMethodId",
    "paymentNumber",
    "referenceId",
    "refundAmount",
    "secondPaymentReferenceId",
    "settledOn",
    "status",
    "submittedOn",
    "transferredToAccounting",
    "type",
    "updatedById",
    "updatedDate"
})
public class Payment
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
    @XmlElement(name = "AppliedCreditBalanceAmount", nillable = true)
    protected BigDecimal appliedCreditBalanceAmount;
    @XmlElement(name = "AppliedInvoiceAmount", nillable = true)
    protected BigDecimal appliedInvoiceAmount;
    @XmlElement(name = "AuthTransactionId", nillable = true)
    protected String authTransactionId;
    @XmlElement(name = "BankIdentificationNumber", nillable = true)
    protected String bankIdentificationNumber;
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
    @XmlElement(name = "EffectiveDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "GatewayOptionData", nillable = true)
    protected GatewayOptionData gatewayOptionData;
    @XmlElement(name = "GatewayOrderId", nillable = true)
    protected String gatewayOrderId;
    @XmlElement(name = "GatewayResponse", nillable = true)
    protected String gatewayResponse;
    @XmlElement(name = "GatewayResponseCode", nillable = true)
    protected String gatewayResponseCode;
    @XmlElement(name = "GatewayState", nillable = true)
    protected String gatewayState;
    @XmlElement(name = "InvoiceId", nillable = true)
    protected String invoiceId;
    @XmlElement(name = "InvoiceNumber", nillable = true)
    protected String invoiceNumber;
    @XmlElement(name = "MarkedForSubmissionOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar markedForSubmissionOn;
    @XmlElement(name = "PaymentMethodId", nillable = true)
    protected String paymentMethodId;
    @XmlElement(name = "PaymentNumber", nillable = true)
    protected String paymentNumber;
    @XmlElement(name = "ReferenceId", nillable = true)
    protected String referenceId;
    @XmlElement(name = "RefundAmount", nillable = true)
    protected BigDecimal refundAmount;
    @XmlElement(name = "SecondPaymentReferenceId", nillable = true)
    protected String secondPaymentReferenceId;
    @XmlElement(name = "SettledOn", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settledOn;
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
     * Gets the value of the appliedCreditBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppliedCreditBalanceAmount() {
        return appliedCreditBalanceAmount;
    }

    /**
     * Sets the value of the appliedCreditBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppliedCreditBalanceAmount(BigDecimal value) {
        this.appliedCreditBalanceAmount = value;
    }

    /**
     * Gets the value of the appliedInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppliedInvoiceAmount() {
        return appliedInvoiceAmount;
    }

    /**
     * Sets the value of the appliedInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppliedInvoiceAmount(BigDecimal value) {
        this.appliedInvoiceAmount = value;
    }

    /**
     * Gets the value of the authTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTransactionId() {
        return authTransactionId;
    }

    /**
     * Sets the value of the authTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTransactionId(String value) {
        this.authTransactionId = value;
    }

    /**
     * Gets the value of the bankIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdentificationNumber() {
        return bankIdentificationNumber;
    }

    /**
     * Sets the value of the bankIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdentificationNumber(String value) {
        this.bankIdentificationNumber = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the gatewayOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayOrderId() {
        return gatewayOrderId;
    }

    /**
     * Sets the value of the gatewayOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayOrderId(String value) {
        this.gatewayOrderId = value;
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
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
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
     * Gets the value of the paymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Sets the value of the paymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNumber(String value) {
        this.paymentNumber = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmount(BigDecimal value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the secondPaymentReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPaymentReferenceId() {
        return secondPaymentReferenceId;
    }

    /**
     * Sets the value of the secondPaymentReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPaymentReferenceId(String value) {
        this.secondPaymentReferenceId = value;
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
