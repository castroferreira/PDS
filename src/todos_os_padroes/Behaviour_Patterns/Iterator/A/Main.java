package todos_os_padroes.Behaviour_Patterns.Iterator.A;

import java.util.Iterator;

/**
 * Esta classe cria três itens e adiciona-os para o objeto menu. Em seguida,
 * obtem-se um iterator de item do objeto menu e itera sobre os itens no menu. A
 * seguir, é chamado o metodo remove() para remover o ultimo item obtido pelo
 * iterator. Por fim, obtém um novo objeto iterator do menu e mais uma vez itera
 * sobre os itens de menu
 */
public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("spaghetti", 7.50f);
        Item item2 = new Item("hamburger", 4.50f);
        Item item3 = new Item("pizza", 12.00f);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        System.out.println("Mostrar menu");
        Iterator<Item> iterator = menu.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.notify();  //next();
            System.out.println(item);
        }

        System.out.println("Removendo o último item retornado");
        iterator.remove();

        System.out.println("Mostrar menu");
        iterator = menu.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.notify();   //next();
            System.out.println(item);
        }

    }
}
