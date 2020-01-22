package todos_os_padroes.Structural_Patterns.Facade.B;

public class Main {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.whoIsCircle();
        shapeFacade.whoIsRectangle();
        shapeFacade.whoIsSquare();
    }
}
