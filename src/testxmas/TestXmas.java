package testxmas;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author romanm
 * http://freetts.sourceforge.net/docs/index.php#download_and_install
 * add jars from lib folder
 */
public class TestXmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VoiceManager manager = VoiceManager.getInstance();
        Voice kevin = manager.getVoice("kevin16");
        kevin.allocate();
        for (int i = 0; i < 10; i++) {
            kevin.speak("Merry Christmas, Roman Mazur ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestXmas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //kevin.speak("Merry Christmas");
        kevin.deallocate();
    }
    
}
