
package org.iesvi.ws;

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
@WebServiceClient(name = "BookImplService", targetNamespace = "http://ws.iesvi.org/", wsdlLocation = "http://localhost:1516/WS/Books?wsdl")
public class BookImplService
    extends Service
{

    private final static URL BOOKIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKIMPLSERVICE_EXCEPTION;
    private final static QName BOOKIMPLSERVICE_QNAME = new QName("http://ws.iesvi.org/", "BookImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1516/WS/Books?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKIMPLSERVICE_WSDL_LOCATION = url;
        BOOKIMPLSERVICE_EXCEPTION = e;
    }

    public BookImplService() {
        super(__getWsdlLocation(), BOOKIMPLSERVICE_QNAME);
    }

    public BookImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKIMPLSERVICE_QNAME, features);
    }

    public BookImplService(URL wsdlLocation) {
        super(wsdlLocation, BOOKIMPLSERVICE_QNAME);
    }

    public BookImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKIMPLSERVICE_QNAME, features);
    }

    public BookImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Book
     */
    @WebEndpoint(name = "BookImplPort")
    public Book getBookImplPort() {
        return super.getPort(new QName("http://ws.iesvi.org/", "BookImplPort"), Book.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Book
     */
    @WebEndpoint(name = "BookImplPort")
    public Book getBookImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.iesvi.org/", "BookImplPort"), Book.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKIMPLSERVICE_EXCEPTION!= null) {
            throw BOOKIMPLSERVICE_EXCEPTION;
        }
        return BOOKIMPLSERVICE_WSDL_LOCATION;
    }

}
