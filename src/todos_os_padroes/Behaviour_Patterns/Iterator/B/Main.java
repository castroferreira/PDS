package todos_os_padroes.Behaviour_Patterns.Iterator.B;

public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
