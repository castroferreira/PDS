package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Classe abstrata que retorna um objeto do tipo de objetos (shape or color)
 *
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
