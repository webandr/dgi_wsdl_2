package org.tempuri;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;


@WebServiceClient(name = "DgiService1ImplService",
        targetNamespace = "http://tempuri.org/",
        wsdlLocation = "http://10.64.121.67/BrRemote/Service1.svc?wsdl")
public class DgiService1ImplService extends Service {

    private final static URL COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COUNTRYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName COUNTRYSERVICEIMPLSERVICE_QNAME =
            new QName("http://tempuri.org/", "DgiService1ImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/ws/country?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        COUNTRYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DgiService1ImplService() {
        super(__getWsdlLocation(), COUNTRYSERVICEIMPLSERVICE_QNAME);
    }

    // other constructors

    @WebEndpoint(name = "DgiService1ImplPort")
    public IService1 getDgiService1ImplPort() {
        return super.getPort(new QName("http://tempuri.org/", "CountryServiceImplPort"),
                IService1.class);
    }

    private static URL __getWsdlLocation() {
        if (COUNTRYSERVICEIMPLSERVICE_EXCEPTION != null) {
            throw COUNTRYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return COUNTRYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}