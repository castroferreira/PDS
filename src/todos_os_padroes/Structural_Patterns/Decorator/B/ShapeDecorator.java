package todos_os_padroes.Structural_Patterns.Decorator.B;

/**
 *
 * Esta classe vai ser o decorator e vai implementar a interface Shape
 *
 */
public class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
