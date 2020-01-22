package todos_os_padroes.Structural_Patterns.Composite.B;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Criação da classe Employee que vai conter um lista de empregados. Sempre que
 * é criado um empregado(leaf) e colocado logo na lista(Composite)
 *
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }
}
