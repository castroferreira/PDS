package todos_os_padroes.Structural_Patterns.Adapter.B;

public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("VLC", "OLA");
        audioPlayer.play("MP4", "Adeus");
        audioPlayer.play("MP3", "ok");
        audioPlayer.play("AVG", "Xau");
    }
}
