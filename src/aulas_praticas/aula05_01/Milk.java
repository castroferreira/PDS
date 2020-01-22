package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Milk implements Commodity {

    @Override
    public Temperature getTemperature() {
        return Temperature.WARM;
    }

    @Override
    public State getState() {
        return State.Liquid;
    }

    @Override
    public String toString() {
        return "Milk (" + getTemperature() + ", " + getState() + ")";
    }
}
