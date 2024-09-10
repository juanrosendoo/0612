import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Teste reprodutor = new Teste();
        
        reprodutor.setClip("game_soundtrack");

        reprodutor.play();

    }
}