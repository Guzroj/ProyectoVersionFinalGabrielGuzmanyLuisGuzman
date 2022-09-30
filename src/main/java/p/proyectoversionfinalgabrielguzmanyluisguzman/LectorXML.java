package p.proyectoversionfinalgabrielguzmanyluisguzman;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class LectorXML {
    public void reader (String nombre) {
        String path = nombre+".xml";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        try {
            Document documento = builder.parse(new File(path));
            NodeList listaCanciones = documento.getElementsByTagName("cancion");

            int i;
            for (i = 0; 1 < listaCanciones.getLength(); i++) ;
            Node nodo = (Node) listaCanciones.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nodo;
                NodeList hijos = e.getChildNodes();
                for (int j = 0; j < hijos.getLength(); j = j + 1) {
                    Node hijo = hijos.item(j);
                    if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                        String vnombre = (hijo.getTextContent());
                        Element eHijo = (Element) hijo;
                        System.out.println(hijo.getNodeName() + " : " + hijo.getTextContent());
                        String hola = "1";
                        if (vnombre.equals(hola)) {
                            for (int a = j + 1; a < j + 2; a++) {
                                Node artista = hijos.item(a);
                                Node genero = hijos.item(a + 1);
                                Node album = hijos.item(a + 2);
                                Node year = hijos.item(a + 3);
                                Node url = hijos.item(a + 4);
                                String vartista = (artista.getTextContent());
                                String vgenero = (genero.getTextContent());
                                String valbum = (album.getTextContent());
                                int vyear = parseInt(year.getTextContent());
                                String vurl = (url.getTextContent());

                                System.out.println(url.getNodeName() + " : " + vurl);
                                System.out.println(vartista);
                                System.out.println(vgenero);
                                System.out.println(valbum);
                                System.out.println(vyear);
                                System.out.println(vurl);
                            }

                        }else{
                            System.out.println("Cancion no encontrada");
                        }
                    }
                }
            }





        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
