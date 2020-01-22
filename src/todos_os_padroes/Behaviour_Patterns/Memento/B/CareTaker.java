package todos_os_padroes.Behaviour_Patterns.Memento.B;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
