/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner;

        if (args.length > 0) {
            scanner = new Scanner(new File(args[0]));
        } else {
            scanner = new Scanner(new File("puzzle.txt"));
        }

        Puzzle puzzle = Puzzle.build(scanner);
        ArrayList<String> wordList = WordListBuilder.build(scanner);
        WSSolver solver = new WSSolver(puzzle, wordList, SearchDirection.values());

        if (solver.validateInputs()) {
            solver.solve();
            System.exit(0);
        } else {
            System.out.println("Inputs invalidos");
            System.exit(1);
        }
    }
}