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
 * <p>Java class for RatePlanChargeTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanChargeTier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndingUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsOveragePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanChargeId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="StartingUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "RatePlanChargeTier", propOrder = {
    "createdById",
    "createdDate",
    "endingUnit",
    "isOveragePrice",
    "price",
    "priceFormat",
    "ratePlanChargeId",
    "startingUnit",
    "tier",
    "updatedById",
    "updatedDate"
})
public class RatePlanChargeTier
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "EndingUnit", nillable = true)
    protected BigDecimal endingUnit;
    @XmlElement(name = "IsOveragePrice", nillable = true)
    protected Boolean isOveragePrice;
    @XmlElement(name = "Price", nillable = true)
    protected BigDecimal price;
    @XmlElement(name = "PriceFormat", nillable = true)
    protected String priceFormat;
    @XmlElement(name = "RatePlanChargeId", nillable = true)
    protected String ratePlanChargeId;
    @XmlElement(name = "StartingUnit", nillable = true)
    protected BigDecimal startingUnit;
    @XmlElement(name = "Tier", nillable = true)
    protected Integer tier;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

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
     * Gets the value of the endingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndingUnit() {
        return endingUnit;
    }

    /**
     * Sets the value of the endingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndingUnit(BigDecimal value) {
        this.endingUnit = value;
    }

    /**
     * Gets the value of the isOveragePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOveragePrice() {
        return isOveragePrice;
    }

    /**
     * Sets the value of the isOveragePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOveragePrice(Boolean value) {
        this.isOveragePrice = value;
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
     * Gets the value of the priceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceFormat() {
        return priceFormat;
    }

    /**
     * Sets the value of the priceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceFormat(String value) {
        this.priceFormat = value;
    }

    /**
     * Gets the value of the ratePlanChargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanChargeId() {
        return ratePlanChargeId;
    }

    /**
     * Sets the value of the ratePlanChargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanChargeId(String value) {
        this.ratePlanChargeId = value;
    }

    /**
     * Gets the value of the startingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartingUnit() {
        return startingUnit;
    }

    /**
     * Sets the value of the startingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartingUnit(BigDecimal value) {
        this.startingUnit = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTier(Integer value) {
        this.tier = value;
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
