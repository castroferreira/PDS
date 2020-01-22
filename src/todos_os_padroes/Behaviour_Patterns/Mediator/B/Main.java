package todos_os_padroes.Behaviour_Patterns.Mediator.B;

public class Main {

    public static void main(String[] args) {

        User Beatriz = new User("Bia");
        User Joao = new User("João");

        Beatriz.sendMessage("ola João");
        Joao.sendMessage("Ola Bia");
    }
}
