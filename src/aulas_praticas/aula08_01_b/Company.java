package aulas_praticas.aula08_01_b;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class Company {

    public static User user;
    private List<Employee> emps = new ArrayList<>();

    public void admitEmployee(Person person, double salary) {
        Employee e = new Employee(person, salary);
        emps.add(e);
    }

    public void paySalaries(int month) {
        for (Employee e : emps) {
            e.paySalaries(month);
        }
    }

    public List<Employee> employees() {
        return Collections.unmodifiableList(emps);
    }
}
