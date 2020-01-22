package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class CoderFilter extends Decorator {

    private String text;

    public CoderFilter(TextReaderInterface textReader) {
        super(textReader);
    }

    @Override
    public String next() {
        text = super.textReader.next();
        return codify(text);
    }

    @Override
    public boolean hasNext() {
        return super.textReader.hasNext();
    }

    private String codify(String word) {
        String charToNumber = "12345";
        String vogal = "aeiou";
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (vogal.contains(c + "")) {
                sb.append(charToNumber.charAt(vogal.indexOf(c)));
            } else if (Character.isUpperCase(c)) {
                sb.append((char) (c + 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
