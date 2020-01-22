package aulas_praticas.aula10_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class NullObject extends Employee {

    private static NullObject singleton = new NullObject();

    private NullObject() {

    }

    public static NullObject getInstance() {
        return singleton;
    }

    @Override
    public String getName() {
        return "Invalid name";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
