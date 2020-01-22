package aulas_praticas.aula06_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 */
public interface Merge_Database_Registos {

    /**
     * Um método para adicionar um empregado.
     *
     * @param employee
     */
    public boolean addEmployee(Employee employee);

    /**
     * Um método para remover um empregado, dado o número de funcionário.
     *
     * @param emp_num
     */
    public void deleteEmployee(long emp_num);

    /**
     * Um método para verificar se um empregado existe na empresa, dado o número
     * do empregado.
     */
    public List<Employee> getEmployees();

    /**
     * Um método para imprimir os registos de todos os funcionários.
     *
     * @param emp_num
     */
    public boolean isEmployee(long emp_num);
}
