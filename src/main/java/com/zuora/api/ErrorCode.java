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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API_DISABLED"/>
 *     &lt;enumeration value="CANNOT_DELETE"/>
 *     &lt;enumeration value="CREDIT_CARD_PROCESSING_FAILURE"/>
 *     &lt;enumeration value="DUPLICATE_VALUE"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_LOGIN"/>
 *     &lt;enumeration value="INVALID_SESSION"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="INVALID_ID"/>
 *     &lt;enumeration value="INVALID_VALUE"/>
 *     &lt;enumeration value="INVALID_VERSION"/>
 *     &lt;enumeration value="MALFORMED_QUERY"/>
 *     &lt;enumeration value="MAX_RECORDS_EXCEEDED"/>
 *     &lt;enumeration value="MISSING_REQUIRED_VALUE"/>
 *     &lt;enumeration value="NO_PERMISSION"/>
 *     &lt;enumeration value="SERVER_UNAVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="TRANSACTION_FAILED"/>
 *     &lt;enumeration value="INVALID_TEMPLATE"/>
 *     &lt;enumeration value="ACCOUNTING_PERIOD_CLOSED"/>
 *     &lt;enumeration value="BATCH_FAIL_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    API_DISABLED,
    CANNOT_DELETE,
    CREDIT_CARD_PROCESSING_FAILURE,
    DUPLICATE_VALUE,
    INVALID_FIELD,
    INVALID_LOGIN,
    INVALID_SESSION,
    INVALID_TYPE,
    INVALID_ID,
    INVALID_VALUE,
    INVALID_VERSION,
    MALFORMED_QUERY,
    MAX_RECORDS_EXCEEDED,
    MISSING_REQUIRED_VALUE,
    NO_PERMISSION,
    SERVER_UNAVAILABLE,
    UNKNOWN_ERROR,
    TRANSACTION_FAILED,
    INVALID_TEMPLATE,
    ACCOUNTING_PERIOD_CLOSED,
    BATCH_FAIL_ERROR;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
