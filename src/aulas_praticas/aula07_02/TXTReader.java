package aulas_praticas.aula07_02;

import java.io.*;
import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class TXTReader implements FileReader {

    private File file;

    public TXTReader(String filename) {
        file = new File(filename);
    }

    @Override
    public String readFile() {
        StringBuilder sb = new StringBuilder();

        try {
            Scanner sc;

            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine() + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(1);
        }
        return sb.toString();
    }
}
