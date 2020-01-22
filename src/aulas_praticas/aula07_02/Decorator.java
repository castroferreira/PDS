package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public abstract class Decorator implements TextReaderInterface {

    protected TextReaderInterface textReader;

    public Decorator(TextReaderInterface textReader) {
        this.textReader = textReader;
    }

    @Override
    public boolean hasNext() {
        return textReader.hasNext();
    }

    @Override
    public String next() {
        return textReader.next();
    }
}
