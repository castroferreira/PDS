package aulas_praticas.aula08_02;

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

//      FACADE:
//      1. Registo na segurança social
        SocialSecurity.regist(person);

//      2. Registo na seguradora
        Insurance.regist(person);

//      3. Criação de um cartão de funcionário
        Employee e = new Employee(person, salary);
        emps.add(e);

//      4. Autorização para use de parque automóvel caso o salário seja superior à média
        double avg = 0.0;

        for (Employee emp : emps) {
            avg += emp.getSalary();
        }

        avg /= emps.size();

        if (salary > avg) {
            Parking.allow(person);
        }
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
