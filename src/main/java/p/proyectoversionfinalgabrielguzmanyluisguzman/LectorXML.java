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

        public void reader(String nombre) {
            String path = nombre + ".xml";
            System.out.println(path);
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

                    for (int j = 0; j < hijos.getLength(); j = j + 6) {
                        Node hijo = hijos.item(j);
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            String vnombre = (hijo.getTextContent());
                            Element eHijo = (Element) hijo;
                            System.out.println(hijo.getNodeName() + " : " + hijo.getTextContent());
                        }
                    }
                }
                System.out.println();


            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    public NodeList getPlaylistSongs(String nombre) {
        String path = nombre + ".xml";
        NodeList hijos = null;
        System.out.println(path);
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
                hijos = e.getChildNodes();
                return hijos;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        return hijos;
    }
}