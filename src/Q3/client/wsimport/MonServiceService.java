
package wsimport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/3.0.3 (RELEASE-3.0.3-7a63cef; 2021-10-13T11:40:48+0000)
 * JAXWS-RI/3.0.2 JAXWS-API/3.0.1 JAXB-RI/3.0.2 JAXB-API/3.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "MonServiceService", targetNamespace = "http://serveur.Q3.src/", wsdlLocation = "http://localhost:8080/WSSOAPQ3/MonServiceService?wsdl")
public class MonServiceService
        extends Service {

    private final static URL MONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MONSERVICESERVICE_EXCEPTION;
    private final static QName MONSERVICESERVICE_QNAME = new QName("http://serveur.Q3.src/", "MonServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSSOAPQ3/MonServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MONSERVICESERVICE_WSDL_LOCATION = url;
        MONSERVICESERVICE_EXCEPTION = e;
    }

    public MonServiceService() {
        super(__getWsdlLocation(), MONSERVICESERVICE_QNAME);
    }

    public MonServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MONSERVICESERVICE_QNAME, features);
    }

    public MonServiceService(URL wsdlLocation) {
        super(wsdlLocation, MONSERVICESERVICE_QNAME);
    }

    public MonServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MONSERVICESERVICE_QNAME, features);
    }

    public MonServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *         returns MonService
     */
    @WebEndpoint(name = "MonServicePort")
    public MonService getMonServicePort() {
        return super.getPort(new QName("http://serveur.Q3.src/", "MonServicePort"), MonService.class);
    }

    /**
     * 
     * @param features
     *                 A list of {@link jakarta.xml.ws.WebServiceFeature} to
     *                 configure on the proxy. Supported features not in the
     *                 <code>features</code> parameter will have their default
     *                 values.
     * @return
     *         returns MonService
     */
    @WebEndpoint(name = "MonServicePort")
    public MonService getMonServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serveur.Q3.src/", "MonServicePort"), MonService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MONSERVICESERVICE_EXCEPTION != null) {
            throw MONSERVICESERVICE_EXCEPTION;
        }
        return MONSERVICESERVICE_WSDL_LOCATION;
    }

}
