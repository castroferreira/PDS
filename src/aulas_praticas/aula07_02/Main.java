package aulas_praticas.aula07_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        TextReaderInterface reader = new TextReader("./src/aula07_02_Texto/Alimentos.txt");

        System.out.println("\n« Text Reader »\n");

        while (reader.hasNext()) {
            System.out.println(reader.next());
            System.out.println();
        }

        System.out.println("\n« Term Filter »\n");
        reader = new TermFilter(new TextReader("./src/aula07_02_Texto/Alimentos.txt"));

        while (reader.hasNext()) {
            System.out.println(reader.next());
            System.out.println();
        }

        System.out.println("\n« Reverse Filter »\n");
        reader = new ReverseFilter(new TermFilter(new TextReader("./src/aula07_02_Texto/Alimentos.txt")));

        while (reader.hasNext()) {
            System.out.println(reader.next());
            System.out.println();
        }

        System.out.println("\n« Coder Filter »\n");
        reader = new CoderFilter(new TextReader("./src/aula07_02_Texto/Alimentos.txt"));

        while (reader.hasNext()) {
            System.out.println(reader.next());
            System.out.println();
        }
    }
}
