package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * Criação da interface AdvancedMediaPlayer com os 2 formatos possiveis (VLC
 * eMP4)
 *
 */
public interface AdvancedMediaPlayer {

    void playVLC(String filename);

    void playMp4(String filename);
}
