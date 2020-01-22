package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Employee implements EmployeeInterface {

    private String name;
    LocalDate date_start, date_terminate;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void start(LocalDate date) {
        System.out.print(name);
        date_start = date;
    }

    @Override
    public void terminate(LocalDate date) {
        System.out.print(name);
        date_terminate = date;
    }

    @Override
    public void work() {
        System.out.printf("\twork\n", name); //%-6s
    }

    @Override
    public String toString() {
        return String.format("%s start: %s terminate: %s", name, date_start != null ? date_start : "", date_terminate != null ? date_terminate : "");
    }
}
