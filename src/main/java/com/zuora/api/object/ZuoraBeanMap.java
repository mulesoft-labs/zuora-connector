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

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.collections.Transformer;

public class ZuoraBeanMap extends BeanMap {

	private static final DatatypeFactory datatypeFactory;
	static {
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}
	
	private Transformer dateTransformer = new Transformer() {
		
		@Override
		public Object transform(Object input) {
			if (input instanceof Date) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime((Date) input);
				return datatypeFactory.newXMLGregorianCalendar((GregorianCalendar) calendar);
			}
			return null;
		}
	};
	
	public ZuoraBeanMap() {
		super();
	}

	public ZuoraBeanMap(Object bean) {
		super(bean);
	}

	@Override
	public Object get(Object name) {
		Method method = getWriteMethod( name );
        if ( method == null ) {
            return getZObject().getCustomField((String)name);
        } else {
        	return super.get(name);
        }
	}

	@Override
	public Object put(Object name, Object value)
			throws IllegalArgumentException, ClassCastException {
		Method method = getWriteMethod( name );
        if ( method == null ) {
        	ZObject zobject = getZObject();
            Object existing = zobject.getCustomField((String)name);
            zobject.setCustomField((String)name, value);
            return existing;
        }
        
		return super.put(name, value);
	}

	@Override
	protected Transformer getTypeTransformer(Class aType) {
		if (XMLGregorianCalendar.class.isAssignableFrom(aType)) {
			return dateTransformer;
		}
		
		return super.getTypeTransformer(aType);
	}

	private ZObject getZObject() {
		return (ZObject)getBean();
	}

}
