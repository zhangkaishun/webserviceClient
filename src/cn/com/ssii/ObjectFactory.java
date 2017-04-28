
package cn.com.ssii;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.ssii package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendLaStoreHouse_QNAME = new QName("http://www.ssii.com.cn", "sendLaStoreHouse");
    private final static QName _SendLaStoreHouseResponse_QNAME = new QName("http://www.ssii.com.cn", "sendLaStoreHouseResponse");
    private final static QName _AuthResponse_QNAME = new QName("http://www.ssii.com.cn", "authResponse");
    private final static QName _Auth_QNAME = new QName("http://www.ssii.com.cn", "auth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.ssii
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthResponse }
     * 
     */
    public AuthResponse createAuthResponse() {
        return new AuthResponse();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link SendLaStoreHouseResponse }
     * 
     */
    public SendLaStoreHouseResponse createSendLaStoreHouseResponse() {
        return new SendLaStoreHouseResponse();
    }

    /**
     * Create an instance of {@link SendLaStoreHouse }
     * 
     */
    public SendLaStoreHouse createSendLaStoreHouse() {
        return new SendLaStoreHouse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLaStoreHouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ssii.com.cn", name = "sendLaStoreHouse")
    public JAXBElement<SendLaStoreHouse> createSendLaStoreHouse(SendLaStoreHouse value) {
        return new JAXBElement<SendLaStoreHouse>(_SendLaStoreHouse_QNAME, SendLaStoreHouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendLaStoreHouseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ssii.com.cn", name = "sendLaStoreHouseResponse")
    public JAXBElement<SendLaStoreHouseResponse> createSendLaStoreHouseResponse(SendLaStoreHouseResponse value) {
        return new JAXBElement<SendLaStoreHouseResponse>(_SendLaStoreHouseResponse_QNAME, SendLaStoreHouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ssii.com.cn", name = "authResponse")
    public JAXBElement<AuthResponse> createAuthResponse(AuthResponse value) {
        return new JAXBElement<AuthResponse>(_AuthResponse_QNAME, AuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ssii.com.cn", name = "auth")
    public JAXBElement<Auth> createAuth(Auth value) {
        return new JAXBElement<Auth>(_Auth_QNAME, Auth.class, null, value);
    }

}
