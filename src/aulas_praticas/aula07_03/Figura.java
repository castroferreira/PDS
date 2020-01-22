package aulas_praticas.aula07_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public abstract class Figura {

    protected String name;

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " " + name);
    }
}
