package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class BeverageFactory {

    static Commodity createBeverage(Temperature temperature) {
        if (temperature.equals(Temperature.COLD)) {
            return new FruitJuice("Orange");
        } else {
            return new Milk();
        }
    }
}
