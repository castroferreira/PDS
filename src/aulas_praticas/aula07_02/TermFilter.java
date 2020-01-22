package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class TermFilter extends Decorator {

    private String[] text;
    private int i;

    public TermFilter(TextReaderInterface textReader) {
        super(textReader);
        text = textReader.next().split("[,\n.]");
        i = 0;
    }

    @Override
    public String next() {
        return text[i++];
    }

    @Override
    public boolean hasNext() {
        if (!(i < text.length)) {
            if (super.textReader.hasNext()) {
                text = super.textReader.next().split("[,\n.]");
                i = 0;
                return true;
            } else {
                return false;
            }
        } else {
            if (text[i].equals("")) {
                i++;
                return hasNext();
            }
            return true;
        }
    }
}
