package todos_os_padroes.Behaviour_Patterns.Mediator.B;

/**
 *
 * Classe que faz referencia ao mediator(chatroom) e trata de cada entidade no
 * envio de mensagens
 *
 */
class User {

    private String name;
    ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}
