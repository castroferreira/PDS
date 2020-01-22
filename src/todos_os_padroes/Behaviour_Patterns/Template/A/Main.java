package todos_os_padroes.Behaviour_Patterns.Template.A;

public class Main {

    public static void main(String[] args) {
        Meal meal = new HamburgerMeal();
        meal.doMeal();

        Meal m = new TacoMeal();
        m.doMeal();
    }
}
