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

import java.util.List;

import javax.validation.constraints.NotNull;

import com.zuora.api.*;
import org.mule.modules.zuora.User;

import com.zuora.api.object.ZObject;

public interface ZuoraClient<E extends Throwable>
{
    List<SubscribeResult> subscribe(@NotNull List<SubscribeRequest> subscriptions) throws E;

    List<SaveResult> create(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> generate(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> update(@NotNull List<ZObject> zobjects) throws E;

    List<DeleteResult> delete(@NotNull String type, @NotNull List<String> ids) throws E;

    List<ZObject> find(@NotNull String zquery) throws E;

    User getUserInfo() throws E;

    List<AmendResult> amend(@NotNull  List<AmendRequest> amendaments) throws E;

    String getSessionId();

    QueryResult query(String zquery) throws UnexpectedErrorFault, MalformedQueryFault, InvalidQueryLocatorFault;

    QueryResult queryMore(String queryLocator) throws InvalidQueryLocatorFault, UnexpectedErrorFault;
}
