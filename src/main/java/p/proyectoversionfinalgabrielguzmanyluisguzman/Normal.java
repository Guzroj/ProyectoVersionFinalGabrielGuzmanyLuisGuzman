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

public class Normal {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();


            Document documento = implementation.createDocument(null, "Normal", null);
            documento.setXmlVersion("1.0");

            Element cancion = documento.createElement("cancion");
            Element canciones = documento.createElement("canciones");


            Element Artista = documento.createElement("Artista");
            Text textArtista = documento.createTextNode("Nirvana");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Element Genero = documento.createElement("Genero");
            Text textGenero = documento.createTextNode("Rock");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            Element album = documento.createElement("Album");
            Text textAlbum = documento.createTextNode("Nevermind");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Element Year = documento.createElement("Year");
            Text textYear = documento.createTextNode("1991");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Element Nombrec = documento.createElement("Nombre");
            Text textNombrec = documento.createTextNode("Something In The Way");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            Element url = documento.createElement("Url");
            Text textUrl = documento.createTextNode("Musica/Normal/Something In The Way.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("Coolio");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("Rap");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("Gangsta's Paradise");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("1995");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("Gangsta's Paradise");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Normal/Gangstas Paradise.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("The White Stripes");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("Rock");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("Elephant");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("2003");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("The Seven Nation Army");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Normal/Seven Nation Army.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);


            Artista = documento.createElement("Artista");
            textArtista = documento.createTextNode("Rob Stone");
            Artista.appendChild(textArtista);
            cancion.appendChild(Artista);
            Genero = documento.createElement("Genero");
            textGenero = documento.createTextNode("Rap");
            Genero.appendChild(textGenero);
            cancion.appendChild(Genero);
            album = documento.createElement("Album");
            textAlbum = documento.createTextNode("Chill Bill");
            album.appendChild(textAlbum);
            cancion.appendChild(album);
            Year = documento.createElement("Year");
            textYear = documento.createTextNode("2014");
            Year.appendChild(textYear);
            cancion.appendChild(Year);
            Nombrec = documento.createElement("Nombre");
            textNombrec = documento.createTextNode("Chill Bill");
            Nombrec.appendChild(textNombrec);
            cancion.appendChild(Nombrec);
            url = documento.createElement("Url");
            textUrl = documento.createTextNode("Musica/Normal/Chill Bill.mp3");
            url.appendChild(textUrl);
            cancion.appendChild(url);

            canciones.appendChild(cancion);
            documento.getDocumentElement().appendChild(canciones);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Normal.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Basado.class.getName()).log(Level.SEVERE,null,ex);
        } catch (TransformerException e) {
            throw new RuntimeException(e);

        }
    }
}
