package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * Classe concreta de formato MP4 que implementa os métodos da interface
 * AdvancedMediaPlayer
 *
 */
public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Play MP4 -> FileName: " + filename);
    }
}
