package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class ReverseFilter extends Decorator {

    private String text;

    public ReverseFilter(TextReaderInterface textReader) {
        super(textReader);
    }

    @Override
    public String next() {
        text = textReader.next();
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public boolean hasNext() {
        return super.textReader.hasNext();
    }
}
