package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

public class Main {

    public static void main(String[] args) {

        //get shape factory        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape shape = shapeFactory.getShape("Square");
        shape.draw();

        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color = colorFactory.getColor("Red");
        color.fill();

        Color color1 = colorFactory.getColor("Green");
        color1.fill();

        Color color2 = colorFactory.getColor("Blue");
        color2.fill();

    }
}
