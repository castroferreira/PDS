package todos_os_padroes.Structural_Patterns.Proxy.A;

import java.util.Date;

/**
 *
 * Classe Proxy para um objeto SlowThing. Uma vez que este objeto leva 5 sgundos
 * a ser criado, então é usado um proxy para que este possa ser criado por
 * "demanda". Isto ocorre quando o método sayHello() do proxy é executado. É
 * instaciado um objeto SlowThing e caso não exista é criado no método
 * sayHello().
 *
 */
public class Proxy {

    SlowThing slowThing;

    public Proxy() {
        System.out.println("Criando um proxy em:" + new Date());
    }

    public void sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        slowThing.sayHello();
    }
}
