package todos_os_padroes.Behaviour_Patterns.Memento.A;

/**
 *
 * Usada para armazenar o estado de um object DietInfo. O memento é armazenado
 * como um objeto um vez que o DietInfo.Memento não é visivel pelo caretaker .
 * Isto protege a integridade dos dados armazenados no objeto Memento. O método
 * saveState() do caretaker guarda o estado do objeto DietInfo. o método
 * restoreState() do caretaker restaura o estado do objeto de DietInfo.
 */
public class DietInfoCareTaker {

    Object objMemento;

    public void saveState(DietInfo dietInfo) {
        objMemento = dietInfo.save();
    }

    public void restoreState(DietInfo dietInfo) {
        dietInfo.restore(objMemento);
    }
}
