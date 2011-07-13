/**
 * Mule Development Kit
 * Copyright 2010-2011 (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.zuora;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.mule.api.transport.Connectable;
import org.mule.modules.zuora.zobject.ZObject;

import com.sforce.soap.Account;
import com.sforce.soap.DeleteResult;
import com.sforce.soap.SaveResult;
import com.sforce.soap.StaticZObject;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class ZuoraModuleTestDriver
{
    private ZuoraModule module;

    @Before
    public void setup() throws Exception
    {
        module = new ZuoraModule();
        module.setPassword(System.getenv("zuoraPassword"));
        module.setUsername(System.getenv("zuoraUsername"));
        module.setEnpoint("https://apisandbox.zuora.com/apps/services/a/29.0");
        module.init();
    }

    @Test
    public void createAndDelete() throws Exception
    {
        SaveResult result = module.create(Arrays.<ZObject> asList(new Account())).get(0);
        assertTrue(result.getSuccess());
        DeleteResult deleteResult = module.delete("Account", Arrays.asList(result.getId())).get(0);
        assertTrue(deleteResult.getSuccess());
    }

    @Test
    public void find() throws Exception
    {
        Iterator<ZObject> result = module.find("SELECT Id FROM Account").iterator();
        assertTrue(result.hasNext());
        assertNotNull(((Account)result.next()).getField("Id"));
        assertFalse(result.hasNext());
    }
    
    @Test
    public void getUserInfo() throws Exception
    {
        assertNotNull(module.getUserInfo());
    }
    
    

}
