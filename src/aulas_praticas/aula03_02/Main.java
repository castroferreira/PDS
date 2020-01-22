/**
 * PDS 2018
 *
 */
package aulas_praticas.aula03_02;

import java.io.*;
import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        Street street = new Street();
        String[] cmmd = new String[1];
        String tmp[] = null;

        /**
         * Para ler a partir do ficheiro.
         */
        if (args.length > 0) {
            try (Scanner file = new Scanner(new File(args[0]))) {
                //commands1.txt, commands2.txt, exemplo1.txt

                while (file.hasNextLine()) {
                    String line = file.nextLine();

                    if (line.charAt(0) != '>') {
                        tmp = line.split(" ");

                        if (tmp[0].equals("quit")) {
                            break;
                        }

                        runCommands(street, tmp);
                    }
                }
            } catch (Exception e) {
                System.out.println("Not existing file");
            }

        } /**
         * O programa deve permitir os seguintes comandos, lidos da consola.
         */
        else {
            try (Scanner file = new Scanner(new File("commands1.txt"))) {
                do {
                    System.out.print("Load, Map, Add, Remove, List, Lookup, Clear, Quit\nCommand: ");
                    String lcmmd = sc.nextLine();
                    cmmd = lcmmd.split(" ");
                    cmmd[0].toLowerCase();
                    runCommands(street, cmmd);
                } while (!cmmd[0].equals("quit") || cmmd.length != 1);
            } catch (Exception e) {
                System.out.println("Not existing file");
            }
            sc.close();
        }
    }

    /**
     * Lista de comandos:
     *
     * @param street
     * @param cmmd
     * @throws java.io.FileNotFoundException
     */
    public static void runCommands(Street street, String[] cmmd) throws FileNotFoundException {
        switch (cmmd[0]) {
            case "load":
                if (cmmd.length != 2) {
                    System.err.println("Wrong command.");
                }
                street.load(cmmd[1]);
                System.out.println("Loaded file.");
                break;
            case "map":
                System.out.println("\nMAP");
                if (cmmd.length != 1) {
                    System.err.println("Wrong command.");
                }
                System.out.println("Street map:");
                street.map();
                System.out.println();
                break;
            case "add":
                if (cmmd.length != 4) {
                    System.err.println("Wrong command.");
                }
                street.add(cmmd[1], Integer.parseInt(cmmd[2]), Integer.parseInt(cmmd[3]));
                System.err.println("Ok: The member '" + cmmd[1] + "' was added successfully.\n");
//                System.err.println("Error: Can not add a new member!");
                break;
            case "remove":
                if (cmmd.length != 2) {
                    System.err.println("Wrong command.");
                }
                street.remove(cmmd[1]);
                System.err.println("Ok: The member '" + cmmd[1] + "' was successfully removed.\n");
//                System.err.println("Error: Can not remove a member!");
                break;
            case "list":
                System.out.println("\nLIST");
                if (cmmd.length != 1) {
                    System.err.println("Wrong command.");
                }
                System.out.println("Members list and door numbers: ");
                street.list();
                System.out.println();
                break;
            case "lookup":
                System.out.println("\nLOOKUP");
                if (cmmd.length != 2) {
                    System.err.println("Wrong command.");
                }
                System.out.println("Found: ");
                street.lookup(cmmd[1]);
                System.out.println();
                break;
            case "clear":
                System.out.println("\nCLEAR");
                if (cmmd.length != 1) {
                    System.err.println("Wrong command.");
                }
                street.clear();
                System.out.println("All information was cleaned.");
                break;
            case "quit":
                if (cmmd.length != 1) {
                    System.err.println("Wrong command.");
                }
                street.quit();
                System.out.println("Shut down...");
            default:
                System.err.println("Invalid command.");
        }
    }
}
