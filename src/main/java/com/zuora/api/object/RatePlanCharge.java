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
 * <p>Java class for RatePlanCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyDiscountTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCycleDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingPeriodAlignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargedThroughDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChargeModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DMRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DTCV" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IncludedUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsLastSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MRR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="OverageCalculationOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OveragePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverageUnusedUnitsCreditOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceIncreasePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProcessedThroughDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProductRatePlanChargeId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RatePlanId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="RolloverBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TCV" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TriggerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TriggerEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnusedUnitsCreditRates" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpToPeriods" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanCharge", propOrder = {
    "accountingCode",
    "applyDiscountTo",
    "billCycleDay",
    "billCycleType",
    "billingPeriodAlignment",
    "chargedThroughDate",
    "chargeModel",
    "chargeNumber",
    "chargeType",
    "createdById",
    "createdDate",
    "description",
    "discountAmount",
    "discountLevel",
    "discountPercentage",
    "dmrc",
    "dtcv",
    "effectiveEndDate",
    "effectiveStartDate",
    "includedUnits",
    "isLastSegment",
    "mrr",
    "name",
    "numberOfPeriods",
    "originalId",
    "overageCalculationOption",
    "overagePrice",
    "overageUnusedUnitsCreditOption",
    "price",
    "priceIncreasePercentage",
    "processedThroughDate",
    "productRatePlanChargeId",
    "quantity",
    "ratePlanId",
    "rolloverBalance",
    "segment",
    "tcv",
    "triggerDate",
    "triggerEvent",
    "unusedUnitsCreditRates",
    "uom",
    "updatedById",
    "updatedDate",
    "upToPeriods",
    "version"
})
public class RatePlanCharge
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountingCode", nillable = true)
    protected String accountingCode;
    @XmlElement(name = "ApplyDiscountTo", nillable = true)
    protected String applyDiscountTo;
    @XmlElement(name = "BillCycleDay", nillable = true)
    protected Integer billCycleDay;
    @XmlElement(name = "BillCycleType", nillable = true)
    protected String billCycleType;
    @XmlElement(name = "BillingPeriodAlignment", nillable = true)
    protected String billingPeriodAlignment;
    @XmlElement(name = "ChargedThroughDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargedThroughDate;
    @XmlElement(name = "ChargeModel", nillable = true)
    protected String chargeModel;
    @XmlElement(name = "ChargeNumber", nillable = true)
    protected String chargeNumber;
    @XmlElement(name = "ChargeType", nillable = true)
    protected String chargeType;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DiscountAmount", nillable = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountLevel", nillable = true)
    protected String discountLevel;
    @XmlElement(name = "DiscountPercentage", nillable = true)
    protected BigDecimal discountPercentage;
    @XmlElement(name = "DMRC", nillable = true)
    protected BigDecimal dmrc;
    @XmlElement(name = "DTCV", nillable = true)
    protected BigDecimal dtcv;
    @XmlElement(name = "EffectiveEndDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EffectiveStartDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "IncludedUnits", nillable = true)
    protected BigDecimal includedUnits;
    @XmlElement(name = "IsLastSegment", nillable = true)
    protected Boolean isLastSegment;
    @XmlElement(name = "MRR", nillable = true)
    protected BigDecimal mrr;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NumberOfPeriods", nillable = true)
    protected Long numberOfPeriods;
    @XmlElement(name = "OriginalId", nillable = true)
    protected String originalId;
    @XmlElement(name = "OverageCalculationOption", nillable = true)
    protected String overageCalculationOption;
    @XmlElement(name = "OveragePrice", nillable = true)
    protected BigDecimal overagePrice;
    @XmlElement(name = "OverageUnusedUnitsCreditOption", nillable = true)
    protected String overageUnusedUnitsCreditOption;
    @XmlElement(name = "Price", nillable = true)
    protected BigDecimal price;
    @XmlElement(name = "PriceIncreasePercentage", nillable = true)
    protected BigDecimal priceIncreasePercentage;
    @XmlElement(name = "ProcessedThroughDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedThroughDate;
    @XmlElement(name = "ProductRatePlanChargeId", nillable = true)
    protected String productRatePlanChargeId;
    @XmlElement(name = "Quantity", nillable = true)
    protected BigDecimal quantity;
    @XmlElement(name = "RatePlanId", nillable = true)
    protected String ratePlanId;
    @XmlElement(name = "RolloverBalance", nillable = true)
    protected BigDecimal rolloverBalance;
    @XmlElement(name = "Segment", nillable = true)
    protected Integer segment;
    @XmlElement(name = "TCV", nillable = true)
    protected BigDecimal tcv;
    @XmlElement(name = "TriggerDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triggerDate;
    @XmlElement(name = "TriggerEvent", nillable = true)
    protected String triggerEvent;
    @XmlElement(name = "UnusedUnitsCreditRates", nillable = true)
    protected BigDecimal unusedUnitsCreditRates;
    @XmlElement(name = "UOM", nillable = true)
    protected String uom;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UpToPeriods", nillable = true)
    protected Long upToPeriods;
    @XmlElement(name = "Version", nillable = true)
    protected Long version;

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
     * Gets the value of the applyDiscountTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDiscountTo() {
        return applyDiscountTo;
    }

    /**
     * Sets the value of the applyDiscountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDiscountTo(String value) {
        this.applyDiscountTo = value;
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
     * Gets the value of the billCycleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleType() {
        return billCycleType;
    }

    /**
     * Sets the value of the billCycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleType(String value) {
        this.billCycleType = value;
    }

    /**
     * Gets the value of the billingPeriodAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPeriodAlignment() {
        return billingPeriodAlignment;
    }

    /**
     * Sets the value of the billingPeriodAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPeriodAlignment(String value) {
        this.billingPeriodAlignment = value;
    }

    /**
     * Gets the value of the chargedThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargedThroughDate() {
        return chargedThroughDate;
    }

    /**
     * Sets the value of the chargedThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargedThroughDate(XMLGregorianCalendar value) {
        this.chargedThroughDate = value;
    }

    /**
     * Gets the value of the chargeModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeModel() {
        return chargeModel;
    }

    /**
     * Sets the value of the chargeModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeModel(String value) {
        this.chargeModel = value;
    }

    /**
     * Gets the value of the chargeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeNumber() {
        return chargeNumber;
    }

    /**
     * Sets the value of the chargeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeNumber(String value) {
        this.chargeNumber = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountLevel() {
        return discountLevel;
    }

    /**
     * Sets the value of the discountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountLevel(String value) {
        this.discountLevel = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercentage(BigDecimal value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the dmrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDMRC() {
        return dmrc;
    }

    /**
     * Sets the value of the dmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDMRC(BigDecimal value) {
        this.dmrc = value;
    }

    /**
     * Gets the value of the dtcv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDTCV() {
        return dtcv;
    }

    /**
     * Sets the value of the dtcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDTCV(BigDecimal value) {
        this.dtcv = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the includedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncludedUnits() {
        return includedUnits;
    }

    /**
     * Sets the value of the includedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncludedUnits(BigDecimal value) {
        this.includedUnits = value;
    }

    /**
     * Gets the value of the isLastSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastSegment() {
        return isLastSegment;
    }

    /**
     * Sets the value of the isLastSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLastSegment(Boolean value) {
        this.isLastSegment = value;
    }

    /**
     * Gets the value of the mrr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRR() {
        return mrr;
    }

    /**
     * Sets the value of the mrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRR(BigDecimal value) {
        this.mrr = value;
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
     * Gets the value of the numberOfPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPeriods(Long value) {
        this.numberOfPeriods = value;
    }

    /**
     * Gets the value of the originalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * Sets the value of the originalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
    }

    /**
     * Gets the value of the overageCalculationOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverageCalculationOption() {
        return overageCalculationOption;
    }

    /**
     * Sets the value of the overageCalculationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverageCalculationOption(String value) {
        this.overageCalculationOption = value;
    }

    /**
     * Gets the value of the overagePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOveragePrice() {
        return overagePrice;
    }

    /**
     * Sets the value of the overagePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOveragePrice(BigDecimal value) {
        this.overagePrice = value;
    }

    /**
     * Gets the value of the overageUnusedUnitsCreditOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverageUnusedUnitsCreditOption() {
        return overageUnusedUnitsCreditOption;
    }

    /**
     * Sets the value of the overageUnusedUnitsCreditOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverageUnusedUnitsCreditOption(String value) {
        this.overageUnusedUnitsCreditOption = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceIncreasePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceIncreasePercentage() {
        return priceIncreasePercentage;
    }

    /**
     * Sets the value of the priceIncreasePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceIncreasePercentage(BigDecimal value) {
        this.priceIncreasePercentage = value;
    }

    /**
     * Gets the value of the processedThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedThroughDate() {
        return processedThroughDate;
    }

    /**
     * Sets the value of the processedThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedThroughDate(XMLGregorianCalendar value) {
        this.processedThroughDate = value;
    }

    /**
     * Gets the value of the productRatePlanChargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRatePlanChargeId() {
        return productRatePlanChargeId;
    }

    /**
     * Sets the value of the productRatePlanChargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRatePlanChargeId(String value) {
        this.productRatePlanChargeId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the ratePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanId() {
        return ratePlanId;
    }

    /**
     * Sets the value of the ratePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanId(String value) {
        this.ratePlanId = value;
    }

    /**
     * Gets the value of the rolloverBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRolloverBalance() {
        return rolloverBalance;
    }

    /**
     * Sets the value of the rolloverBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRolloverBalance(BigDecimal value) {
        this.rolloverBalance = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegment(Integer value) {
        this.segment = value;
    }

    /**
     * Gets the value of the tcv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTCV() {
        return tcv;
    }

    /**
     * Sets the value of the tcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTCV(BigDecimal value) {
        this.tcv = value;
    }

    /**
     * Gets the value of the triggerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriggerDate() {
        return triggerDate;
    }

    /**
     * Sets the value of the triggerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriggerDate(XMLGregorianCalendar value) {
        this.triggerDate = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerEvent(String value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the unusedUnitsCreditRates property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnusedUnitsCreditRates() {
        return unusedUnitsCreditRates;
    }

    /**
     * Sets the value of the unusedUnitsCreditRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnusedUnitsCreditRates(BigDecimal value) {
        this.unusedUnitsCreditRates = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
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

    /**
     * Gets the value of the upToPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpToPeriods() {
        return upToPeriods;
    }

    /**
     * Sets the value of the upToPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpToPeriods(Long value) {
        this.upToPeriods = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
