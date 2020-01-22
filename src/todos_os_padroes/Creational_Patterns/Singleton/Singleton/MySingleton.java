package todos_os_padroes.Creational_Patterns.Singleton.Singleton;

public class MySingleton {

    //criação de um objeto MySingleton
    private static MySingleton instance = new MySingleton();

    //tornar o construtor privado logo esta classe não pode ser instanciada
    private MySingleton() {
    }

    public static MySingleton instance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello!!");
    }
}
