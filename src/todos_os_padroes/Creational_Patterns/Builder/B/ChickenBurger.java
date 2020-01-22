package todos_os_padroes.Creational_Patterns.Builder.B;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 2.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
