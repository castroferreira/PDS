package todos_os_padroes.Structural_Patterns.Facade.B;

public class Rectangle implements Shape {

    public Rectangle() {
    }

    @Override
    public void whoAmI() {
        System.out.println("My name is: Rectangle");
    }
}
