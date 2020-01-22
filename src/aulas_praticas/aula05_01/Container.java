package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public abstract class Container {

    protected Commodity commodity;

    public boolean placeCommodity(Commodity c) {
        this.commodity = c;
        return true;
    }

    protected Commodity getCommodity() {
        return commodity;
    }

    @Override
    public String toString() {
        return "" + commodity;
    }
}
