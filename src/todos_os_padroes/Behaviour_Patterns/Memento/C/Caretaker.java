package todos_os_padroes.Behaviour_Patterns.Memento.C;

class Caretaker {

    Object objMemento;

    public void saveState(Originator dietInfo) {
        objMemento = dietInfo.save();
    }

    public void restoreState(Originator dietInfo) {
        dietInfo.restore(objMemento);
    }
}
