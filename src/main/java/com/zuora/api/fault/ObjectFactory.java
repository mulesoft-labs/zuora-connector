/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.zuora.api.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zuora.api.fault package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidValueFault_QNAME = new QName("http://fault.api.zuora.com/", "InvalidValueFault");
    private final static QName _MalformedQueryFault_QNAME = new QName("http://fault.api.zuora.com/", "MalformedQueryFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("http://fault.api.zuora.com/", "UnexpectedErrorFault");
    private final static QName _Fault_QNAME = new QName("http://fault.api.zuora.com/", "fault");
    private final static QName _LoginFault_QNAME = new QName("http://fault.api.zuora.com/", "LoginFault");
    private final static QName _InvalidTypeFault_QNAME = new QName("http://fault.api.zuora.com/", "InvalidTypeFault");
    private final static QName _InvalidQueryLocatorFault_QNAME = new QName("http://fault.api.zuora.com/", "InvalidQueryLocatorFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zuora.api.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MalformedQueryFault }
     * 
     */
    public MalformedQueryFault createMalformedQueryFault() {
        return new MalformedQueryFault();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link InvalidQueryLocatorFault }
     * 
     */
    public InvalidQueryLocatorFault createInvalidQueryLocatorFault() {
        return new InvalidQueryLocatorFault();
    }

    /**
     * Create an instance of {@link InvalidValueFault }
     * 
     */
    public InvalidValueFault createInvalidValueFault() {
        return new InvalidValueFault();
    }

    /**
     * Create an instance of {@link InvalidTypeFault }
     * 
     */
    public InvalidTypeFault createInvalidTypeFault() {
        return new InvalidTypeFault();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidValueFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "InvalidValueFault")
    public JAXBElement<InvalidValueFault> createInvalidValueFault(InvalidValueFault value) {
        return new JAXBElement<InvalidValueFault>(_InvalidValueFault_QNAME, InvalidValueFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedQueryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "MalformedQueryFault")
    public JAXBElement<MalformedQueryFault> createMalformedQueryFault(MalformedQueryFault value) {
        return new JAXBElement<MalformedQueryFault>(_MalformedQueryFault_QNAME, MalformedQueryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "UnexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFault> createUnexpectedErrorFault(UnexpectedErrorFault value) {
        return new JAXBElement<UnexpectedErrorFault>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "fault")
    public JAXBElement<ApiFault> createFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_Fault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "LoginFault")
    public JAXBElement<LoginFault> createLoginFault(LoginFault value) {
        return new JAXBElement<LoginFault>(_LoginFault_QNAME, LoginFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTypeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "InvalidTypeFault")
    public JAXBElement<InvalidTypeFault> createInvalidTypeFault(InvalidTypeFault value) {
        return new JAXBElement<InvalidTypeFault>(_InvalidTypeFault_QNAME, InvalidTypeFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidQueryLocatorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fault.api.zuora.com/", name = "InvalidQueryLocatorFault")
    public JAXBElement<InvalidQueryLocatorFault> createInvalidQueryLocatorFault(InvalidQueryLocatorFault value) {
        return new JAXBElement<InvalidQueryLocatorFault>(_InvalidQueryLocatorFault_QNAME, InvalidQueryLocatorFault.class, null, value);
    }

}
