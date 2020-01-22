package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        LunchBuilder lunch = new CrastoLunchlBuilder();
        LunchDirector mealDirector = new LunchDirector(lunch);
        mealDirector.constructMeal();

        Lunch meal = mealDirector.getMeal();
        System.out.println("Ana's meal is: " + meal);

        mealDirector = new LunchDirector(new SnackLunchBuilder());
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Rui's meal is: " + meal);

        mealDirector = new LunchDirector(new CentralCantineLunchBuilder());
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        System.out.println("My meal is: " + meal);
    }
}
