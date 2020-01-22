package todos_os_padroes.Behaviour_Patterns.Template.B;

/**
 *
 * Classe concreta que extende da classe abstrata Game e que vai invocar os 3
 * metodos
 *
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
