package todos_os_padroes.Behaviour_Patterns.Template.B;

/**
 *
 * Classe abstrata composta por um metodo play() que será o template e por 3
 * métodos abstratos
 *
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
