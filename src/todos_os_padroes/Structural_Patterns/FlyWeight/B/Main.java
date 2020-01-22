package todos_os_padroes.Structural_Patterns.Flyweight.B;

public class Main {

    private static String color[] = {"red", "yellow", "green", "pucle", "black", "magenta"};

    public static void main(String[] args) {

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100000; ++i) {
            Rectangle rect = (Rectangle) FlyWeightShapes.getRectangle(getRandomColor());
            rect.setX(getRandomX());
            rect.setY(getRandomY());
            rect.draw();
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("\nTime wasted: " + (timeEnd - timeStart) + " miliseconds");
    }

    private static String getRandomColor() {
        return color[(int) (Math.random() * color.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
