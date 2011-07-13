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
public class QueryOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public QueryOptions_element() {
  }
    
  
  /**
   * element  : batchSize of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo batchSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","batchSize","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean batchSize__is_set = false;

  private int batchSize;

  public int getBatchSize() {
    return batchSize;
  }

  

  public void setBatchSize(int batchSize) {
    this.batchSize = batchSize;
    batchSize__is_set = true;
  }
  
  /**
   * element  : caseSensitive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo caseSensitive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","caseSensitive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean caseSensitive__is_set = false;

  private boolean caseSensitive;

  public boolean getCaseSensitive() {
    return caseSensitive;
  }

  

  public boolean isCaseSensitive() {
    return caseSensitive;
  }

  

  public void setCaseSensitive(boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    caseSensitive__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeInt(__out, batchSize__typeInfo, batchSize, batchSize__is_set);
    __typeMapper.writeBoolean(__out, caseSensitive__typeInfo, caseSensitive, caseSensitive__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, batchSize__typeInfo)) {
      setBatchSize((int)__typeMapper.readInt(__in, batchSize__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, caseSensitive__typeInfo)) {
      setCaseSensitive((boolean)__typeMapper.readBoolean(__in, caseSensitive__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[QueryOptions_element ");
    sb.append(super.toString());
    sb.append(" batchSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(batchSize)+"'\n");
    sb.append(" caseSensitive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(caseSensitive)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}