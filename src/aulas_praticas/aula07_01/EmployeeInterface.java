package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface EmployeeInterface {

    public void start(LocalDate date);

    public void terminate(LocalDate date);

    public void work();
}
