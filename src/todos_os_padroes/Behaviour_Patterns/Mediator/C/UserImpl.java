package todos_os_padroes.Behaviour_Patterns.Mediator.C;

public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message: " + msg);
        mediator.broadcastMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message: " + msg);
    }
}
