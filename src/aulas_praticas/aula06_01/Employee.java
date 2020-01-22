package aulas_praticas.aula06_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 * <Sweets>
 */
class Employee {

    private String name;
    private long emp_num;
    private double salary;

    public Employee(String name, long emp_num, double salary) {
        this.name = name;
        this.emp_num = emp_num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getEmpNum() {
        return emp_num;
    }

    public double getSalary() {
        return salary;
    }
}
