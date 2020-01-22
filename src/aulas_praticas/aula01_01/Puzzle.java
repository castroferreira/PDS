/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Puzzle {

    private final int SIZE_MAX = 80;
    private final List<String> puzzle;

    public Puzzle() {
        this.puzzle = new ArrayList<>();
    }

    public Puzzle(List<String> puzzle) {
        this.puzzle = puzzle;
    }

    public boolean isValid() {
        // Validates puzzle does not exceed max size
        if (this.puzzle.size() > SIZE_MAX) {
            return false;
        }

        // Validates all lines are uppercase and their lenght is the same as the number of columns
        // of the puzzle
        for (String puzzleLine : puzzle) {
            if (!isValidLine(puzzleLine, this.puzzle.size())) {
                return false;
            }
        }

        return true;
    }

    public char[][] asCharArray() {
        int x = 0;
        int y = 0;
        int size = this.puzzle.size();

        char[][] array = new char[size][size];
        for (String puzzleLine : this.puzzle) {
            for (char ch : puzzleLine.toCharArray()) {
                array[x][y] = ch;
                x++;
            }
            x = 0;
            y++;
        }
        return array;
    }

    public int getSize() {
        return this.puzzle.size();
    }

    public static Puzzle build(Scanner scanner) {
        int puzzleSize = 0;
        ArrayList<String> puzzle = new ArrayList<String>();

        if (scanner.hasNextLine()) {
            String puzzleLine = scanner.nextLine();

            if (!isValidLine(puzzleLine, puzzleLine.length())) {
                return new Puzzle();
            }

            puzzleSize = puzzleLine.length();
            puzzle.add(puzzleLine);
        }

        for (int i = 1; i < puzzleSize; i++) {
            if ((scanner.hasNextLine())) {
                puzzle.add(scanner.nextLine());
            }
        }

        return new Puzzle(puzzle);
    }

    private static boolean isValidLine(String puzzleLine, int puzzleSize) {
        if (!StringUtils.isUpperCase(puzzleLine)) {
            return false;
        }

        if (puzzleLine.length() != puzzleSize) {
            return false;
        }

        return true;
    }
}