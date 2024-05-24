import Entities.Immagine;
import Entities.RegistrazioneAudio;
import Entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("paolo");
        img.setBrightness(3);
        img.show();


        Video video1 = new Video("goal", 6);
        video1.setBrightness(5);
        video1.setVolume(2);
        video1.play();

        RegistrazioneAudio rec1 = new RegistrazioneAudio("parlata", 3);
        rec1.setVolume(3);
        rec1.play();

    }
}