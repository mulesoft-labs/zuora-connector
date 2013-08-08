/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.zuora.User;

import com.zuora.api.AmendRequest;
import com.zuora.api.AmendResult;
import com.zuora.api.DeleteResult;
import com.zuora.api.ErrorCode;
import com.zuora.api.LoginFault;
import com.zuora.api.LoginResult;
import com.zuora.api.QueryResult;
import com.zuora.api.SaveResult;
import com.zuora.api.SessionHeader;
import com.zuora.api.Soap;
import com.zuora.api.SubscribeRequest;
import com.zuora.api.SubscribeResult;
import com.zuora.api.UnexpectedErrorFault;
import com.zuora.api.ZuoraService;
import com.zuora.api.object.ZObject;

/**
 * Implementation of {@link ZuoraClient} based on a slightly modified version of
 * the open-source <a href="http://code.google.com/p/sfdc-wsc/">fsdc-wsc</a>.
 * Although that client is sales-force specific, it works with with Zuora since
 * both APIs have very similar WSDL interfaces
 *
 * @author flbulgarelli
 */
public class CxfZuoraClient implements ZuoraClient<Exception> {
    private JAXBDataBinding jSessionDataBinding;
    private final Soap soap;
    private final String sessionId;

    public CxfZuoraClient(@NotNull String username, @NotNull String password,
                          @NotNull String endpoint) throws UnexpectedErrorFault, LoginFault {
        Validate.notNull(username);
        Validate.notNull(password);
        Validate.notNull(endpoint);

        // @EL if multiple clients are created at the same time this JAXB code can
        // generate race conditions on the ClassLoader when it searches for the
        // ObjectFactory:
        //
        // 1. Could not create a validated object, cause: loader (instance of
        // org/mule/module/launcher/MuleApplicationClassLoader): attempted  duplicate class
        // definition for name: "com/zuora/api/object/ObjectFactory" (java.util.NoSuchElementException)
        //
        // So I'm locking it so it can happen only one at a time
        synchronized (CxfZuoraClient.class) {
            try {
                jSessionDataBinding = new JAXBDataBinding(SessionHeader.class);
            } catch (JAXBException e) {
                throw new AssertionError(e);
            }
        }

        ZuoraService serviceLocator = new ZuoraService(getClass().getResource(
                "/zuora.a.43.0-modified.wsdl"));
        this.soap = serviceLocator.getPort(Soap.class);

        BindingProvider bindingProvider = ((BindingProvider) this.soap);
        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

        LoginResult loginResult;
        loginResult = this.soap.login(username, password);

        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                loginResult.getServerUrl());
        bindingProvider.getRequestContext().put(
                MessageContext.HTTP_REQUEST_HEADERS,
                new HashMap<String, List<String>>());

        sessionId = loginResult.getSession();

        SessionHeader sh = new SessionHeader();
        sh.setSession(loginResult.getSession());

        bindingProvider.getRequestContext().put(
                Header.HEADER_LIST,
                Arrays.asList(new Header(new QName(
                        "urn:partner.soap.sforce.com", "SessionHeader"), sh,
                        jSessionDataBinding)));

    }

    public String getSessionId() {
        return sessionId;
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments)
            throws Exception {
        Validate.notEmpty(amendaments);

        try {
            return soap.amend(amendaments);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.create(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids)
            throws Exception {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);

        try {
            return this.soap.delete(type, ids);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<ZObject> find(final String zquery) throws Exception {
        Validate.notEmpty(zquery);

        List<ZObject> allRecords = new ArrayList<ZObject>();

        try {
            QueryResult result = soap.query(zquery);
            if (result.getRecords().get(0) != null) {
                allRecords.addAll(result.getRecords());
            }
            while (!result.isDone()) {
                result = soap.queryMore(result.getQueryLocator());
                allRecords.addAll(result.getRecords());
            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

        return allRecords;
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.generate(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public User getUserInfo() throws Exception {

        try {
            Holder<String> userId = new Holder<String>();
            Holder<String> tenantId = new Holder<String>();
            Holder<String> tenantName = new Holder<String>();
            Holder<String> userEmail = new Holder<String>();
            Holder<String> userFullName = new Holder<String>();
            Holder<String> username = new Holder<String>();
            this.soap.getUserInfo(tenantId, tenantName, userEmail,
                    userFullName, userId, username);
            // TODO
            return new User(userId.value, username.value, userEmail.value,
                    userFullName.value, tenantId.value, tenantName.value);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions)
            throws Exception {
        Validate.notEmpty(subscriptions);

        try {
            return this.soap.subscribe(subscriptions);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);
        try {
            return this.soap.update(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

    }
}
