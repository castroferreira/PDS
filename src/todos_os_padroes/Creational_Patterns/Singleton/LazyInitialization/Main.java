package todos_os_padroes.Creational_Patterns.Singleton.LazyInitialization;

public class Main {

    public static void main(String[] args) {
        MyLazyInitialization mySingleton = MyLazyInitialization.getInstance();
        mySingleton.doSomething();
    }
}
