package aulas_praticas.aula06_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 * <Petiscos>
 */
class Registos {
// Data elements

    private ArrayList<Empregado> empregados; // Stores the employees

    public Registos() {
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp) {
        // Code to insert employee
        if (!empregados.contains(emp)) {
            empregados.add(emp);
        }
    }

    public void remove(int codigo) {
        // Code to remove employee
        for (Empregado e : empregados) {
            if (e.codigo() == codigo) {
                empregados.remove(e);
            }
        }
    }

    public boolean isEmpregado(int codigo) {
        // Code to find employee
        for (Empregado e : empregados) {
            if (e.codigo() == codigo) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public List<Empregado> listaDeEmpregados() {
        // Code to retrieve collection
        return empregados;
    }
}
