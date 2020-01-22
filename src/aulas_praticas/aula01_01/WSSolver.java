/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

import java.util.*;

/**
 * Class responsible for solving a puzzle
 */
public class WSSolver {

    private Puzzle puzzle;
    private List<String> wordList;
    private SearchDirection[] searchDirections;

    public WSSolver(Puzzle puzzle, ArrayList<String> wordList, SearchDirection[] searchDirections) {
        this.puzzle = puzzle;
        this.wordList = wordList;
        this.searchDirections = searchDirections;
    }

    public void search(String word) {
        int size = this.puzzle.getSize();
        char[][] array = this.puzzle.asCharArray();
        word = word.toUpperCase();

        for (int x = 0; x < size; ++x) {
            for (int y = 0; y < size; ++y) {
                if (array[x][y] == word.charAt(0)) {
                    for (SearchDirection dir : this.searchDirections) {
                        boolean wordMatches = true;
                        for (int charIndex = 0; charIndex < word.length() && wordMatches; ++charIndex) {
                            int nextX = x + dir.getX() * charIndex;
                            int nextY = y + dir.getY() * charIndex;
                            if (nextX < 0 || nextY < 0 || nextX >= size || nextY >= size || array[nextX][nextY] != word.charAt(charIndex)) {
                                wordMatches = false;
                            }
                        }

                        if (wordMatches) {
                            System.out.println(
                                    String.format(
                                            "%s %s %s,%s %s",
                                            word,
                                            word.length(),
                                            y + 1,
                                            x + 1,
                                            dir.toString()
                                    )
                            );
                            return;
                        }
                    }
                }
            }
        }
    }

    public void solve() {
        for (String word : this.wordList) {
            this.search(word);
        }
    }

    public boolean validateInputs() {
        return this.puzzle.isValid(); // should have a hand to validate list
    }
}