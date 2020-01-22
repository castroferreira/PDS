package todos_os_padroes.Behaviour_Patterns.Observer.B;

/**
 *
 * Classe abstrata fazendo referencia protected ao subject e composta pelo
 * metodo Observer.
 *
 */
public abstract class Observer {

    protected Subject subject;

    abstract void update();
}
