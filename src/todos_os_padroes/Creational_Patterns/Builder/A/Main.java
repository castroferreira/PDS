package todos_os_padroes.Creational_Patterns.Builder.A;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDiretor mealDiretor = new MealDiretor(mealBuilder);
        mealDiretor.constructMeal();
        Meal meal = mealDiretor.getMeal();
        System.out.println("meal is: " + meal);

        mealBuilder = new PortugueseMealBuilder();
        mealDiretor = new MealDiretor(mealBuilder);
        mealDiretor.constructMeal();
        meal = mealDiretor.getMeal();
        System.out.println("meal is: " + meal);
    }
}
