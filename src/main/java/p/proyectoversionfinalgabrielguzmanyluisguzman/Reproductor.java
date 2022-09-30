package p.proyectoversionfinalgabrielguzmanyluisguzman;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Reproductor {
    private Button playButton;
    private Media media;
    private MediaPlayer mediaPlayer;

    public Reproductor() {
        Controller songs = new Controller();
        songs.getUrl();

        media = new Media(songs.toString());
        mediaPlayer = new MediaPlayer(media);
    }


    public void playMedia() {
        mediaPlayer.play();










        //song.add()










    }

}
