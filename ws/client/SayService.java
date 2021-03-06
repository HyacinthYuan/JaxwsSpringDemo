
package test.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SayService", targetNamespace = "http://test/", wsdlLocation = "http://localhost:8080/EHost/SayPort?wsdl")
public class SayService
    extends Service
{

    private final static URL SAYSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(test.ws.client.SayService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = test.ws.client.SayService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/EHost/SayPort?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/EHost/SayPort?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SAYSERVICE_WSDL_LOCATION = url;
    }

    public SayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayService() {
        super(SAYSERVICE_WSDL_LOCATION, new QName("http://test/", "SayService"));
    }

    /**
     * 
     * @return
     *     returns SayImpl
     */
    @WebEndpoint(name = "SayPort")
    public SayImpl getSayPort() {
        return super.getPort(new QName("http://test/", "SayPort"), SayImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayImpl
     */
    @WebEndpoint(name = "SayPort")
    public SayImpl getSayPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://test/", "SayPort"), SayImpl.class, features);
    }

}
