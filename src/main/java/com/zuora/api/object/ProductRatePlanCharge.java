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
import com.zuora.api.ProductRatePlanChargeTierData;


/**
 * <p>Java class for ProductRatePlanCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRatePlanCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCycleDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillCycleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingPeriodAlignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludedUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OverageCalculationOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverageUnusedUnitsCreditOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceIncreaseOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceIncreasePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductRatePlanChargeTierData" type="{http://api.zuora.com/}ProductRatePlanChargeTierData" minOccurs="0"/>
 *         &lt;element name="ProductRatePlanId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="RevRecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevRecTriggerCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmoothingModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecificBillingPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TriggerEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProductRatePlanCharge", propOrder = {
    "accountingCode",
    "billCycleDay",
    "billCycleType",
    "billingPeriod",
    "billingPeriodAlignment",
    "chargeModel",
    "chargeType",
    "createdById",
    "createdDate",
    "defaultQuantity",
    "description",
    "includedUnits",
    "maxQuantity",
    "minQuantity",
    "name",
    "numberOfPeriod",
    "overageCalculationOption",
    "overageUnusedUnitsCreditOption",
    "priceIncreaseOption",
    "priceIncreasePercentage",
    "productRatePlanChargeTierData",
    "productRatePlanId",
    "revRecCode",
    "revRecTriggerCondition",
    "smoothingModel",
    "specificBillingPeriod",
    "triggerEvent",
    "uom",
    "updatedById",
    "updatedDate"
})
public class ProductRatePlanCharge
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountingCode", nillable = true)
    protected String accountingCode;
    @XmlElement(name = "BillCycleDay", nillable = true)
    protected Integer billCycleDay;
    @XmlElement(name = "BillCycleType", nillable = true)
    protected String billCycleType;
    @XmlElement(name = "BillingPeriod", nillable = true)
    protected String billingPeriod;
    @XmlElement(name = "BillingPeriodAlignment", nillable = true)
    protected String billingPeriodAlignment;
    @XmlElement(name = "ChargeModel", nillable = true)
    protected String chargeModel;
    @XmlElement(name = "ChargeType", nillable = true)
    protected String chargeType;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DefaultQuantity", nillable = true)
    protected BigDecimal defaultQuantity;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "IncludedUnits", nillable = true)
    protected BigDecimal includedUnits;
    @XmlElement(name = "MaxQuantity", nillable = true)
    protected BigDecimal maxQuantity;
    @XmlElement(name = "MinQuantity", nillable = true)
    protected BigDecimal minQuantity;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NumberOfPeriod", nillable = true)
    protected Long numberOfPeriod;
    @XmlElement(name = "OverageCalculationOption", nillable = true)
    protected String overageCalculationOption;
    @XmlElement(name = "OverageUnusedUnitsCreditOption", nillable = true)
    protected String overageUnusedUnitsCreditOption;
    @XmlElement(name = "PriceIncreaseOption", nillable = true)
    protected String priceIncreaseOption;
    @XmlElement(name = "PriceIncreasePercentage", nillable = true)
    protected BigDecimal priceIncreasePercentage;
    @XmlElement(name = "ProductRatePlanChargeTierData", nillable = true)
    protected ProductRatePlanChargeTierData productRatePlanChargeTierData;
    @XmlElement(name = "ProductRatePlanId", nillable = true)
    protected String productRatePlanId;
    @XmlElement(name = "RevRecCode", nillable = true)
    protected String revRecCode;
    @XmlElement(name = "RevRecTriggerCondition", nillable = true)
    protected String revRecTriggerCondition;
    @XmlElement(name = "SmoothingModel", nillable = true)
    protected String smoothingModel;
    @XmlElement(name = "SpecificBillingPeriod", nillable = true)
    protected Long specificBillingPeriod;
    @XmlElement(name = "TriggerEvent", nillable = true)
    protected String triggerEvent;
    @XmlElement(name = "UOM", nillable = true)
    protected String uom;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

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
     * Gets the value of the billingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * Sets the value of the billingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPeriod(String value) {
        this.billingPeriod = value;
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
     * Gets the value of the defaultQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * Sets the value of the defaultQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultQuantity(BigDecimal value) {
        this.defaultQuantity = value;
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
     * Gets the value of the maxQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * Sets the value of the maxQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxQuantity(BigDecimal value) {
        this.maxQuantity = value;
    }

    /**
     * Gets the value of the minQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    /**
     * Sets the value of the minQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinQuantity(BigDecimal value) {
        this.minQuantity = value;
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
     * Gets the value of the numberOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPeriod() {
        return numberOfPeriod;
    }

    /**
     * Sets the value of the numberOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPeriod(Long value) {
        this.numberOfPeriod = value;
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
     * Gets the value of the priceIncreaseOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceIncreaseOption() {
        return priceIncreaseOption;
    }

    /**
     * Sets the value of the priceIncreaseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceIncreaseOption(String value) {
        this.priceIncreaseOption = value;
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
     * Gets the value of the productRatePlanChargeTierData property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRatePlanChargeTierData }
     *     
     */
    public ProductRatePlanChargeTierData getProductRatePlanChargeTierData() {
        return productRatePlanChargeTierData;
    }

    /**
     * Sets the value of the productRatePlanChargeTierData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRatePlanChargeTierData }
     *     
     */
    public void setProductRatePlanChargeTierData(ProductRatePlanChargeTierData value) {
        this.productRatePlanChargeTierData = value;
    }

    /**
     * Gets the value of the productRatePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRatePlanId() {
        return productRatePlanId;
    }

    /**
     * Sets the value of the productRatePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRatePlanId(String value) {
        this.productRatePlanId = value;
    }

    /**
     * Gets the value of the revRecCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevRecCode() {
        return revRecCode;
    }

    /**
     * Sets the value of the revRecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevRecCode(String value) {
        this.revRecCode = value;
    }

    /**
     * Gets the value of the revRecTriggerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevRecTriggerCondition() {
        return revRecTriggerCondition;
    }

    /**
     * Sets the value of the revRecTriggerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevRecTriggerCondition(String value) {
        this.revRecTriggerCondition = value;
    }

    /**
     * Gets the value of the smoothingModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmoothingModel() {
        return smoothingModel;
    }

    /**
     * Sets the value of the smoothingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmoothingModel(String value) {
        this.smoothingModel = value;
    }

    /**
     * Gets the value of the specificBillingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpecificBillingPeriod() {
        return specificBillingPeriod;
    }

    /**
     * Sets the value of the specificBillingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpecificBillingPeriod(Long value) {
        this.specificBillingPeriod = value;
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

}
