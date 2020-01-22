package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da classe concreta Rectangle que implementa a interface Shape
 *
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
