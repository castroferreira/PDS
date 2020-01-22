package todos_os_padroes.Behaviour_Patterns.Mediator.C;

public interface ChatMediator {

    public void broadcastMessage(String msg, User user);

    void addUser(User user);
}
