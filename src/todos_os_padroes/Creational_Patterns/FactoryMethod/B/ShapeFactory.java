package todos_os_padroes.Creational_Patterns.FactoryMethod.B;

/**
 *
 * Criação da fabrica ShapeFactory que invoca um nova classe dependendo do tipo
 * de forma que é escolhido
 *
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
