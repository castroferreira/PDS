package aulas_praticas.aula08_01_a;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class Employee extends Person {

    private double salary;

    public Employee(String n, double s) {
        super(n);
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}
