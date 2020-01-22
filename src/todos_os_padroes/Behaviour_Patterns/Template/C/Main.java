package todos_os_padroes.Behaviour_Patterns.Template.C;

public class Main {

    public static void main(String[] args) {
        Game g = new GaloGame();
        g.play();

        Game s = new SnakeGame();
        s.play();
    }
}
