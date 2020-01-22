package aulas_praticas.aula07_01;

import java.time.LocalDate;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class TeamMember extends Decorator {

    public TeamMember(EmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void start(LocalDate date) {
        employee.start(date);
        System.out.print("\tTeam Member\n");
    }

    @Override
    public void terminate(LocalDate date) {
        employee.terminate(date);
        System.out.print("\tTeam Member\n");
    }

    @Override
    public void work() {
        employee.work();
        colaborate();
    }

    public void colaborate() {
        System.out.printf("\tColaborate\n"); //%-15s //, "Team Member"
    }
}
