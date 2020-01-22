package todos_os_padroes.Behaviour_Patterns.Template.B;

public class Main {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
