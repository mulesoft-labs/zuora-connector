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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.zuora.api.GatewayOptionData;


/**
 * <p>Java class for PaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod">
 *   &lt;complexContent>
 *     &lt;extension base="{http://object.api.zuora.com/}zObject">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="AchAbaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AchAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AchAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AchAccountNumberMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AchAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AchBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditCardAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardMaskNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayOptionData" type="{http://api.zuora.com/}GatewayOptionData" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastFailedSaleTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastTransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastTransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxConsecutivePaymentFailures" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumConsecutiveFailures" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentMethodStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentRetryWindow" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="PaypalBaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaypalEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaypalPreapprovalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaypalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkipValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfErrorPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfProcessedPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedById" type="{http://api.zuora.com/}ID" minOccurs="0"/>
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UseDefaultRetryRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod", propOrder = {
    "accountId",
    "achAbaCode",
    "achAccountName",
    "achAccountNumber",
    "achAccountNumberMask",
    "achAccountType",
    "achBankName",
    "active",
    "bankIdentificationNumber",
    "createdById",
    "createdDate",
    "creditCardAddress1",
    "creditCardAddress2",
    "creditCardCity",
    "creditCardCountry",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardHolderName",
    "creditCardMaskNumber",
    "creditCardNumber",
    "creditCardPostalCode",
    "creditCardSecurityCode",
    "creditCardState",
    "creditCardType",
    "deviceSessionId",
    "email",
    "gatewayOptionData",
    "ipAddress",
    "lastFailedSaleTransactionDate",
    "lastTransactionDateTime",
    "lastTransactionStatus",
    "maxConsecutivePaymentFailures",
    "name",
    "numConsecutiveFailures",
    "paymentMethodStatus",
    "paymentRetryWindow",
    "paypalBaid",
    "paypalEmail",
    "paypalPreapprovalKey",
    "paypalType",
    "phone",
    "skipValidation",
    "totalNumberOfErrorPayments",
    "totalNumberOfProcessedPayments",
    "type",
    "updatedById",
    "updatedDate",
    "useDefaultRetryRule"
})
public class PaymentMethod
    extends ZObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "AchAbaCode", nillable = true)
    protected String achAbaCode;
    @XmlElement(name = "AchAccountName", nillable = true)
    protected String achAccountName;
    @XmlElement(name = "AchAccountNumber", nillable = true)
    protected String achAccountNumber;
    @XmlElement(name = "AchAccountNumberMask", nillable = true)
    protected String achAccountNumberMask;
    @XmlElement(name = "AchAccountType", nillable = true)
    protected String achAccountType;
    @XmlElement(name = "AchBankName", nillable = true)
    protected String achBankName;
    @XmlElement(name = "Active", nillable = true)
    protected Boolean active;
    @XmlElement(name = "BankIdentificationNumber", nillable = true)
    protected String bankIdentificationNumber;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreditCardAddress1", nillable = true)
    protected String creditCardAddress1;
    @XmlElement(name = "CreditCardAddress2", nillable = true)
    protected String creditCardAddress2;
    @XmlElement(name = "CreditCardCity", nillable = true)
    protected String creditCardCity;
    @XmlElement(name = "CreditCardCountry", nillable = true)
    protected String creditCardCountry;
    @XmlElement(name = "CreditCardExpirationMonth", nillable = true)
    protected Integer creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear", nillable = true)
    protected Integer creditCardExpirationYear;
    @XmlElement(name = "CreditCardHolderName", nillable = true)
    protected String creditCardHolderName;
    @XmlElement(name = "CreditCardMaskNumber", nillable = true)
    protected String creditCardMaskNumber;
    @XmlElement(name = "CreditCardNumber", nillable = true)
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardPostalCode", nillable = true)
    protected String creditCardPostalCode;
    @XmlElement(name = "CreditCardSecurityCode", nillable = true)
    protected String creditCardSecurityCode;
    @XmlElement(name = "CreditCardState", nillable = true)
    protected String creditCardState;
    @XmlElement(name = "CreditCardType", nillable = true)
    protected String creditCardType;
    @XmlElement(name = "DeviceSessionId", nillable = true)
    protected String deviceSessionId;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "GatewayOptionData", nillable = true)
    protected GatewayOptionData gatewayOptionData;
    @XmlElement(name = "IPAddress", nillable = true)
    protected String ipAddress;
    @XmlElement(name = "LastFailedSaleTransactionDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFailedSaleTransactionDate;
    @XmlElement(name = "LastTransactionDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTransactionDateTime;
    @XmlElement(name = "LastTransactionStatus", nillable = true)
    protected String lastTransactionStatus;
    @XmlElement(name = "MaxConsecutivePaymentFailures", nillable = true)
    protected Short maxConsecutivePaymentFailures;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NumConsecutiveFailures", nillable = true)
    protected Integer numConsecutiveFailures;
    @XmlElement(name = "PaymentMethodStatus", nillable = true)
    protected String paymentMethodStatus;
    @XmlElement(name = "PaymentRetryWindow", nillable = true)
    protected Short paymentRetryWindow;
    @XmlElement(name = "PaypalBaid", nillable = true)
    protected String paypalBaid;
    @XmlElement(name = "PaypalEmail", nillable = true)
    protected String paypalEmail;
    @XmlElement(name = "PaypalPreapprovalKey", nillable = true)
    protected String paypalPreapprovalKey;
    @XmlElement(name = "PaypalType", nillable = true)
    protected String paypalType;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "SkipValidation", nillable = true)
    protected Boolean skipValidation;
    @XmlElement(name = "TotalNumberOfErrorPayments", nillable = true)
    protected Integer totalNumberOfErrorPayments;
    @XmlElement(name = "TotalNumberOfProcessedPayments", nillable = true)
    protected Integer totalNumberOfProcessedPayments;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "UpdatedById", nillable = true)
    protected String updatedById;
    @XmlElement(name = "UpdatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UseDefaultRetryRule", nillable = true)
    protected Boolean useDefaultRetryRule;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the achAbaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchAbaCode() {
        return achAbaCode;
    }

    /**
     * Sets the value of the achAbaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchAbaCode(String value) {
        this.achAbaCode = value;
    }

    /**
     * Gets the value of the achAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchAccountName() {
        return achAccountName;
    }

    /**
     * Sets the value of the achAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchAccountName(String value) {
        this.achAccountName = value;
    }

    /**
     * Gets the value of the achAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchAccountNumber() {
        return achAccountNumber;
    }

    /**
     * Sets the value of the achAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchAccountNumber(String value) {
        this.achAccountNumber = value;
    }

    /**
     * Gets the value of the achAccountNumberMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchAccountNumberMask() {
        return achAccountNumberMask;
    }

    /**
     * Sets the value of the achAccountNumberMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchAccountNumberMask(String value) {
        this.achAccountNumberMask = value;
    }

    /**
     * Gets the value of the achAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchAccountType() {
        return achAccountType;
    }

    /**
     * Sets the value of the achAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchAccountType(String value) {
        this.achAccountType = value;
    }

    /**
     * Gets the value of the achBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchBankName() {
        return achBankName;
    }

    /**
     * Sets the value of the achBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchBankName(String value) {
        this.achBankName = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the bankIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdentificationNumber() {
        return bankIdentificationNumber;
    }

    /**
     * Sets the value of the bankIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdentificationNumber(String value) {
        this.bankIdentificationNumber = value;
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
     * Gets the value of the creditCardAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAddress1() {
        return creditCardAddress1;
    }

    /**
     * Sets the value of the creditCardAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAddress1(String value) {
        this.creditCardAddress1 = value;
    }

    /**
     * Gets the value of the creditCardAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAddress2() {
        return creditCardAddress2;
    }

    /**
     * Sets the value of the creditCardAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAddress2(String value) {
        this.creditCardAddress2 = value;
    }

    /**
     * Gets the value of the creditCardCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCity() {
        return creditCardCity;
    }

    /**
     * Sets the value of the creditCardCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCity(String value) {
        this.creditCardCity = value;
    }

    /**
     * Gets the value of the creditCardCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCountry() {
        return creditCardCountry;
    }

    /**
     * Sets the value of the creditCardCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCountry(String value) {
        this.creditCardCountry = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardExpirationMonth(Integer value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardExpirationYear(Integer value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardHolderName() {
        return creditCardHolderName;
    }

    /**
     * Sets the value of the creditCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardHolderName(String value) {
        this.creditCardHolderName = value;
    }

    /**
     * Gets the value of the creditCardMaskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardMaskNumber() {
        return creditCardMaskNumber;
    }

    /**
     * Sets the value of the creditCardMaskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardMaskNumber(String value) {
        this.creditCardMaskNumber = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardPostalCode() {
        return creditCardPostalCode;
    }

    /**
     * Sets the value of the creditCardPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardPostalCode(String value) {
        this.creditCardPostalCode = value;
    }

    /**
     * Gets the value of the creditCardSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardSecurityCode() {
        return creditCardSecurityCode;
    }

    /**
     * Sets the value of the creditCardSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardSecurityCode(String value) {
        this.creditCardSecurityCode = value;
    }

    /**
     * Gets the value of the creditCardState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardState() {
        return creditCardState;
    }

    /**
     * Sets the value of the creditCardState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardState(String value) {
        this.creditCardState = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the deviceSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSessionId() {
        return deviceSessionId;
    }

    /**
     * Sets the value of the deviceSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSessionId(String value) {
        this.deviceSessionId = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the gatewayOptionData property.
     * 
     * @return
     *     possible object is
     *     {@link GatewayOptionData }
     *     
     */
    public GatewayOptionData getGatewayOptionData() {
        return gatewayOptionData;
    }

    /**
     * Sets the value of the gatewayOptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayOptionData }
     *     
     */
    public void setGatewayOptionData(GatewayOptionData value) {
        this.gatewayOptionData = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the lastFailedSaleTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFailedSaleTransactionDate() {
        return lastFailedSaleTransactionDate;
    }

    /**
     * Sets the value of the lastFailedSaleTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFailedSaleTransactionDate(XMLGregorianCalendar value) {
        this.lastFailedSaleTransactionDate = value;
    }

    /**
     * Gets the value of the lastTransactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTransactionDateTime() {
        return lastTransactionDateTime;
    }

    /**
     * Sets the value of the lastTransactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTransactionDateTime(XMLGregorianCalendar value) {
        this.lastTransactionDateTime = value;
    }

    /**
     * Gets the value of the lastTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTransactionStatus() {
        return lastTransactionStatus;
    }

    /**
     * Sets the value of the lastTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTransactionStatus(String value) {
        this.lastTransactionStatus = value;
    }

    /**
     * Gets the value of the maxConsecutivePaymentFailures property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxConsecutivePaymentFailures() {
        return maxConsecutivePaymentFailures;
    }

    /**
     * Sets the value of the maxConsecutivePaymentFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxConsecutivePaymentFailures(Short value) {
        this.maxConsecutivePaymentFailures = value;
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
     * Gets the value of the numConsecutiveFailures property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumConsecutiveFailures() {
        return numConsecutiveFailures;
    }

    /**
     * Sets the value of the numConsecutiveFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumConsecutiveFailures(Integer value) {
        this.numConsecutiveFailures = value;
    }

    /**
     * Gets the value of the paymentMethodStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodStatus() {
        return paymentMethodStatus;
    }

    /**
     * Sets the value of the paymentMethodStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodStatus(String value) {
        this.paymentMethodStatus = value;
    }

    /**
     * Gets the value of the paymentRetryWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaymentRetryWindow() {
        return paymentRetryWindow;
    }

    /**
     * Sets the value of the paymentRetryWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaymentRetryWindow(Short value) {
        this.paymentRetryWindow = value;
    }

    /**
     * Gets the value of the paypalBaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBaid() {
        return paypalBaid;
    }

    /**
     * Sets the value of the paypalBaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBaid(String value) {
        this.paypalBaid = value;
    }

    /**
     * Gets the value of the paypalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEmail() {
        return paypalEmail;
    }

    /**
     * Sets the value of the paypalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEmail(String value) {
        this.paypalEmail = value;
    }

    /**
     * Gets the value of the paypalPreapprovalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPreapprovalKey() {
        return paypalPreapprovalKey;
    }

    /**
     * Sets the value of the paypalPreapprovalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPreapprovalKey(String value) {
        this.paypalPreapprovalKey = value;
    }

    /**
     * Gets the value of the paypalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalType() {
        return paypalType;
    }

    /**
     * Sets the value of the paypalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalType(String value) {
        this.paypalType = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the skipValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipValidation() {
        return skipValidation;
    }

    /**
     * Sets the value of the skipValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipValidation(Boolean value) {
        this.skipValidation = value;
    }

    /**
     * Gets the value of the totalNumberOfErrorPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfErrorPayments() {
        return totalNumberOfErrorPayments;
    }

    /**
     * Sets the value of the totalNumberOfErrorPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfErrorPayments(Integer value) {
        this.totalNumberOfErrorPayments = value;
    }

    /**
     * Gets the value of the totalNumberOfProcessedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfProcessedPayments() {
        return totalNumberOfProcessedPayments;
    }

    /**
     * Sets the value of the totalNumberOfProcessedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfProcessedPayments(Integer value) {
        this.totalNumberOfProcessedPayments = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the useDefaultRetryRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultRetryRule() {
        return useDefaultRetryRule;
    }

    /**
     * Sets the value of the useDefaultRetryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultRetryRule(Boolean value) {
        this.useDefaultRetryRule = value;
    }

}
