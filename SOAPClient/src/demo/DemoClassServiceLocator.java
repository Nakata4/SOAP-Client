/**
 * DemoClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

public class DemoClassServiceLocator extends org.apache.axis.client.Service implements demo.DemoClassService {

    public DemoClassServiceLocator() {
    }


    public DemoClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoClass
    private java.lang.String DemoClass_address = "http://localhost:8005/SOAP/services/DemoClass";

    public java.lang.String getDemoClassAddress() {
        return DemoClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoClassWSDDServiceName = "DemoClass";

    public java.lang.String getDemoClassWSDDServiceName() {
        return DemoClassWSDDServiceName;
    }

    public void setDemoClassWSDDServiceName(java.lang.String name) {
        DemoClassWSDDServiceName = name;
    }

    public demo.DemoClass getDemoClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoClass(endpoint);
    }

    public demo.DemoClass getDemoClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            demo.DemoClassSoapBindingStub _stub = new demo.DemoClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getDemoClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoClassEndpointAddress(java.lang.String address) {
        DemoClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (demo.DemoClass.class.isAssignableFrom(serviceEndpointInterface)) {
                demo.DemoClassSoapBindingStub _stub = new demo.DemoClassSoapBindingStub(new java.net.URL(DemoClass_address), this);
                _stub.setPortName(getDemoClassWSDDServiceName());
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
        if ("DemoClass".equals(inputPortName)) {
            return getDemoClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo", "DemoClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo", "DemoClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoClass".equals(portName)) {
            setDemoClassEndpointAddress(address);
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


	public DemoClassService getDemoClassService() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String fetchFilm(String filmName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Call createCall() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Call createCall(QName arg0) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Call createCall(QName arg0, QName arg1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Call createCall(QName arg0, String arg1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Call[] getCalls(QName arg0) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HandlerRegistry getHandlerRegistry() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TypeMappingRegistry getTypeMappingRegistry() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public URL getWSDLDocumentLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
