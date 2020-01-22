package todos_os_padroes.Structural_Patterns.Decorator.D;

/**
 *
 * Classe concreta do sistema constituida por um método que recebe um objeto da
 * class1, um objeto da class2 e um inteiro e retorna o sextuplo do inteiro.
 *
 */
public class Class3 {

    public int doMore(Class1 c1, Class2 c2, int x) {
        return c1.doSomethingComplicated(x) * c2.doAnotherThing(c1, x);
    }
}
