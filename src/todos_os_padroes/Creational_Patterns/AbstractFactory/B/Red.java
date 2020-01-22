package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da classe concreta Red que implementa a interface Color
 *
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red");
    }
}
