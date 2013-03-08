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

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.construct.Flow;
import org.mule.modules.zuora.zuora.api.RestZuoraClient;
import org.mule.modules.zuora.zuora.api.ZuoraException;

public class BatchProcessTest {

    private ZuoraModule connector;

    @Before
    public void setUp() {
        final ZuoraModule actualConnector = new ZuoraModule();
        connector = spy(actualConnector);
    }

    @Test(expected=IllegalArgumentException.class)
    public void anInexistentCallbackShouldRaise() throws Exception {
        doReturn(null).when(connector).getFlow(Matchers.anyString());
        connector.batchProcessExportFile("does_not_matter", 100, "INEXISTENT_FLOW_NAME");
    }

    @Test(expected=ZuoraException.class)
    public void anInexistentZuoraExportedFileShouldRaise() throws Exception {
        connector.setRestClient(clientThatRaises(new ZuoraException(null)));
        doReturn(new Flow(null, null)).when(connector).getFlow(Matchers.anyString());
        connector.batchProcessExportFile("does_not_matter", 100, "does_not_matter");
    }

    @Test
    public void callbackFlowShouldBeCalledInBatches() throws IOException, MuleException {
        connector.setRestClient(clientThatReturns("header", "line 1", "line 2", "line 3", null));
        final Flow callback = mock(Flow.class);
        doReturn(callback).when(connector).getFlow(Matchers.anyString());
        doReturn(mock(MuleEvent.class)).when(connector).buildEvent(Matchers.eq(callback), Matchers.anyString());
        final MuleEvent response = mock(MuleEvent.class);
        when(callback.process(Matchers.any(MuleEvent.class))).thenReturn(response);
        connector.batchProcessExportFile("does_not_matter", 2, "does_not_matter");
        verify(callback, times(2)).process(Matchers.any(MuleEvent.class));
    }

    private static RestZuoraClient clientThatRaises(final Throwable t) throws IOException {
        final RestZuoraClient restClient = mock(RestZuoraClient.class);
        when(restClient.getExportedFileStream(Matchers.anyString(), Matchers.anyString(), Matchers.anyString())).thenThrow(t);
        return restClient;
    }

    private static RestZuoraClient clientThatReturns(final String first, final String ... more) throws IOException {
        final RestZuoraClient restClient = mock(RestZuoraClient.class);
        final BufferedReader reader = mock(BufferedReader.class);
        when(reader.readLine()).thenReturn(first, more);
        when(restClient.getExportedFileStream(Matchers.anyString(), Matchers.anyString(), Matchers.anyString())).thenReturn(reader);
        return restClient;
        
    }
}
