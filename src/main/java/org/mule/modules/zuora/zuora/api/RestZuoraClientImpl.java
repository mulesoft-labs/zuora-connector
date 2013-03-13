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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.codec.Base64Encoder;

public class RestZuoraClientImpl implements RestZuoraClient {
    private final String endpoint;

    public RestZuoraClientImpl(final String endpoint) {
        this.endpoint = endpoint;
    }

    public InputStream getExportedFileStream(final String username, final String password, final String exportId) throws IOException {
        try {
            URL url = new URL(this.endpoint + "file/" + exportId);

            final String authentitaction = new Base64Encoder().doTransform(username + ":" + password, "utf-8").toString();
            final URLConnection uc = url.openConnection();
            uc.setRequestProperty("Authorization", "Basic " + authentitaction);
            return uc.getInputStream();
        } catch (final TransformerException e) {
            throw new IllegalArgumentException("Could not encode your credentials. Are they set?", e);
        } catch (final FileNotFoundException e) {
            throw new ZuoraException("Exported File not found: " + exportId, e);
        }
    }
}
