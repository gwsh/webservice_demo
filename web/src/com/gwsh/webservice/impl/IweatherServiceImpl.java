
package com.gwsh.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IweatherServiceImpl", targetNamespace = "http://impl.webservice.gwsh.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IweatherServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "query", targetNamespace = "http://impl.webservice.gwsh.com/", className = "com.gwsh.webservice.impl.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://impl.webservice.gwsh.com/", className = "com.gwsh.webservice.impl.QueryResponse")
    @Action(input = "http://impl.webservice.gwsh.com/IweatherServiceImpl/queryRequest", output = "http://impl.webservice.gwsh.com/IweatherServiceImpl/queryResponse")
    public String query(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
