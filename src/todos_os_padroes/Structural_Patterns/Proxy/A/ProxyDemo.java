package todos_os_padroes.Structural_Patterns.Proxy.A;

public class ProxyDemo {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        
        FastThing fastThing = new FastThing();
        fastThing.sayHello();
        proxy.sayHello();
    }
}
