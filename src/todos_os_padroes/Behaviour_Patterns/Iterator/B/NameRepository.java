package todos_os_padroes.Behaviour_Patterns.Iterator.B;

/**
 *
 * Classe concreta que implementa a interface container. Esta invoca a classe
 * getIterator() que vai retornar uma nova nova classe NameIterator. Esta classe
 * implementa a interface iterator.
 *
 */
public class NameRepository implements Container {

    String name[] = {"Bia", "Joao", "Ana", "Pedro"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[index++];
            }
            return null;
        }

    }

}
