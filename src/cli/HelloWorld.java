/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cli;

public interface HelloWorld extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldHttpSoap11EndpointAddress();

    public cli.HelloWorldPortType getHelloWorldHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public cli.HelloWorldPortType getHelloWorldHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHelloWorldHttpSoap12EndpointAddress();

    public cli.HelloWorldPortType getHelloWorldHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException;

    public cli.HelloWorldPortType getHelloWorldHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
