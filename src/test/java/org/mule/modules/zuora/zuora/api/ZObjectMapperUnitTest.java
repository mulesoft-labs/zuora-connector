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

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.mule.modules.zuora.zobject.ZObjectType;

import com.zuora.api.ProductRatePlanChargeTierData;
import com.zuora.api.object.Account;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.ZObject;

public class ZObjectMapperUnitTest {

    @Test
    public void toZobject() throws Exception {
        @SuppressWarnings("serial")
		final Map<String, Object> accountMap = new HashMap<String, Object>() {{
            put("Name", "foo");
            put("Currency", "USD");
            put("BillCycleDay", 1);
            put("AccountNumber", "7891");
            put("AllowInvoiceEdit", false);
            put("AutoPay", false);
            put("Notes", "foobar");
            put("Status", "Draft");
        }};;

        ZObject zObject = ZObjectMapper.toZObject(ZObjectType.Account, accountMap);
        assertThat(zObject, instanceOf(Account.class));
        for (Entry<String, Object> e : accountMap.entrySet()) {
            assertEquals(zObject.getAt(e.getKey()), e.getValue());
        }
    }

    @SuppressWarnings("serial")
	@Test
    public void toZObjectWithNestedZObject() throws Exception {
        final ProductRatePlanChargeTier tier = new ProductRatePlanChargeTier();
        tier.setId("456");

        ProductRatePlanCharge charge = (ProductRatePlanCharge) ZObjectMapper.toZObject(ZObjectType.ProductRatePlanCharge, new HashMap<String, Object>() {{
            put("AccountingCode", "AXD");
            put("ProductRatePlanChargeTierData", new ProductRatePlanChargeTierData() {{
                getProductRatePlanChargeTier().add(tier);
            }});
        }});

        assertEquals("AXD", charge.getAccountingCode());
        assertEquals("456", charge.getProductRatePlanChargeTierData().getProductRatePlanChargeTier().get(0).getId());
    }

    @SuppressWarnings("serial")
	@Test
    public void toZObjectWithNestedMap() throws Exception {
        ProductRatePlanCharge charge = (ProductRatePlanCharge) ZObjectMapper.toZObject(ZObjectType.ProductRatePlanCharge, new HashMap<String, Object>() {{
            put("AccountingCode", "AXD");
            put("ProductRatePlanChargeTierData", new HashMap<String, Object>() {{
                put("ProductRatePlanChargeTier", Arrays.asList(new HashMap<String, Object>() {{
                    put("Id", "456");
                }}));
            }});
        }});

        assertEquals("AXD", charge.getAccountingCode());
        assertEquals("456", charge.getProductRatePlanChargeTierData().getProductRatePlanChargeTier().get(0).getId());
    }

    @SuppressWarnings("serial")
	@Test
    public void testNestedStructure() throws Exception {
        HashMap<String,Object> productRatePlanChargeMap = new HashMap<String, Object>() {{
            put("ChargeModel", "Per Unit Pricing");
            put("ChargeType", "Recurring");
            put("Model", "PerUnit");
            put("Name", "Product Rate Plan Charge");
            put("ProductRatePlanId", "1");
            put("TriggerEvent", "ContractEffective");
            put("ProductRatePlanChargeTierData", new HashMap<String, Object>() {{
                put("productRatePlanChargeTier", Arrays.asList(new HashMap<String, Object>() {{
                    put("Active", "true");
                    put("Currency", "USD");
                    put("Price", "20");
                    put("Tier", "1");
                }}));
            }});
        } };

        final ProductRatePlanCharge zobject = (ProductRatePlanCharge) ZObjectMapper.toZObject(ZObjectType.ProductRatePlanCharge, productRatePlanChargeMap);
        assertEquals(zobject.getChargeModel(), "Per Unit Pricing");
        assertEquals(zobject.getChargeType(), "Recurring");
        assertEquals(zobject.getProductRatePlanId(), "1");
    }
}
