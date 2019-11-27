/**
 * UsuarioServicioImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.uan.servicio;

public class UsuarioServicioImplServiceLocator extends org.apache.axis.client.Service implements co.edu.uan.servicio.UsuarioServicioImplService {

    public UsuarioServicioImplServiceLocator() {
    }


    public UsuarioServicioImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UsuarioServicioImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UsuarioServicioImpl
    private java.lang.String UsuarioServicioImpl_address = "http://localhost:8080/usuarios/services/UsuarioServicioImpl";

    public java.lang.String getUsuarioServicioImplAddress() {
        return UsuarioServicioImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UsuarioServicioImplWSDDServiceName = "UsuarioServicioImpl";

    public java.lang.String getUsuarioServicioImplWSDDServiceName() {
        return UsuarioServicioImplWSDDServiceName;
    }

    public void setUsuarioServicioImplWSDDServiceName(java.lang.String name) {
        UsuarioServicioImplWSDDServiceName = name;
    }

    public co.edu.uan.servicio.UsuarioServicioImpl getUsuarioServicioImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UsuarioServicioImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUsuarioServicioImpl(endpoint);
    }

    public co.edu.uan.servicio.UsuarioServicioImpl getUsuarioServicioImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.edu.uan.servicio.UsuarioServicioImplSoapBindingStub _stub = new co.edu.uan.servicio.UsuarioServicioImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getUsuarioServicioImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUsuarioServicioImplEndpointAddress(java.lang.String address) {
        UsuarioServicioImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.edu.uan.servicio.UsuarioServicioImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                co.edu.uan.servicio.UsuarioServicioImplSoapBindingStub _stub = new co.edu.uan.servicio.UsuarioServicioImplSoapBindingStub(new java.net.URL(UsuarioServicioImpl_address), this);
                _stub.setPortName(getUsuarioServicioImplWSDDServiceName());
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
        if ("UsuarioServicioImpl".equals(inputPortName)) {
            return getUsuarioServicioImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicio.uan.edu.co", "UsuarioServicioImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicio.uan.edu.co", "UsuarioServicioImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UsuarioServicioImpl".equals(portName)) {
            setUsuarioServicioImplEndpointAddress(address);
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
