package todos_os_padroes.Behaviour_Patterns.Observer.B;

/**
 *
 * Classe concrete que extende da classe abstrata Observer e faz a atualização
 * do estado
 *
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

}
