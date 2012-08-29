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


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IncludesOneTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludesRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludesUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEmailSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PostedBy" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="PostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransferredToAccounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Invoice", propOrder = {
    "accountId",
    "adjustmentAmount",
    "amount",
    "balance",
    "body",
    "comments",
    "createdById",
    "createdDate",
    "dueDate",
    "includesOneTime",
    "includesRecurring",
    "includesUsage",
    "invoiceDate",
    "invoiceNumber",
    "lastEmailSentDate",
    "paymentAmount",
    "postedBy",
    "postedDate",
    "refundAmount",
    "status",
    "targetDate",
    "transferredToAccounting",
    "updatedById",
    "updatedDate"
})
public class Invoice
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "AdjustmentAmount", nillable = true)
    protected BigDecimal adjustmentAmount;
    @XmlElement(name = "Amount", nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "Balance", nillable = true)
    protected BigDecimal balance;
    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "Comments", nillable = true)
    protected String comments;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DueDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "IncludesOneTime", nillable = true)
    protected Boolean includesOneTime;
    @XmlElement(name = "IncludesRecurring", nillable = true)
    protected Boolean includesRecurring;
    @XmlElement(name = "IncludesUsage", nillable = true)
    protected Boolean includesUsage;
    @XmlElement(name = "InvoiceDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "InvoiceNumber", nillable = true)
    protected String invoiceNumber;
    @XmlElement(name = "LastEmailSentDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastEmailSentDate;
    @XmlElement(name = "PaymentAmount", nillable = true)
    protected BigDecimal paymentAmount;
    @XmlElement(name = "PostedBy", nillable = true)
    protected String postedBy;
    @XmlElement(name = "PostedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDate;
    @XmlElement(name = "RefundAmount", nillable = true)
    protected BigDecimal refundAmount;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "TargetDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetDate;
    @XmlElement(name = "TransferredToAccounting", nillable = true)
    protected String transferredToAccounting;
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
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmount(BigDecimal value) {
        this.adjustmentAmount = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the includesOneTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesOneTime() {
        return includesOneTime;
    }

    /**
     * Sets the value of the includesOneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesOneTime(Boolean value) {
        this.includesOneTime = value;
    }

    /**
     * Gets the value of the includesRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesRecurring() {
        return includesRecurring;
    }

    /**
     * Sets the value of the includesRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesRecurring(Boolean value) {
        this.includesRecurring = value;
    }

    /**
     * Gets the value of the includesUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesUsage() {
        return includesUsage;
    }

    /**
     * Sets the value of the includesUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesUsage(Boolean value) {
        this.includesUsage = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
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
     * Gets the value of the lastEmailSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEmailSentDate() {
        return lastEmailSentDate;
    }

    /**
     * Sets the value of the lastEmailSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastEmailSentDate(XMLGregorianCalendar value) {
        this.lastEmailSentDate = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the postedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedBy() {
        return postedBy;
    }

    /**
     * Sets the value of the postedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedBy(String value) {
        this.postedBy = value;
    }

    /**
     * Gets the value of the postedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Sets the value of the postedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDate(XMLGregorianCalendar value) {
        this.postedDate = value;
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
     * Gets the value of the targetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDate() {
        return targetDate;
    }

    /**
     * Sets the value of the targetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDate(XMLGregorianCalendar value) {
        this.targetDate = value;
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
