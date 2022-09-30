package p.proyectoversionfinalgabrielguzmanyluisguzman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        /*Lista song= new Lista();

        song.add(new File("Musica/Basado/Alones.mp3"));
        song.add(new File("Musica/Basado/Believe.mp3"));

        Lista mostrar= new Lista();
        mostrar.desplegarnodo();*/
        launch();
    }
}
