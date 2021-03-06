package org.etsi.uri.ts102204.etsi204_kiuru_wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-11-23T11:52:20.724+01:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "MSS_ReceiptService",
                  wsdlLocation = "file:./mobileid.wsdl",
                  targetNamespace = "http://uri.etsi.org/TS102204/etsi204-kiuru.wsdl")
public class MSSReceiptService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://uri.etsi.org/TS102204/etsi204-kiuru.wsdl", "MSS_ReceiptService");
    public final static QName MSSReceiptPort = new QName("http://uri.etsi.org/TS102204/etsi204-kiuru.wsdl", "MSS_ReceiptPort");
    static {
        URL url = null;
        try {
            url = new URL("file:./mobileid.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MSSReceiptService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:./mobileid.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MSSReceiptService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MSSReceiptService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MSSReceiptService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MSSReceiptService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MSSReceiptService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MSSReceiptService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MSSReceiptType
     */
    @WebEndpoint(name = "MSS_ReceiptPort")
    public MSSReceiptType getMSSReceiptPort() {
        return super.getPort(MSSReceiptPort, MSSReceiptType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MSSReceiptType
     */
    @WebEndpoint(name = "MSS_ReceiptPort")
    public MSSReceiptType getMSSReceiptPort(WebServiceFeature... features) {
        return super.getPort(MSSReceiptPort, MSSReceiptType.class, features);
    }

}
