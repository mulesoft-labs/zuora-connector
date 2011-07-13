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
public class DeleteResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DeleteResult() {
  }
    
  
  /**
   * element  : errors of type {http://api.zuora.com/}Error
   * java type: com.sforce.soap.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","errors","http://api.zuora.com/","Error",0,-1,true);

  private boolean errors__is_set = false;

  private com.zuora.api.object.Error[] errors = new com.zuora.api.object.Error[0];

  public com.zuora.api.object.Error[] getErrors() {
    return errors;
  }

  

  public void setErrors(com.zuora.api.object.Error[] errors) {
    this.errors = errors;
    errors__is_set = true;
  }
  
  /**
   * element  : id of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","id","http://api.zuora.com/","ID",0,1,true);

  private boolean id__is_set = false;

  private java.lang.String id;

  public java.lang.String getId() {
    return id;
  }

  

  public void setId(java.lang.String id) {
    this.id = id;
    id__is_set = true;
  }
  
  /**
   * element  : success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","success","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean success__is_set = false;

  private boolean success;

  public boolean getSuccess() {
    return success;
  }

  

  public boolean isSuccess() {
    return success;
  }

  

  public void setSuccess(boolean success) {
    this.success = success;
    success__is_set = true;
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
   
    __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
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
    if (__typeMapper.isElement(__in, errors__typeInfo)) {
      setErrors((com.zuora.api.object.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.zuora.api.object.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DeleteResult ");
    
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}