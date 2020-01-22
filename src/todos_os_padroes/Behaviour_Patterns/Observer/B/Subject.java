package todos_os_padroes.Behaviour_Patterns.Observer.B;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Classe subject que faz a atualização do estado no setState e notifica os
 * outros observers atraves do metodo notifyAllObservers
 *
 */
class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
