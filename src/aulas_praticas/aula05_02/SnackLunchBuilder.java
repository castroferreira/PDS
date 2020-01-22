package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SnackLunchBuilder implements LunchBuilder {

    private String drink, mainCourse, side;

    @Override
    public void buildDrink() {
        drink = "Sumo";
    }

    @Override
    public void buildMainCourse() {
        mainCourse = "Pao com Panado";
    }

    @Override
    public void buildSide() {
        side = "Rissol";
    }

    @Override
    public Lunch getMeal() {
        return new Lunch(drink, mainCourse, side);
    }
}
