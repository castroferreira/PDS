package aulas_praticas.aula06_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        database.addEmployee(new Employee("Empresa Sweet:\nAndreia", 2, 950));

        Registos registos = new Registos();
        registos.insere(new Empregado("Empresa Petiscos:\nRui", "Serrano", 1, 1000));

        Database_Adapter database_adapter = new Database_Adapter(database);
        Registos_Adapter registos_adapter = new Registos_Adapter(registos);

        Merge_Database_Registos[] db_2 = {registos_adapter};

        Merge_PST pst = new Merge_PST(database_adapter, db_2);
        pst.addEmployee(new Employee("Miguel", 3, 900));

        printEmployees(pst);
    }

    private static void printEmployees(Merge_PST pst) {
        StringBuilder sb = new StringBuilder();

        for (Employee e : pst.getEmployees()) {
            sb.append(e.getName()).append("\n");
        }

        System.out.println(sb);
    }
}
