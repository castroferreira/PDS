package aulas_praticas.aula06_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 */
public class Database_Adapter implements Merge_Database_Registos {

    private Database database;

    public Database_Adapter(Database database) {
        this.database = database;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return database.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(long emp_num) {
        database.deleteEmployee(emp_num);
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> emps = new ArrayList<>();

        for (Employee e : database.getAllEmployees()) {
            emps.add(e);
        }

        return emps;
    }

    @Override
    public boolean isEmployee(long emp_num) {
        for (Employee e : database.getAllEmployees()) {
            if (e.getEmpNum() == emp_num) {
                return true;
            }
        }

        return false;
    }
}
