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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.zuora.api.object.Dynamic;
import com.zuora.api.object.RatePlan;


/**
 * <p>Java class for RatePlanData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlan" type="{http://object.api.zuora.com/}RatePlan" minOccurs="0"/>
 *         &lt;element name="RatePlanChargeData" type="{http://api.zuora.com/}RatePlanChargeData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanData", propOrder = {
    "ratePlan",
    "ratePlanChargeData"
})
public class RatePlanData
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "RatePlan", nillable = true)
    protected RatePlan ratePlan;
    @XmlElement(name = "RatePlanChargeData", nillable = true)
    protected List<RatePlanChargeData> ratePlanChargeData;

    /**
     * Gets the value of the ratePlan property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlan }
     *     
     */
    public RatePlan getRatePlan() {
        return ratePlan;
    }

    /**
     * Sets the value of the ratePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlan }
     *     
     */
    public void setRatePlan(RatePlan value) {
        this.ratePlan = value;
    }

    /**
     * Gets the value of the ratePlanChargeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanChargeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanChargeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanChargeData }
     * 
     * 
     */
    public List<RatePlanChargeData> getRatePlanChargeData() {
        if (ratePlanChargeData == null) {
            ratePlanChargeData = new ArrayList<RatePlanChargeData>();
        }
        return this.ratePlanChargeData;
    }

}
