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

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Client for Zuora services that are Restfull instead of SOAP
 * @author marianosimone
 *
 */
public interface RestZuoraClient {
    /**
     * Return a Reader of an exported file, given credentials and a valid exportId
     * Reference: http://knowledgecenter.zuora.com/D_Using_the_Zuora_API/C_API_Reference/C_API_Use_Cases_and_Examples/I_Creating_an_Export
     * NOTE: Remember that you must close the Reader when you finish using it
     * @throws IOException if there's a problem while getting the file
     * @throws ZuoraException if the export is not ready
     * @throws IllegalArgumentException if the credentials are not set
     */
    BufferedReader getExportedFileStream(final String username, final String password, final String exportId) throws IOException;
}
