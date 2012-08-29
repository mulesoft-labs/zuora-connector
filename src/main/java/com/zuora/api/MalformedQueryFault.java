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

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-28T17:54:23.548-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "MalformedQueryFault", targetNamespace = "http://fault.api.zuora.com/")
public class MalformedQueryFault extends Exception {
    
    private com.zuora.api.fault.MalformedQueryFault malformedQueryFault;

    public MalformedQueryFault() {
        super();
    }
    
    public MalformedQueryFault(String message) {
        super(message);
    }
    
    public MalformedQueryFault(String message, Throwable cause) {
        super(message, cause);
    }

    public MalformedQueryFault(String message, com.zuora.api.fault.MalformedQueryFault malformedQueryFault) {
        super(message);
        this.malformedQueryFault = malformedQueryFault;
    }

    public MalformedQueryFault(String message, com.zuora.api.fault.MalformedQueryFault malformedQueryFault, Throwable cause) {
        super(message, cause);
        this.malformedQueryFault = malformedQueryFault;
    }

    public com.zuora.api.fault.MalformedQueryFault getFaultInfo() {
        return this.malformedQueryFault;
    }
}
