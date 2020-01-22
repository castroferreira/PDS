package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da classe concreta Green que implementa a interface Color
 *
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green");
    }
}
