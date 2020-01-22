package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação da fábrica Color que extende da fábrica mãe (AbstractFactory) e que
 * gera os objetos nas classes concretas consoante a informação que recebe
 *
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }
}
