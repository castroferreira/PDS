package todos_os_padroes.Structural_Patterns.Facade.B;

public class Circle implements Shape {

    public Circle() {
    }

    @Override
    public void whoAmI() {
        System.out.println("My name is: Circle");
    }
}
