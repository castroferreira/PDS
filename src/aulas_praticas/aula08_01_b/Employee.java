package aulas_praticas.aula08_01_b;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class Employee {

    private double salary;
    private Person person;

    public Employee(Person person, double s) {
        this.person = person;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    //"Don't talk to stranger"
    void paySalaries(int month) {
        person.getBankAccount().deposit(salary * month);
    }
}
