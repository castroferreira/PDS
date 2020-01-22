package todos_os_padroes.Creational_Patterns.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        MySingleton singleObject = MySingleton.instance();
        singleObject.showMessage();
    }
}
