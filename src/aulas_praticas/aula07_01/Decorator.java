package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Decorator implements EmployeeInterface {

    protected EmployeeInterface employee;

    public Decorator(EmployeeInterface employee) {
        this.employee = employee;
    }

    @Override
    public void start(LocalDate date) {
        employee.start(date);
    }

    @Override
    public void terminate(LocalDate date) {
        employee.terminate(date);
    }

    @Override
    public void work() {
        employee.work();
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
