package todos_os_padroes.Creational_Patterns.Builder.B;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal VegMeal = mealBuilder.prepareVeagMeal();
        System.out.println("Veg Meal ");
        VegMeal.showItem();
        System.out.println("Total coast: " + VegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal ");
        nonVegMeal.showItem();
        System.out.println("Total coast: " + nonVegMeal.getCost());
    }
}
