package todos_os_padroes.Structural_Patterns.Facade.B;

public class Square implements Shape {

    public Square() {
    }

    @Override
    public void whoAmI() {
        System.out.println("My name is: Square");
    }
}
