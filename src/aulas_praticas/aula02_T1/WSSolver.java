package aulas_praticas.aula02_T1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lsantos
 */
public class WSSolver {

    /**
     * Max size of puzzle.
     */
    private final int maxSize = 80;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get filename.
        if (args.length == 0) {
            System.out.println("Erro: Indique o caminho do ficheiro do puzzle como argumento.");
        } else {
            WSSolver wssolver = new WSSolver();
            wssolver.readFile(args[0]);
        }
    }

    /**
     *
     *
     * @param filename
     * @return
     */
    private boolean readFile(String filename) {
        BufferedReader br = null;
        FileReader fr = null;

        List<String> words = new ArrayList<>();
        String[][] puzzle;

        try {
            // Read the txt file.
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String currentLine;
            int cols = 0;
            int lineSize = 0;

            while ((currentLine = br.readLine()) != null) {
                // Puzzle or word.
                if (currentLine.matches("[A-Z]*")) {
                    if (currentLine.length() > maxSize) {
                        System.out.println("O tamanho do puzzle é maior que " + maxSize + "x" + maxSize);
                        return false;
                    }

                    // Get the size of line, if 0.
                    lineSize = (lineSize == 0) ? currentLine.length() : lineSize;

                    if (lineSize != currentLine.length()) {
                        System.out.println("O puzzle definido não é quadrado");
                        return false;
                    }

                    // Increment col.
                    cols++;

                    // Add to array.
                    // TODO
                } else {
                    String[] lineWords = currentLine.split(" |,|;");
                    for (String word : lineWords) {
                        if (word.trim().equals("")) {
                            continue;
                        }

                        System.out.println(word);
                    }
                }
            }

            // Validate cols.
            if (cols != lineSize) {
                System.out.println("O puzzle definido não é quadrado");
                return false;
            }

        } catch (IOException e) {
        } finally {

            try {
                // Close the filereader and bufferreader.
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {
            }
        }

        return true;
    }
}