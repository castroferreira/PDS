package aulas_praticas.aula07_01;

import java.time.LocalDate;
import java.time.Month;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        //contantes
        final int equipas = 2;
        final int elementos = 5;

        // Criar a equipa de 5 elementos
        EmployeeInterface[] empresa = new EmployeeInterface[equipas * elementos + 1];

        empresa[0] = new Manager(new Employee(String.format("%-2d:", 1))); //"Rui %-2d:", i

        empresa[0].start(LocalDate.of(2018, Month.APRIL, 16));
        empresa[0].terminate(LocalDate.of(2018, Month.MAY, 1));

        for (int i = 1; i < elementos * equipas + 1; i++) {
            // A  cada 5 elementos escolhe 1 team leader
            if (i % elementos == 0) {
                empresa[i] = new TeamLeader(new TeamMember(new Employee(String.format("%-2d:", i))));
                empresa[i].start(LocalDate.of(2018, Month.APRIL, 17));
                empresa[i].terminate(LocalDate.of(2018, Month.JUNE, 2));

                System.out.println("");
                System.out.println(empresa[i]);
                System.out.println("");
                empresa[i].work();
                System.out.println("");
            } else {
                empresa[i] = new TeamMember(new Employee(String.format("%-2d:", i)));
                empresa[i].start(LocalDate.of(2018, Month.APRIL, 18));
                empresa[i].terminate(LocalDate.of(2018, Month.JULY, 11));

                System.out.println("");
                System.out.println(empresa[i]);
                System.out.println("");
                empresa[i].work();
                System.out.println("");
            }

            System.out.println("--------------------------------------------");
            System.out.println("");
        }

//        System.out.println("\nInformacao da empresa");
//        
//        for(int i = 0 ; i < elementos * equipas + 1; i++){
//            System.out.println(empresa[i]);
//        }
//        System.out.println("\nFuncao a desempenhar");
//        for(int i = 0 ; i < elementos * equipas + 1; i++){
//            empresa[i].work();
//        }
//        EmployeeInterface e1 = new Employee("Andreia");
//        Manager manager = new Manager(e1);
//        
//        manager.start(new LocalDate(2018,04,16));
//        manager.work();
//        manager.manage();
//        manager.terminate(new LocalDate(2018,04,17));
//        
//        
//        
//        EmployeeInterface e2 = new Employee("Rui");
//        TeamLeader teamLeader = new TeamLeader(e2);
//        
//        teamLeader.start(new LocalDate(2018,04,18));
//        teamLeader.work();
//        teamLeader.plan();
//        manager.terminate(new LocalDate(2018,04,19));
//        
//        
//        
//        EmployeeInterface e3 = new Employee("Bia");
//        TeamMember teamMember = new TeamMember(e3);
//        
//        teamMember.start(new LocalDate(2018,04,20));
//        teamMember.work();
//        teamMember.colaborate();
//        manager.terminate(new LocalDate(2018,04,21));
    }
}
