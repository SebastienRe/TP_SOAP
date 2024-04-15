package src.Q3.serveur;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

// @WebService(endpointInterface = "serveur.IServeur", targetNamespace = "http://serveur/")
@WebService
public interface IServeur {

    @WebMethod
    String direBonjour(String nom);
}
