package todos_os_padroes.Structural_Patterns.Decorator.B;

/**
 *
 * Esta classe vai ser um decorator concreto que extend da classe
 * ShapeDecorator. Implementa o método draw() para o desenho da figura e
 * adiciona mais uma funcionalidade através do método setRedBorder()
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setRedBorder(shape);

    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
