package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da classe concreta Blue que implementa a interface Color
 *
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue");
    }
}
