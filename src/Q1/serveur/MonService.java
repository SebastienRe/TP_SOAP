package src.Q1.serveur;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public class MonService {

    @WebMethod
    public String direBonjour(String nom) {
        return "Bonjour " + nom;
    }
}
