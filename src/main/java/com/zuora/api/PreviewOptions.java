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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.zuora.api.object.Dynamic;


/**
 * <p>Java class for PreviewOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnablePreviewMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewOptions", propOrder = {
    "enablePreviewMode",
    "numberOfPeriods"
})
public class PreviewOptions
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EnablePreviewMode", nillable = true)
    protected Boolean enablePreviewMode;
    @XmlElement(name = "NumberOfPeriods", nillable = true)
    protected Integer numberOfPeriods;

    /**
     * Gets the value of the enablePreviewMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePreviewMode() {
        return enablePreviewMode;
    }

    /**
     * Sets the value of the enablePreviewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePreviewMode(Boolean value) {
        this.enablePreviewMode = value;
    }

    /**
     * Gets the value of the numberOfPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPeriods(Integer value) {
        this.numberOfPeriods = value;
    }

}
