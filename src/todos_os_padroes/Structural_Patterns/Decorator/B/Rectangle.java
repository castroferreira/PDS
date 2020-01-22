package todos_os_padroes.Structural_Patterns.Decorator.B;

/**
 *
 * Esta classe vai ser ConcretComponent e implementa a interface Shape
 *
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
