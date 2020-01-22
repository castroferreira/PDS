/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

public class StringUtils {

    public static boolean isUpperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isUpperCase(charArray[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAlphabetic(String str) {
        return true;
    }
}