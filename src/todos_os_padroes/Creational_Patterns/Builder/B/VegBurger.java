package todos_os_padroes.Creational_Patterns.Builder.B;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 3.5f;
    }

    @Override
    public String name() {
        return "Veg Burguer";
    }
}
