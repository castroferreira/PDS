package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class FruitJuice implements Commodity {

    private String fruitName;

    public FruitJuice(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public Temperature getTemperature() {
        return Temperature.COLD;
    }

    @Override
    public State getState() {
        return State.Liquid;
    }

    @Override
    public String toString() {
        return "Fruit Juice (" + fruitName + ", " + getTemperature() + ", " + getState() + ")";
    }
}
