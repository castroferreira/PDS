package todos_os_padroes.Structural_Patterns.Decorator.D;

/**
 *
 * Classe Facade com três metodos simples que indicam o que fazem mas que
 * escondem a interação com as classes 1,2 e 3 do codigo cliente
 *
 */
public class Facade {

    public int cubeX(int x) {
        Class1 c1 = new Class1();
        return c1.doSomethingComplicated(x);
    }

    public int cubeXTime(int x) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        return c2.doAnotherThing(c1, x);
    }

    public int XToSixthPowerTimes2(int x) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();

        return c3.doMore(c1, c2, x);
    }
}
