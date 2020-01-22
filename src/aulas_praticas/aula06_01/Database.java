package aulas_praticas.aula06_01;

import java.util.Vector;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 * <Sweets>
 */
class Database {
// Data elements

    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        // Code to add employee
        if (!employees.contains(employee)) {
            employees.add(employee);
            return true;
        } else {
            return false;
        }
    }

    public void deleteEmployee(long emp_num) {
        // Code to delete employee
        for (Employee e : employees) {
            if (e.getEmpNum() == emp_num) {
                employees.remove(e);
            }
        }
    }

    public Employee[] getAllEmployees() {
        // Code to retrieve collection
        return employees.toArray(new Employee[employees.size()]);
    }
}
