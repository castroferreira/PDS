package todos_os_padroes.Structural_Patterns.Facade.B;

public class ShapeFacade {

    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void whoIsCircle() {
        circle.whoAmI();
    }

    public void whoIsSquare() {
        square.whoAmI();
    }

    public void whoIsRectangle() {
        rectangle.whoAmI();
    }
}
