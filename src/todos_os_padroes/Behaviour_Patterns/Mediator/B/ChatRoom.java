package todos_os_padroes.Behaviour_Patterns.Mediator.B;

/**
 *
 * Classe mediator: vai fazer a ligação entre os varios users
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}
