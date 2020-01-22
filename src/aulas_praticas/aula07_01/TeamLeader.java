package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class TeamLeader extends Decorator {

    public TeamLeader(EmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void start(LocalDate date) {
        employee.start(date);
        System.out.print("\tTeam Leader\n");
    }

    @Override
    public void terminate(LocalDate date) {
        employee.terminate(date);
        System.out.print("\tTeam Leader\n");
    }

    @Override
    public void work() {
        employee.work();
        plan();
    }

    public void plan() {
        System.out.printf("\tPlan\n");//%-15s  //, "Team Leader"
    }
}
