package p.proyectoversionfinalgabrielguzmanyluisguzman;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.IOException;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Button playButton;
    private Media media;
    private MediaPlayer mediaPlayer;


    //Lista bibliotecas = new Lista();
    @FXML
    ListView<String> listviewpl;


    Lista playlist = new Lista();

    Lista canciones = new Lista();
    Lista cancionespl = new Lista();

    @FXML
    ListView<String> listviewallsongs;
    @FXML
    ListView<String> listviewplsongs;
    LectorXML prueba = new LectorXML();

    String pl = "";

    private String prueba_num = "";


    public void switchtologin(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchtobibliotecas(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("bibliotecas.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void switchtocanciones(ActionEvent event) {
        ObservableList<String> playlist;
        String message = "";

        playlist = listviewpl.getSelectionModel().getSelectedItems();

        for (String m : playlist) {
            message += m + "\n";
        }
        System.out.println(message);
        try {
            root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cargarallsongs();
    }

    public void switchtoReproductor(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Reproductor.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Reproductor mp = new Reproductor();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void agregarpl() {
        playlist.agregarAlFinal("Basado");
        playlist.agregarAlFinal("Normal");
    }


    public void cargarpl() {
        agregarpl();
        int i;
        for (i = 0; i < playlist.getSize(); i++) {
            try {
                String biblioteca = playlist.getValor(i);
                listviewpl.getItems().add(biblioteca);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        listviewpl.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void cargarallsongs() {
        NodeList all_songs = prueba.getPlaylistSongs("Normal");
        for (int j = 4; j < all_songs.getLength(); j = j + 6) {
            org.w3c.dom.Node hijo = all_songs.item(j);
            String vnombre = (hijo.getTextContent().toString());
            if (hijo.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element eHijo = (Element) hijo;
                System.out.println(hijo.getNodeName() + " : " + hijo.getTextContent());
                canciones.agregarAlFinal(vnombre);

            }

        }
        int i;
        for (i = 0; i < canciones.getSize(); i++) {
            try {
                String cancion = canciones.getValor(i);
                listviewallsongs.getItems().add(cancion);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        listviewallsongs.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    public void showsongs() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        NodeList lista_songs = prueba.getPlaylistSongs("Normal");
        for (int j = 4; j < lista_songs.getLength(); j = j + 6) {
            org.w3c.dom.Node hijo = lista_songs.item(j);
            String vnombre = (hijo.getTextContent());
            if (hijo.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element eHijo = (Element) hijo;
                System.out.println(hijo.getNodeName() + " : " + hijo.getTextContent());
                cancionespl.agregarAlFinal(vnombre);

            }

        }
        int i;
        for (i = 0; i < cancionespl.getSize(); i++) {
            try {
                String cancion = cancionespl.getValor(i);
                listviewplsongs.getItems().add(cancion);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        listviewplsongs.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        System.out.println("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public void getUrl() {
        //System.out.println("buenas");
        NodeList lista_songs = prueba.getPlaylistSongs("Basado");
        for (int j = 5; j < lista_songs.getLength(); j = j + 6) {
            org.w3c.dom.Node hijo = lista_songs.item(j);
            String vnombre = (hijo.getTextContent());
            if (hijo.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element eHijo = (Element) hijo;
                System.out.println(hijo.getTextContent());
                cancionespl.agregarAlFinal(vnombre);

            }
        }
    }




        public void Reproductor() {
            Controller songs= new Controller();
            songs.getUrl();

            media = new Media(songs.toString());
            mediaPlayer = new MediaPlayer(media);
        }


        public void playMedia() {
            mediaPlayer.play();
        }



    }