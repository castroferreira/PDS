package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class LunchDirector {

    private LunchBuilder lunch;

    LunchDirector(LunchBuilder lunch) {
        this.lunch = lunch;
    }

    public Lunch getMeal() {
        return lunch.getMeal();
    }

    void constructMeal() {
        lunch.buildDrink();
        lunch.buildMainCourse();
        lunch.buildSide();
    }
}
