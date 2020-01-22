package todos_os_padroes.Structural_Patterns.Bridge.A;

/**
 *
 * Classe concreta que implementa a classe Motor e informa qual o numero de
 * cavalos do motor
 *
 */
public class SmallMotor implements Motor {

    int ncavalos;

    public SmallMotor() {
        ncavalos = 100;
    }

    @Override
    public int go() {
        System.out.println("SmallMotor está andar");
        return ncavalos;
    }
}
