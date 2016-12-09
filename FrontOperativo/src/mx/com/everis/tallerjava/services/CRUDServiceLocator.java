/**
 * CRUDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.tallerjava.services;

public class CRUDServiceLocator extends org.apache.axis.client.Service implements mx.com.everis.tallerjava.services.CRUDService {

    public CRUDServiceLocator() {
    }


    public CRUDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CRUDServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CRUDPort
    private java.lang.String CRUDPort_address = "http://localhost:8080/WSCRUD/CRUDService";

    public java.lang.String getCRUDPortAddress() {
        return CRUDPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CRUDPortWSDDServiceName = "CRUDPort";

    public java.lang.String getCRUDPortWSDDServiceName() {
        return CRUDPortWSDDServiceName;
    }

    public void setCRUDPortWSDDServiceName(java.lang.String name) {
        CRUDPortWSDDServiceName = name;
    }

    public mx.com.everis.tallerjava.services.CRUD getCRUDPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CRUDPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCRUDPort(endpoint);
    }

    public mx.com.everis.tallerjava.services.CRUD getCRUDPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.everis.tallerjava.services.CRUDPortBindingStub _stub = new mx.com.everis.tallerjava.services.CRUDPortBindingStub(portAddress, this);
            _stub.setPortName(getCRUDPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCRUDPortEndpointAddress(java.lang.String address) {
        CRUDPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.everis.tallerjava.services.CRUD.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.everis.tallerjava.services.CRUDPortBindingStub _stub = new mx.com.everis.tallerjava.services.CRUDPortBindingStub(new java.net.URL(CRUDPort_address), this);
                _stub.setPortName(getCRUDPortWSDDServiceName());
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
        if ("CRUDPort".equals(inputPortName)) {
            return getCRUDPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.tallerjava.everis.com.mx/", "CRUDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.tallerjava.everis.com.mx/", "CRUDPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CRUDPort".equals(portName)) {
            setCRUDPortEndpointAddress(address);
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
