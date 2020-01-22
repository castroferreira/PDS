package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class CentralCantineLunchBuilder implements LunchBuilder {

    private String drink, mainCourse, side;

    @Override
    public void buildDrink() {
        drink = "Agua";
    }

    @Override
    public void buildMainCourse() {
        mainCourse = "Grelhada mista";
    }

    @Override
    public void buildSide() {
        side = "Queijo fresco";
    }

    @Override
    public Lunch getMeal() {
        return new Lunch(drink, mainCourse, side);
    }
}
