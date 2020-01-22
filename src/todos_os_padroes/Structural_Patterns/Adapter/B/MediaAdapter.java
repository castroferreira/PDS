package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * Criação da classe adapter que vai implementar o método play da interface
 * MediaPlayer no construtor do MediaAdapter será invocada uma nova classe
 * dependendo do formato escolhido
 *
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String typeMedia) {
        if (typeMedia.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (typeMedia.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String typeMedia, String fileName) {
        if (typeMedia.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer.playVLC(fileName);
        } else if (typeMedia.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
