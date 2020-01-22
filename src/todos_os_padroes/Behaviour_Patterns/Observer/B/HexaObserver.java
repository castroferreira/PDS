package todos_os_padroes.Behaviour_Patterns.Observer.B;

/**
 *
 * Classe concrete que extende da classe abstrata Observer e faz a atualização
 * do estado
 *
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
