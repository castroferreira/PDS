/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

import java.util.ArrayList;
import java.util.Scanner;

public class WordListBuilder {

    public static ArrayList<String> build(Scanner scanner) {
        String line;
        ArrayList<String> wordList = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            for (String word : line.split(";|,|\\s")) {
                if (word.length() > 1 && StringUtils.isAlphabetic(word)) {
                    wordList.add(word);
                }
            }
        }
        return wordList;
    }
}