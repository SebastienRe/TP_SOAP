
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import wsimport.MonService;

import java.net.URL;

public class Client {
    public static void main(String[] args) throws Exception {
        String nameSpaceURI = "http://serveur.Q3.src/";
        String nomService = "MonService";
        URL wsdlUrl = new URL("http://localhost:8080/WSSOAP/" + nomService + "Service?wsdl");
        QName qname = new QName(nameSpaceURI, nomService + "Service");
        Service service = Service.create(wsdlUrl, qname);

        QName qport = new QName(nameSpaceURI, nomService + "Port");
        MonService monService = service.getPort(qport, MonService.class);

        String a = monService.direBonjour("John");
        System.out.println(a);
    }
}