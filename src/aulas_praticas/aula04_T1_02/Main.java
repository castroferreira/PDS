package aulas_praticas.aula04_T1_02;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rua r = new Rua();
        GestaoRua gest = new GestaoRua(r);

        String op = " ";
        System.out.println("Load nomeFicheiro, Map, Add nome portaInicial portaFinal, Remove name, Quit");

        while (!op.equals("Quit")) {
            System.out.print("Command: ");
            op = sc.nextLine();
            switch (op.split(" ")[0]) {
                case "Load":
                    if (op.split(" ").length < 2) {
                        System.err.println("Erro! Comando: Load nomeFicheiro");
                        break;
                    }
                    String filename = op.split(" ")[1];
                    gest.load(filename);
                    System.out.println("Load Completed");
                    break;
                case "Map":
                    gest.map(r);
                    break;

                case "Add":

                    if (op.split(" ").length < 2) {
                        System.err.println("Erro! Comando: Add nome portaInicial portaFinal");
                        break;
                    }

                    String name = op.split(" ")[1];
                    int portaInicial = Integer.parseInt(op.split(" ")[2]);
                    int portaFinal = Integer.parseInt(op.split(" ")[3]);
                    gest.addMembro(portaInicial, portaFinal, name);

                    break;
                case "Remove":
                    if (op.split(" ").length < 2) {
                        System.err.println("Erro! Comando: Remove nome");
                        break;
                    }
                    String name1 = op.split(" ")[1];
                    gest.removeMembro(name1);
                    break;
                default:
                    break;
            }

            //gest.load("exemplo1.txt");
            //gest.map(r);        
            //gest.removeMembro("Ana_98");
            //gest.map(r);
        }

    }
}
