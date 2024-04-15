
package wsimport;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/3.0.3 (RELEASE-3.0.3-7a63cef; 2021-10-13T11:40:48+0000) JAXWS-RI/3.0.2 JAXWS-API/3.0.1 JAXB-RI/3.0.2 JAXB-API/3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "MonService", targetNamespace = "http://serveur.Q3.src/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "direBonjour", targetNamespace = "http://serveur.Q3.src/", className = "wsimport.DireBonjour")
    @ResponseWrapper(localName = "direBonjourResponse", targetNamespace = "http://serveur.Q3.src/", className = "wsimport.DireBonjourResponse")
    @Action(input = "http://serveur.Q3.src/MonService/direBonjourRequest", output = "http://serveur.Q3.src/MonService/direBonjourResponse")
    public String direBonjour(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
