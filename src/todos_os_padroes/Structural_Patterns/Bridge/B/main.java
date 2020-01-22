package todos_os_padroes.Structural_Patterns.Bridge.B;

public class main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(2, 2, 1, new RedCircle());
        Shape greenCircle = new Circle(5, 5, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
