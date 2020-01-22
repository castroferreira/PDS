package Prototype_T;

import java.util.HashMap;

public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeID) {

        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
