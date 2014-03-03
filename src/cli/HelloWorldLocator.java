/**
 * HelloWorldLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cli;


public class HelloWorldLocator extends org.apache.axis.client.Service implements cli.HelloWorld {

    public HelloWorldLocator() {
    }


    public HelloWorldLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorldLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorldHttpSoap11Endpoint
    private java.lang.String HelloWorldHttpSoap11Endpoint_address = "http://jupiter:8080/axis2/services/HelloWorld.HelloWorldHttpSoap11Endpoint/";
    //private java.lang.String HelloWorldHttpSoap11Endpoint_address = "http://localhost:8080/axis2/services/HelloWorld.HelloWorldHttpSoap11Endpoint/";

    public java.lang.String getHelloWorldHttpSoap11EndpointAddress() {
        return HelloWorldHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldHttpSoap11EndpointWSDDServiceName = "HelloWorldHttpSoap11Endpoint";

    public java.lang.String getHelloWorldHttpSoap11EndpointWSDDServiceName() {
        return HelloWorldHttpSoap11EndpointWSDDServiceName;
    }

    public void setHelloWorldHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        HelloWorldHttpSoap11EndpointWSDDServiceName = name;
    }

    public cli.HelloWorldPortType getHelloWorldHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldHttpSoap11Endpoint(endpoint);
    }

    public cli.HelloWorldPortType getHelloWorldHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cli.HelloWorldSoap11BindingStub _stub = new cli.HelloWorldSoap11BindingStub(portAddress, this);
            _stub.setPortName(getHelloWorldHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        HelloWorldHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for HelloWorldHttpSoap12Endpoint
    private java.lang.String HelloWorldHttpSoap12Endpoint_address = "http://jupiter:8080/axis2/services/HelloWorld.HelloWorldHttpSoap12Endpoint/";
    //private java.lang.String HelloWorldHttpSoap12Endpoint_address = "http://localhost:8080/axis2/services/HelloWorld.HelloWorldHttpSoap12Endpoint/";

    public java.lang.String getHelloWorldHttpSoap12EndpointAddress() {
        return HelloWorldHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldHttpSoap12EndpointWSDDServiceName = "HelloWorldHttpSoap12Endpoint";

    public java.lang.String getHelloWorldHttpSoap12EndpointWSDDServiceName() {
        return HelloWorldHttpSoap12EndpointWSDDServiceName;
    }

    public void setHelloWorldHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        HelloWorldHttpSoap12EndpointWSDDServiceName = name;
    }

    public cli.HelloWorldPortType getHelloWorldHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldHttpSoap12Endpoint(endpoint);
    }

    public cli.HelloWorldPortType getHelloWorldHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cli.HelloWorldSoap12BindingStub _stub = new cli.HelloWorldSoap12BindingStub(portAddress, this);
            _stub.setPortName(getHelloWorldHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        HelloWorldHttpSoap12Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cli.HelloWorldPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cli.HelloWorldSoap11BindingStub _stub = new cli.HelloWorldSoap11BindingStub(new java.net.URL(HelloWorldHttpSoap11Endpoint_address), this);
                _stub.setPortName(getHelloWorldHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (cli.HelloWorldPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cli.HelloWorldSoap12BindingStub _stub = new cli.HelloWorldSoap12BindingStub(new java.net.URL(HelloWorldHttpSoap12Endpoint_address), this);
                _stub.setPortName(getHelloWorldHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorldHttpSoap11Endpoint".equals(inputPortName)) {
            return getHelloWorldHttpSoap11Endpoint();
        }
        else if ("HelloWorldHttpSoap12Endpoint".equals(inputPortName)) {
            return getHelloWorldHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "HelloWorld");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example", "HelloWorldHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://example", "HelloWorldHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorldHttpSoap11Endpoint".equals(portName)) {
            setHelloWorldHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("HelloWorldHttpSoap12Endpoint".equals(portName)) {
            setHelloWorldHttpSoap12EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
