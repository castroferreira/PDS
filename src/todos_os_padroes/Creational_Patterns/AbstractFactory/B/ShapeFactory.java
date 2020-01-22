package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da fábrica Shape que extende da fábrica mãe (AbstractFactory) e que
 * gera os objetos nas classes concretas consoante a informação que recebe
 *
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
