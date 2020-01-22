package todos_os_padroes.Structural_Patterns.Bridge.A;

/**
 *
 * Classe concreta que implementa a classe Motor e informa qual o numero de
 * cavalos do motor
 *
 */
public class BigMotor implements Motor {

    int ncavalos;

    public BigMotor() {
        ncavalos = 300;
    }

    @Override
    public int go() {
        System.out.println("BigMotor está andar");
        return ncavalos;
    }
}
