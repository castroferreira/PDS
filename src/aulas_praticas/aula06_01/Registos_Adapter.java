package aulas_praticas.aula06_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 */
public class Registos_Adapter implements Merge_Database_Registos {

    private Registos registos;

    public Registos_Adapter(Registos registos) {
        this.registos = registos;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public void deleteEmployee(long emp_num) {
        for (Empregado e : registos.listaDeEmpregados()) {
            if (e.codigo() == emp_num) {
                registos.remove((int) emp_num);
            }
        }
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> emps = new ArrayList<>();

        for (Empregado e : registos.listaDeEmpregados()) {
            emps.add(empregadoToEmployee(e));
        }

        return emps;
    }

    @Override
    public boolean isEmployee(long emp_num) {
        return registos.isEmpregado((int) emp_num);
    }

    private Employee empregadoToEmployee(Empregado e) {
        return new Employee(e.nome() + " " + e.apelido(), e.codigo(), e.salario());
    }
}
