package todos_os_padroes.Structural_Patterns.Proxy.A;

/**
 *
 * Classe real que extende da interface Thing e que demora 5 segundos a ser
 * executada.
 *
 */
public class SlowThing extends Thing {

    public SlowThing() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
