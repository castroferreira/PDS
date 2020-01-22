package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Manager extends Decorator {

    public Manager(EmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void start(LocalDate date) {
        employee.start(date);
        System.out.print("\tManager\n");
    }

    @Override
    public void terminate(LocalDate date) {
        employee.terminate(date);
        System.out.print("\tManager\n");
    }

    @Override
    public void work() {
        employee.work();
        manage();
    }

    public void manage() {
        System.out.printf("\tManage\n");//%-15s //, "Manager"
    }
}
