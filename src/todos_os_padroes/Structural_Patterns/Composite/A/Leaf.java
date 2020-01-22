package todos_os_padroes.Structural_Patterns.Composite.A;

/**
 *
 * A classe leaf vai implementar a interface Component indicando a mensagem de
 * saida em cada metodo.
 *
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("folha " + name + " diz olá!!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("folha " + name + " diz adeus!!");
    }
}
