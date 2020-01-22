package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Tuna implements Commodity {

    @Override
    public Temperature getTemperature() {
        return Temperature.COLD;
    }

    @Override
    public State getState() {
        return State.Solid;
    }

    @Override
    public String toString() {
        return "Tuna (" + getTemperature() + ", " + getState() + ")";
    }
}
