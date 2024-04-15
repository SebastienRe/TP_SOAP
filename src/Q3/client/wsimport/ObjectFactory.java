
package wsimport;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsimport package. 
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

    private final static QName _DireBonjour_QNAME = new QName("http://serveur.Q3.src/", "direBonjour");
    private final static QName _DireBonjourResponse_QNAME = new QName("http://serveur.Q3.src/", "direBonjourResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DireBonjour }
     * 
     */
    public DireBonjour createDireBonjour() {
        return new DireBonjour();
    }

    /**
     * Create an instance of {@link DireBonjourResponse }
     * 
     */
    public DireBonjourResponse createDireBonjourResponse() {
        return new DireBonjourResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DireBonjour }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DireBonjour }{@code >}
     */
    @XmlElementDecl(namespace = "http://serveur.Q3.src/", name = "direBonjour")
    public JAXBElement<DireBonjour> createDireBonjour(DireBonjour value) {
        return new JAXBElement<DireBonjour>(_DireBonjour_QNAME, DireBonjour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DireBonjourResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DireBonjourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serveur.Q3.src/", name = "direBonjourResponse")
    public JAXBElement<DireBonjourResponse> createDireBonjourResponse(DireBonjourResponse value) {
        return new JAXBElement<DireBonjourResponse>(_DireBonjourResponse_QNAME, DireBonjourResponse.class, null, value);
    }

}
