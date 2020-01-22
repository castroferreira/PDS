package todos_os_padroes.Creational_Patterns.Singleton.LazyInitialization;

public class MyLazyInitialization {

    private static MyLazyInitialization instance = null;

    private MyLazyInitialization() {
    }

    public synchronized static MyLazyInitialization getInstance() {
        if (instance == null) {
            instance = new MyLazyInitialization(); // LAZY INITIALIZATION
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("I did something here!");
    }
}
