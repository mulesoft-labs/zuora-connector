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

/**
 * Generated class, please do not edit.
 */
public class SubscribeResponse_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SubscribeResponse_element() {
  }
    
  
  /**
   * element  : result of type {http://api.zuora.com/}SubscribeResult
   * java type: com.sforce.soap.SubscribeResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","result","http://api.zuora.com/","SubscribeResult",0,-1,true);

  private boolean result__is_set = false;

  private com.zuora.api.object.SubscribeResult[] result = new com.zuora.api.object.SubscribeResult[0];

  public com.zuora.api.object.SubscribeResult[] getResult() {
    return result;
  }

  

  public void setResult(com.zuora.api.object.SubscribeResult[] result) {
    this.result = result;
    result__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, result__typeInfo, result, result__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.isElement(__in, result__typeInfo)) {
      setResult((com.zuora.api.object.SubscribeResult[])__typeMapper.readObject(__in, result__typeInfo, com.zuora.api.object.SubscribeResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SubscribeResponse_element ");
    
    sb.append(" result=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(result)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}