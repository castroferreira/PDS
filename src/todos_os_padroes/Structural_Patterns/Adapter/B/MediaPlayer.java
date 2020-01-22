package todos_os_padroes.Structural_Patterns.Adapter.B;

/**
 *
 * Criação da interface MediaPlayer com o método play que recebe como parametros
 * de entrada o tipo de audio e o nome do ficheiro
 *
 */
public interface MediaPlayer {

    void play(String audioType, String fileName);
}
