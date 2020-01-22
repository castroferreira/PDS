package todos_os_padroes.Behaviour_Patterns.Template.C;

public abstract class Game {

    public abstract void start();

    public abstract void end();

    public void play() {
        start();
        end();
    }
}
