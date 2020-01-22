package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class TextReader implements TextReaderInterface {

    private FileReader fileReader;
    private String[] text;
    private int i;

    public TextReader(String filename) {
        fileReader = new TXTReader(filename);
        text = fileReader.readFile().split("\n\t");
        i = 0;
    }

    @Override
    public boolean hasNext() {
        if (i < text.length) {
            if (text[i].equals("")) {
                i++;
                return hasNext();
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        return text[i++];
    }
}
