package todos_os_padroes.Structural_Patterns.Flyweight.B;

public class Rectangle implements Shape {

    private int x, y;
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("A circle colored: " + color + " and y: " + y + " and x: " + x);
    }
}
