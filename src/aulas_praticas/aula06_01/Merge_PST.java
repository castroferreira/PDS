package aulas_praticas.aula06_01;

import java.util.ArrayList;
import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 */
public class Merge_PST implements Merge_Database_Registos {

    private Merge_Database_Registos db_original;
    private Merge_Database_Registos[] db_secundaria;

    public Merge_PST(Merge_Database_Registos db_original, Merge_Database_Registos[] db_secundaria) {
        this.db_original = db_original;
        this.db_secundaria = db_secundaria;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return db_original.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(long emp_num) {
        if (db_original.isEmployee(emp_num)) {
            db_original.deleteEmployee(emp_num);
        }

        for (Merge_Database_Registos merge : db_secundaria) {
            if (merge.isEmployee(emp_num)) {
                merge.deleteEmployee(emp_num);
            }
        }
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> all_employee_list = new ArrayList<>();

        //Empregados da base de dados principal
        for (Employee e : db_original.getEmployees()) {
            all_employee_list.add(e);
        }

        //Empregados da base de dados secundaria
        for (Merge_Database_Registos db : db_secundaria) {
            for (Employee e : db.getEmployees()) {
                all_employee_list.add(e);
            }
        }

        return all_employee_list;
    }

    @Override
    public boolean isEmployee(long emp_num) {
        for (Employee e : db_original.getEmployees()) {
            if (e.getEmpNum() == emp_num) {
                return true;
            }
        }

        for (Merge_Database_Registos db : db_secundaria) {
            for (Employee e : db.getEmployees()) {
                if (e.getEmpNum() == emp_num) {
                    return true;
                }
            }
        }

        return false;
    }
}
