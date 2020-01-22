/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

import java.io.*;
import java.util.*;

public class WSGenerator {

    public static int dim;
    public static char[][] puzzle;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        words = readFile("wordlist_1.txt");
        int wordLenght = 0;

        for (String w : words) {
            if (w.length() > wordLenght) {
                wordLenght = w.length();
            }
        }

        System.out.printf("Insert dimention:");
        dim = sc.nextInt();

        while (dim > 80) {
            System.out.printf("Invalid dimention, please insert new dimention.\n");
            dim = sc.nextInt();
        }

        char[][] puzzle_tmp = new char[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                puzzle_tmp[i][j] = '#';
            }
        }

        puzzle = puzzle_tmp;

        puzzle = putWordsOnPuzzle(words, puzzle);
        finishPuzzle();
        File file = new File("sdl_01.txt");
        file.createNewFile();
        PrintWriter saveFile = new PrintWriter(file);

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(puzzle[j][i]);
                saveFile.print(puzzle[i][j]);
            }
            System.out.print("\n");
            saveFile.printf("\n");
        }

        for (int a = 0; a < words.size(); a++) {
            saveFile.print(", " + words.get(a));
        }

        saveFile.printf("\n");
        sc.close();

        saveFile.close();
    }

    private static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        ArrayList<String> words = new ArrayList<String>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            for (String w : s.split("[^\\w']+")) {
                words.add(w.toUpperCase());
            }
        }
        sc.close();
        return words;
    }

    private static char[][] putWordsOnPuzzle(ArrayList<String> words, char[][] puzzle_tmp) {
        Random rand = new Random();
        for (int a = 0; a < words.size(); a++) {
            boolean addWord = false;
            String word = words.get(a);
            while (addWord == false) {
                int line = rand.nextInt(dim);
                int col = rand.nextInt(dim);
                int direction = rand.nextInt(4);
                if (puzzle_tmp[line][col] == '#' || puzzle_tmp[line][col] == word.charAt(0)) {
                    switch (direction) {
                        case 0:
                            addWord = horizontal(word, col, line);
                            break;
                        case 1:
                            addWord = vertical(word, col, line);
                            break;
                        case 2:
                            addWord = diagonal1(word, col, line);
                            break;
                        case 3:
                            addWord = diagonal2(word, col, line);
                            break;
                    }
                }
            }
        }
        return puzzle_tmp;
    }

    private static boolean horizontal(String word, int x, int y) {
        Random rand = new Random();
        boolean addWord = true;
        int orientation = rand.nextInt(2);
        if (orientation == 0) {
            if (x + word.length() >= dim) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x + i][y] != '#' && puzzle[x + i][y] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x + i][y] = word.charAt(i);
                }

                return true;
            }

        } else {
            if (x - word.length() < 0) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x - i][y] != '#' && puzzle[x - i][y] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x - i][y] = word.charAt(i);
                }

                return true;
            }
        }
        return false;
    }

    private static boolean vertical(String word, int x, int y) {
        Random rand = new Random();
        boolean addWord = true;
        int orientation = rand.nextInt(2);
        if (orientation == 0) {
            if (y + word.length() >= dim) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x][y + i] != '#' && puzzle[x][y + i] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x][y + i] = word.charAt(i);
                }

                return true;
            }
        } else {
            if (y - word.length() < 0) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x][y - i] != '#' && puzzle[x][y - i] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x][y - i] = word.charAt(i);
                }

                return true;
            }
        }
        return false;
    }

    private static boolean diagonal1(String word, int x, int y) {
        Random rand = new Random();
        boolean addWord = true;
        int orientation = rand.nextInt(2);
        if (orientation == 0) {
            if (y + word.length() >= dim || x + word.length() >= dim) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x + i][y + i] != '#' && puzzle[x + i][y + i] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x + i][y + i] = word.charAt(i);
                }

                return true;
            }
        } else {
            if (x - word.length() < 0 || y - word.length() < 0) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x - i][y - i] != '#' && puzzle[x - i][y - i] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x - i][y - i] = word.charAt(i);
                }

                return true;
            }
        }
        return false;
    }

    private static boolean diagonal2(String word, int x, int y) {
        Random rand = new Random();
        boolean addWord = true;
        int orientation = rand.nextInt(2);
        if (orientation == 0) {
            if (y + word.length() >= dim || x - word.length() < 0) {
                addWord = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (puzzle[x - i][y + i] != '#' && puzzle[x - i][y + i] != word.charAt(i)) {
                        addWord = false;
                    }
                }
            }

            if (addWord == true) {
                for (int i = 0; i < word.length(); i++) {
                    puzzle[x - i][y + i] = word.charAt(i);
                }

                return true;
            }
        } else if (x + word.length() >= dim || y - word.length() < 0) {
            addWord = false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (puzzle[x + i][y - i] != '#' && puzzle[x + i][y - i] != word.charAt(i)) {
                    addWord = false;
                }
            }
        }

        if (addWord == true) {
            for (int i = 0; i < word.length(); i++) {
                puzzle[x + i][y - i] = word.charAt(i);
            }

            return true;
        }
        return false;
    }

    private static void finishPuzzle() throws IOException {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random rand = new Random();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (puzzle[i][j] == '#') {
                    int indice = rand.nextInt(alphabet.length);
                    puzzle[i][j] = alphabet[indice];
                }
            }
        }
    }
}