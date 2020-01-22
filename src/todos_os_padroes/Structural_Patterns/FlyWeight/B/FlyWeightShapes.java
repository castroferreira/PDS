package todos_os_padroes.Structural_Patterns.Flyweight.B;

import java.util.HashMap;

public class FlyWeightShapes {

    private static final HashMap<String, Shape> rectMap = new HashMap<>();

    public static Shape getRectangle(String color) {
        Rectangle rect = (Rectangle) rectMap.get(color);

        if (rect == null) {
            rect = new Rectangle(color);
            rectMap.put(color, rect);
            System.out.println("Creating circle of color : " + color);
        }
        return rect;
    }
}
