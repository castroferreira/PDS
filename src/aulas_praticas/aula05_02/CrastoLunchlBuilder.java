package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class CrastoLunchlBuilder implements LunchBuilder {

    private String drink, mainCourse, side;

    @Override
    public void buildDrink() {
        drink = "Vinho Tinto";
    }

    @Override
    public void buildMainCourse() {
        mainCourse = "Bacalhau à Lagareiro";
    }

    @Override
    public void buildSide() {
        side = "Broa";
    }

    @Override
    public Lunch getMeal() {
        return new Lunch(drink, mainCourse, side);
    }
}
