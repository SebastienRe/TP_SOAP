package src.Q2.client;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import src.Q2.serveur.IServeur;

import java.net.URL;

public class Client {
    public static void main(String[] args) throws Exception {
        String nameSpaceURI = "http://serveur.Q2.src/";
        String nomService = "MonService";
        URL wsdlUrl = new URL("http://localhost:8080/WSSOAPQ2/" + nomService + "Service?wsdl");
        QName qname = new QName(nameSpaceURI, nomService + "Service");
        Service service = Service.create(wsdlUrl, qname);

        QName qport = new QName(nameSpaceURI, nomService + "Port");
        IServeur monService = service.getPort(qport, IServeur.class);

        String a = monService.direBonjour("John");
        System.out.println(a);
    }
}