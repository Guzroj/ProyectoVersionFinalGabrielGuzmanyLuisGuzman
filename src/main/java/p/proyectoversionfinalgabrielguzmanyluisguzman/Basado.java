package p.proyectoversionfinalgabrielguzmanyluisguzman;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Basado es utilizado para crear un xml.
 * Crea un xml desde 0, de forma que se puede manipular.
 * @author Gabriel
 * @version 1.0
 */
public class Basado {

    /**
     *
     * @param args utilizado para poder hacer que basado se cree.
     */

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();


            Document documento = implementation.createDocument(null, "Basado", null);
            documento.setXmlVersion("1.0");

            Element cancion = documento.createElement("cancion");
            Element canciones = documento.createElement("canciones");


            Element Artista = documento.createElement("Artista");
            Text textArtista = documento.createTextNode("Aqua Timez");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Element Genero = documento.createElement("Genero");
            Text textGenero = documento.createTextNode("Jpop");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            Element album = documento.createElement("Album");
            Text textAlbum = documento.createTextNode("Aqua Timez");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Element Year = documento.createElement("Year");
            Text textYear = documento.createTextNode("2007");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Element Nombrec = documento.createElement("Nombre");
            Text textNombrec = documento.createTextNode("Alones");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            Element url = documento.createElement("Url");
            Text textUrl = documento.createTextNode("Musica/Basado/Alones.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("Folder 5");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("Jpop");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("Believe");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("2001");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("Believe");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Basado/Believe.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("Penguin Research");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("JPop");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("Button");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("2012");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("Button");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Basado/Button.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("Lisa");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("Jpop");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("My Soul Your beats");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("2011");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("My Soul Your beats");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Basado/My soul your beats.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);

            canciones.appendChild(cancion);
            documento.getDocumentElement().appendChild(canciones);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Basado.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Basado.class.getName()).log(Level.SEVERE,null,ex);
        } catch (TransformerException e) {
            throw new RuntimeException(e);

        }
    }
}