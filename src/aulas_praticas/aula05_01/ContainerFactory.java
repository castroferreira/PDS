package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class ContainerFactory {

    static Container createContainerFor(Commodity commodity) {
        if (commodity.getState().equals(State.Liquid)) {
            return new TermicBottle();
        } else {
            return new Tupperware();
        }
    }
}
