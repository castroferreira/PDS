package aulas_praticas.aula05_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
interface LunchBuilder {

    public void buildDrink();

    public void buildMainCourse();

    public void buildSide();

    public Lunch getMeal();
}
