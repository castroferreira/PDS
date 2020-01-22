package todos_os_padroes.Structural_Patterns.Decorator.D;

/**
 *
 * Classe concreta do sistema constituida por um método que duplica o cubo de um
 * numero inteiro e retorna-o.
 *
 */
public class Class2 {

    public int doAnotherThing(Class1 c1, int x) {
        return 2 * c1.doSomethingComplicated(x);
    }
}
