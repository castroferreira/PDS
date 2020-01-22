package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * Classe concreta de formato VLC que implementa os métodos da interface
 * AdvancedMediaPlayer
 *
 */
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String filename) {
        System.out.println("Play VLC -> FileName: " + filename);
    }

    @Override
    public void playMp4(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
