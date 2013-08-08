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

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mule.modules.zuora.zobject.ElementBuilders;
import org.w3c.dom.Element;

/**
 * Base class for Zuora objects that simplifies accessing customizable properties -
 * properties that may be defined by user
 *
 * @author flbulgarelli
 */
public abstract class Dynamic
{

    /**
     * Answers the dynamic property elements. Warning: this method is CXF specific and
     * its usage is discouraged
     * @return a collection of elements, if this object has true dynamic properties
     */
    protected List<Element> getAny()
    {
        throw new UnsupportedOperationException("Instances of class " + this.getClass()
                                                + " have not dynamic properties. Use normal getters and setters instead");
    }

    public void setCustomField(String name, Object value)
    {
        Element element = getElement(this, name);
        if (element != null)
        {
            element.setTextContent((String) value);
        }
        else
        {
        	if (!(value instanceof String)) {
        		
        	}
            this.getAny().add(ElementBuilders.newElement(name, (String) value));
        }
    }

    protected String toPropertyName(String name)
    {
        return StringUtils.uncapitalize(name);
    }
    
    public Object getCustomField(final String name)
    {
        Element element = getElement(this, name);
        return element != null ? element.getTextContent() : null;
    }

    private static Element getElement(Dynamic object, final String name)
    {
        try
        {
            return (Element) CollectionUtils.find(object.getAny(), new Predicate()
            {
                public boolean evaluate(Object object)
                {
                    return object instanceof Element && ((Element) object).getLocalName().equals(name);
                }
            });
        }
        catch (UnsupportedOperationException e)
        {
            throw new UnsupportedOperationException("There is no property " + name, e);
        }
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

}
