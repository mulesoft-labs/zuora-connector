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
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalEmailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowInvoiceEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCycleDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillToId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CommunicationProfileId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerServiceRepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultPaymentMethodId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="InvoiceDeliveryPrefsEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceDeliveryPrefsPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceTemplateId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="LastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="PaymentGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalInvoiceBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "Account", propOrder = {
    "accountNumber",
    "additionalEmailAddresses",
    "allowInvoiceEdit",
    "autoPay",
    "balance",
    "batch",
    "billCycleDay",
    "billToId",
    "communicationProfileId",
    "createdById",
    "createdDate",
    "creditBalance",
    "crmId",
    "currency",
    "customerServiceRepName",
    "defaultPaymentMethodId",
    "invoiceDeliveryPrefsEmail",
    "invoiceDeliveryPrefsPrint",
    "invoiceTemplateId",
    "lastInvoiceDate",
    "name",
    "notes",
    "parentId",
    "paymentGateway",
    "paymentTerm",
    "purchaseOrderNumber",
    "salesRepName",
    "soldToId",
    "status",
    "totalInvoiceBalance",
    "updatedById",
    "updatedDate"
})
public class Account
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "AdditionalEmailAddresses", nillable = true)
    protected String additionalEmailAddresses;
    @XmlElement(name = "AllowInvoiceEdit", nillable = true)
    protected Boolean allowInvoiceEdit;
    @XmlElement(name = "AutoPay", nillable = true)
    protected Boolean autoPay;
    @XmlElement(name = "Balance", nillable = true)
    protected BigDecimal balance;
    @XmlElement(name = "Batch", nillable = true)
    protected String batch;
    @XmlElement(name = "BillCycleDay")
    protected Integer billCycleDay;
    @XmlElement(name = "BillToId", nillable = true)
    protected String billToId;
    @XmlElement(name = "CommunicationProfileId", nillable = true)
    protected String communicationProfileId;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreditBalance", nillable = true)
    protected BigDecimal creditBalance;
    @XmlElement(name = "CrmId", nillable = true)
    protected String crmId;
    @XmlElement(name = "Currency", nillable = true)
    protected String currency;
    @XmlElement(name = "CustomerServiceRepName", nillable = true)
    protected String customerServiceRepName;
    @XmlElement(name = "DefaultPaymentMethodId", nillable = true)
    protected String defaultPaymentMethodId;
    @XmlElement(name = "InvoiceDeliveryPrefsEmail", nillable = true)
    protected Boolean invoiceDeliveryPrefsEmail;
    @XmlElement(name = "InvoiceDeliveryPrefsPrint", nillable = true)
    protected Boolean invoiceDeliveryPrefsPrint;
    @XmlElement(name = "InvoiceTemplateId", nillable = true)
    protected String invoiceTemplateId;
    @XmlElement(name = "LastInvoiceDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastInvoiceDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "ParentId", nillable = true)
    protected String parentId;
    @XmlElement(name = "PaymentGateway", nillable = true)
    protected String paymentGateway;
    @XmlElement(name = "PaymentTerm", nillable = true)
    protected String paymentTerm;
    @XmlElement(name = "PurchaseOrderNumber", nillable = true)
    protected String purchaseOrderNumber;
    @XmlElement(name = "SalesRepName", nillable = true)
    protected String salesRepName;
    @XmlElement(name = "SoldToId", nillable = true)
    protected String soldToId;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "TotalInvoiceBalance", nillable = true)
    protected BigDecimal totalInvoiceBalance;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the additionalEmailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalEmailAddresses() {
        return additionalEmailAddresses;
    }

    /**
     * Sets the value of the additionalEmailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEmailAddresses(String value) {
        this.additionalEmailAddresses = value;
    }

    /**
     * Gets the value of the allowInvoiceEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowInvoiceEdit() {
        return allowInvoiceEdit;
    }

    /**
     * Sets the value of the allowInvoiceEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInvoiceEdit(Boolean value) {
        this.allowInvoiceEdit = value;
    }

    /**
     * Gets the value of the autoPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * Sets the value of the autoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
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
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * Gets the value of the billCycleDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillCycleDay() {
        return billCycleDay;
    }

    /**
     * Sets the value of the billCycleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillCycleDay(Integer value) {
        this.billCycleDay = value;
    }

    /**
     * Gets the value of the billToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToId() {
        return billToId;
    }

    /**
     * Sets the value of the billToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToId(String value) {
        this.billToId = value;
    }

    /**
     * Gets the value of the communicationProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationProfileId() {
        return communicationProfileId;
    }

    /**
     * Sets the value of the communicationProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationProfileId(String value) {
        this.communicationProfileId = value;
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
     * Gets the value of the creditBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    /**
     * Sets the value of the creditBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditBalance(BigDecimal value) {
        this.creditBalance = value;
    }

    /**
     * Gets the value of the crmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmId() {
        return crmId;
    }

    /**
     * Sets the value of the crmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmId(String value) {
        this.crmId = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customerServiceRepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceRepName() {
        return customerServiceRepName;
    }

    /**
     * Sets the value of the customerServiceRepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceRepName(String value) {
        this.customerServiceRepName = value;
    }

    /**
     * Gets the value of the defaultPaymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPaymentMethodId() {
        return defaultPaymentMethodId;
    }

    /**
     * Sets the value of the defaultPaymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPaymentMethodId(String value) {
        this.defaultPaymentMethodId = value;
    }

    /**
     * Gets the value of the invoiceDeliveryPrefsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiceDeliveryPrefsEmail() {
        return invoiceDeliveryPrefsEmail;
    }

    /**
     * Sets the value of the invoiceDeliveryPrefsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiceDeliveryPrefsEmail(Boolean value) {
        this.invoiceDeliveryPrefsEmail = value;
    }

    /**
     * Gets the value of the invoiceDeliveryPrefsPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiceDeliveryPrefsPrint() {
        return invoiceDeliveryPrefsPrint;
    }

    /**
     * Sets the value of the invoiceDeliveryPrefsPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiceDeliveryPrefsPrint(Boolean value) {
        this.invoiceDeliveryPrefsPrint = value;
    }

    /**
     * Gets the value of the invoiceTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTemplateId() {
        return invoiceTemplateId;
    }

    /**
     * Sets the value of the invoiceTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTemplateId(String value) {
        this.invoiceTemplateId = value;
    }

    /**
     * Gets the value of the lastInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }

    /**
     * Sets the value of the lastInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoiceDate(XMLGregorianCalendar value) {
        this.lastInvoiceDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the paymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentGateway() {
        return paymentGateway;
    }

    /**
     * Sets the value of the paymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentGateway(String value) {
        this.paymentGateway = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the salesRepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName() {
        return salesRepName;
    }

    /**
     * Sets the value of the salesRepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName(String value) {
        this.salesRepName = value;
    }

    /**
     * Gets the value of the soldToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToId() {
        return soldToId;
    }

    /**
     * Sets the value of the soldToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToId(String value) {
        this.soldToId = value;
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
     * Gets the value of the totalInvoiceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalInvoiceBalance() {
        return totalInvoiceBalance;
    }

    /**
     * Sets the value of the totalInvoiceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalInvoiceBalance(BigDecimal value) {
        this.totalInvoiceBalance = value;
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
