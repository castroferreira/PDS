package todos_os_padroes.Creational_Patterns.AbstractFactory.B;

/**
 *
 * Criação de uma classe que produz/gera uma nova classe de fábrica consoante a
 * informação que é passada, ou seja, se é Shape ou color
 *
 */
public class FactoryProducer {

    static AbstractFactory getFactory(String choise) {
        if (choise.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choise.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
