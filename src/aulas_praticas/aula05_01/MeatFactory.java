package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class MeatFactory {

    static Commodity createMeat(Temperature temperature) {
        if (temperature.equals(Temperature.WARM)) {
            return new Pork();
        } else {
            return new Tuna();
        }
    }
}
