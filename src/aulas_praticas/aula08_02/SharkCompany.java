package aulas_praticas.aula08_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SharkCompany {

    public static void main(String[] args) {

        Person[] persons = {new Person("Maria Silva"),
            new Person("Manuel Pereira"),
            new Person("Aurora Machado"),
            new Person("Augusto Lima")
        };

        Company shark = new Company();
        Company.user = User.COMPANY;

        shark.admitEmployee(persons[0], 1000);
        shark.admitEmployee(persons[1], 900);
        shark.admitEmployee(persons[2], 1200);
        shark.admitEmployee(persons[3], 1100);

        List<Employee> sharkEmps = shark.employees();

        for (Employee e : sharkEmps) {
            System.out.println(e.getSalary());
        }

        shark.paySalaries(1);

        System.out.println("Pessoas registadas na seguranca social: " + SocialSecurity.showInfo());
        System.out.println("Pessoas registadas na seguradora: " + Insurance.showInfo());
        System.out.println("Pessoas com direito ao parque automovel: " + Parking.showInfo());
    }
}
