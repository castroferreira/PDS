package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * AudioPlayer implementa a interface MediaPlayer. AudioPlayer tem como formato
 * por default MP3.
 *
 *
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Play MP3 -> FileName: " + fileName);
        } else if (audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media!!");
        }
    }
}
