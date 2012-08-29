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
import com.zuora.api.object.Amendment;
import com.zuora.api.object.Dynamic;


/**
 * <p>Java class for AmendRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amendments" type="{http://object.api.zuora.com/}Amendment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmendOptions" type="{http://api.zuora.com/}AmendOptions" minOccurs="0"/>
 *         &lt;element name="PreviewOptions" type="{http://api.zuora.com/}PreviewOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRequest", propOrder = {
    "amendments",
    "amendOptions",
    "previewOptions"
})
public class AmendRequest
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Amendments", nillable = true)
    protected List<Amendment> amendments;
    @XmlElement(name = "AmendOptions", nillable = true)
    protected AmendOptions amendOptions;
    @XmlElement(name = "PreviewOptions", nillable = true)
    protected PreviewOptions previewOptions;

    /**
     * Gets the value of the amendments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amendments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmendments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amendment }
     * 
     * 
     */
    public List<Amendment> getAmendments() {
        if (amendments == null) {
            amendments = new ArrayList<Amendment>();
        }
        return this.amendments;
    }

    /**
     * Gets the value of the amendOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AmendOptions }
     *     
     */
    public AmendOptions getAmendOptions() {
        return amendOptions;
    }

    /**
     * Sets the value of the amendOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendOptions }
     *     
     */
    public void setAmendOptions(AmendOptions value) {
        this.amendOptions = value;
    }

    /**
     * Gets the value of the previewOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewOptions }
     *     
     */
    public PreviewOptions getPreviewOptions() {
        return previewOptions;
    }

    /**
     * Sets the value of the previewOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewOptions }
     *     
     */
    public void setPreviewOptions(PreviewOptions value) {
        this.previewOptions = value;
    }

}
