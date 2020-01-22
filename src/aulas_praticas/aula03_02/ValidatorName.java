/**
 * PDS 2018
 *
 */
package aulas_praticas.aula03_02;

public class ValidatorName {

    /**
     * Um nome contém apenas letras (maiúsculas e minúsculas), dígitos numéricos
     * e estes símbolos: _.@
     *
     * @param name
     * @return
     */
    public boolean startsWithLetter(String name) {
        /**
         * O nome deve começar com uma letra
         */
        return Character.isLetter(name.charAt(0));
    }

    public boolean endsWithNoSymbol(String name) {
        /**
         * O nome não pode acabar um símbolo
         */
        return Character.isLetterOrDigit((name.charAt(name.length() - 1)));
    }

    public boolean nameLenght(String name) {
        /**
         * O comprimento máximo de um nome é de 40 caracteres
         */
        return name.length() <= 40;
    }

    public boolean validSymbol(String name) {
        /**
         * O nome só tem estes símbolos: _.@
         */
        return (name.matches("[a-zA-Z0-9]+")) || (name.contains("_|.|@")) || name.matches("[a-zA-Z][a-zA-Z_@.0-9]*[a-zA-Z0-9]*$");
    }

    public boolean validName(String name) {
        return startsWithLetter(name) && endsWithNoSymbol(name) && nameLenght(name) && validSymbol(name);
    }
}
