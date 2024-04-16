
package src.Q4.serveur;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

// @WebService(endpointInterface = "serveur.IServeur", targetNamespace = "http://serveur/")
@WebService
public class MonService implements IServeur {

    @WebMethod
    public String direBonjour(String nom) {
        return "Bonjour " + nom;
    }
}