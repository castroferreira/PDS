package todos_os_padroes.Behaviour_Patterns.Iterator.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe tem lista de itens do tipo item. Os items podem ser adicionados
 * através do método addItem(). O método iterador() retorna um iterado de itens
 * de menu. A classe MenuIterator é uma classe interna de Menu que implementa a
 * interface de iterado para objetos de item.
 */
public class Menu {

    List<Item> menuItem;

    public Menu() {
        menuItem = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        menuItem.add(item);
    }

    public Iterator<Item> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Item> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= menuItem.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Item next() {
            return menuItem.get(currentIndex++);
        }

        @Override
        public void remove() {
            menuItem.remove();   //remove(--currentIndex);
        }
    }
}
