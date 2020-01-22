
package todos_os_padroes.Creational_Patterns.FactoryMethod.B;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("Square");
        s1.draw();

        Shape s2 = shapeFactory.getShape("Circle");
        s2.draw();

        Shape s3 = shapeFactory.getShape("Rectangle");
        s3.draw();
    }
}
