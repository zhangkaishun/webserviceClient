
package com.thinkgem.jeesite.modules.wsinterface.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSIServiceImplService", targetNamespace = "http://impl.service.wsinterface.modules.jeesite.thinkgem.com/", wsdlLocation = "http://127.0.0.1:8070/zhny/ws/es/wsinterface?wsdl")
public class WSIServiceImplService
    extends Service
{

    private final static URL WSISERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSISERVICEIMPLSERVICE_EXCEPTION;
    private final static QName WSISERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.wsinterface.modules.jeesite.thinkgem.com/", "WSIServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8070/zhny/ws/es/wsinterface?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSISERVICEIMPLSERVICE_WSDL_LOCATION = url;
        WSISERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public WSIServiceImplService() {
        super(__getWsdlLocation(), WSISERVICEIMPLSERVICE_QNAME);
    }

    public WSIServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSISERVICEIMPLSERVICE_QNAME, features);
    }

    public WSIServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, WSISERVICEIMPLSERVICE_QNAME);
    }

    public WSIServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSISERVICEIMPLSERVICE_QNAME, features);
    }

    public WSIServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSIServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSIService
     */
    @WebEndpoint(name = "WSIServiceImplPort")
    public WSIService getWSIServiceImplPort() {
        return super.getPort(new QName("http://impl.service.wsinterface.modules.jeesite.thinkgem.com/", "WSIServiceImplPort"), WSIService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSIService
     */
    @WebEndpoint(name = "WSIServiceImplPort")
    public WSIService getWSIServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.wsinterface.modules.jeesite.thinkgem.com/", "WSIServiceImplPort"), WSIService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSISERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw WSISERVICEIMPLSERVICE_EXCEPTION;
        }
        return WSISERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
