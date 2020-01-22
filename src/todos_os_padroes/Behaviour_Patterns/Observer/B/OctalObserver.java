package todos_os_padroes.Behaviour_Patterns.Observer.B;

/**
 *
 * Classe concrete que extende da classe abstrata Observer e faz a atualização
 * do estado
 *
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
