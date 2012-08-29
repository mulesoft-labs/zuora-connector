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
import com.zuora.api.RatePlanData;


/**
 * <p>Java class for Amendment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amendment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AutoRenew" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomerAcceptanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InitialTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanData" type="{http://api.zuora.com/}RatePlanData" minOccurs="0"/>
 *         &lt;element name="RenewalTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServiceActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="TermStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TermType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Amendment", propOrder = {
    "autoRenew",
    "code",
    "contractEffectiveDate",
    "createdById",
    "createdDate",
    "customerAcceptanceDate",
    "description",
    "effectiveDate",
    "initialTerm",
    "name",
    "ratePlanData",
    "renewalTerm",
    "serviceActivationDate",
    "status",
    "subscriptionId",
    "termStartDate",
    "termType",
    "type",
    "updatedById",
    "updatedDate"
})
public class Amendment
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AutoRenew", nillable = true)
    protected Boolean autoRenew;
    @XmlElement(name = "Code", nillable = true)
    protected String code;
    @XmlElement(name = "ContractEffectiveDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEffectiveDate;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CustomerAcceptanceDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerAcceptanceDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "EffectiveDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "InitialTerm", nillable = true)
    protected Long initialTerm;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "RatePlanData", nillable = true)
    protected RatePlanData ratePlanData;
    @XmlElement(name = "RenewalTerm", nillable = true)
    protected Long renewalTerm;
    @XmlElement(name = "ServiceActivationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceActivationDate;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SubscriptionId", nillable = true)
    protected String subscriptionId;
    @XmlElement(name = "TermStartDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termStartDate;
    @XmlElement(name = "TermType", nillable = true)
    protected String termType;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Gets the value of the autoRenew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * Sets the value of the autoRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRenew(Boolean value) {
        this.autoRenew = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the contractEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    /**
     * Sets the value of the contractEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEffectiveDate(XMLGregorianCalendar value) {
        this.contractEffectiveDate = value;
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
     * Gets the value of the customerAcceptanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerAcceptanceDate() {
        return customerAcceptanceDate;
    }

    /**
     * Sets the value of the customerAcceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerAcceptanceDate(XMLGregorianCalendar value) {
        this.customerAcceptanceDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the initialTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialTerm() {
        return initialTerm;
    }

    /**
     * Sets the value of the initialTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialTerm(Long value) {
        this.initialTerm = value;
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
     * Gets the value of the ratePlanData property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanData }
     *     
     */
    public RatePlanData getRatePlanData() {
        return ratePlanData;
    }

    /**
     * Sets the value of the ratePlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanData }
     *     
     */
    public void setRatePlanData(RatePlanData value) {
        this.ratePlanData = value;
    }

    /**
     * Gets the value of the renewalTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRenewalTerm() {
        return renewalTerm;
    }

    /**
     * Sets the value of the renewalTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRenewalTerm(Long value) {
        this.renewalTerm = value;
    }

    /**
     * Gets the value of the serviceActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceActivationDate() {
        return serviceActivationDate;
    }

    /**
     * Sets the value of the serviceActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceActivationDate(XMLGregorianCalendar value) {
        this.serviceActivationDate = value;
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
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the termStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermStartDate() {
        return termStartDate;
    }

    /**
     * Sets the value of the termStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermStartDate(XMLGregorianCalendar value) {
        this.termStartDate = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
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
