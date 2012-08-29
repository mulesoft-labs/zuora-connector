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
 * <p>Java class for AmendOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenerateInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceProcessingOptions" type="{http://api.zuora.com/}InvoiceProcessingOptions" minOccurs="0"/>
 *         &lt;element name="ProcessPayments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendOptions", propOrder = {
    "generateInvoice",
    "invoiceProcessingOptions",
    "processPayments"
})
public class AmendOptions
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "GenerateInvoice", nillable = true)
    protected Boolean generateInvoice;
    @XmlElement(name = "InvoiceProcessingOptions", nillable = true)
    protected InvoiceProcessingOptions invoiceProcessingOptions;
    @XmlElement(name = "ProcessPayments", nillable = true)
    protected Boolean processPayments;

    /**
     * Gets the value of the generateInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateInvoice() {
        return generateInvoice;
    }

    /**
     * Sets the value of the generateInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateInvoice(Boolean value) {
        this.generateInvoice = value;
    }

    /**
     * Gets the value of the invoiceProcessingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceProcessingOptions }
     *     
     */
    public InvoiceProcessingOptions getInvoiceProcessingOptions() {
        return invoiceProcessingOptions;
    }

    /**
     * Sets the value of the invoiceProcessingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceProcessingOptions }
     *     
     */
    public void setInvoiceProcessingOptions(InvoiceProcessingOptions value) {
        this.invoiceProcessingOptions = value;
    }

    /**
     * Gets the value of the processPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessPayments() {
        return processPayments;
    }

    /**
     * Sets the value of the processPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessPayments(Boolean value) {
        this.processPayments = value;
    }

}
