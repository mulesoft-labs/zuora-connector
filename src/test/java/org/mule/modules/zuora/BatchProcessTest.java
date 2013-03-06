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
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;

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
}
