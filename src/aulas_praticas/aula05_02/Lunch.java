package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Lunch {

    private String drink, mainCourse, side;

    public Lunch(String drink, String mainCourse, String side) {
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.side = side;
    }

    public String getDrink() {
        return drink;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "[drink: " + drink + ", main course: " + mainCourse + ", side: " + side + "]";
    }
}
