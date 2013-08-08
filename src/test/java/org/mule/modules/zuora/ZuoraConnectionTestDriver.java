/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.junit.Test;

import com.zuora.api.LoginResult;
import com.zuora.api.QueryResult;
import com.zuora.api.SaveResult;
import com.zuora.api.SessionHeader;
import com.zuora.api.Soap;
import com.zuora.api.ZuoraService;
import com.zuora.api.object.Account;
import com.zuora.api.object.ZObject;

public class ZuoraConnectionTestDriver
{
    private static final String PASSWORD = System.getenv("zuoraPassword");
    private static final String USERNAME = System.getenv("zuoraUsername");

    @SuppressWarnings("unchecked")
    @Test
    public void testname() throws Exception
    {
        ZuoraService serviceLocator = new ZuoraService(getClass().getResource("/zuora.a.43.0-modified.wsdl"));
        Soap  newConnection = serviceLocator.getPort(Soap.class);
        BindingProvider bindingProvider = ((BindingProvider) newConnection);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://apisandbox.zuora.com/apps/services/a/43.0");
        LoginResult loginResult = null;
        try
        {
            loginResult = newConnection.login(USERNAME, PASSWORD);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }

        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, loginResult.getServerUrl());
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, new HashMap<String, List<String>>());

        SessionHeader sh = new SessionHeader();
        sh.setSession(loginResult.getSession());

        bindingProvider.getRequestContext().put(Header.HEADER_LIST, Arrays.asList(new Header(new QName("urn:partner.soap.sforce.com", "SessionHeader"), sh, new JAXBDataBinding(SessionHeader.class))));


        List<SaveResult> create = newConnection.create(Arrays.<ZObject>asList(new Account()
        {
            {
                put("Name", "foo");
                setField("Currency", "USD");
                setField("BillCycleDay", "1");
                setField("AccountNumber", "501");
                setField("AllowInvoiceEdit", "false");
                setField("AutoPay", "false");
                setField("Notes", "foobar");
                setField("Status", "Draft");
            }
        }));

        System.out.println(Arrays.asList(create));
        QueryResult query = newConnection.query("SELECT Id FROM Account");
        System.out.println(Arrays.asList(query.getRecords()));
        System.out.println(Arrays.asList(newConnection.delete("Account", Collections.singletonList(create.get(0).getId()))));

    }

}


