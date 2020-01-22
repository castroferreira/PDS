package aulas_praticas.aula09_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface Command {

    public void execute();

    public void undo();
}
