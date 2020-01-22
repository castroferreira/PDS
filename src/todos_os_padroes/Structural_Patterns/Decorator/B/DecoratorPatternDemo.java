package todos_os_padroes.Structural_Patterns.Decorator.B;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("Rectangle with normal border");
        rectangle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
