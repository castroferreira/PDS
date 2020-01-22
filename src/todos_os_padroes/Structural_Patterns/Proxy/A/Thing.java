package todos_os_padroes.Structural_Patterns.Proxy.A;

import java.util.Date;

/**
 *
 * Classe abstrata que contem uma mensagem basica que inclui a data/hora em que
 * a mensagem foi exibida. (Subject)
 *
 */
public abstract class Thing {

    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + "diz olá em " + new Date());
    }
}
