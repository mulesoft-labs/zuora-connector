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
import com.zuora.api.object.GatewayOption;


/**
 * <p>Java class for GatewayOptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GatewayOptionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GatewayOption" type="{http://object.api.zuora.com/}GatewayOption" maxOccurs="200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayOptionData", propOrder = {
    "gatewayOption"
})
public class GatewayOptionData
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "GatewayOption", nillable = true)
    protected List<GatewayOption> gatewayOption;

    /**
     * Gets the value of the gatewayOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gatewayOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGatewayOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GatewayOption }
     * 
     * 
     */
    public List<GatewayOption> getGatewayOption() {
        if (gatewayOption == null) {
            gatewayOption = new ArrayList<GatewayOption>();
        }
        return this.gatewayOption;
    }

}
