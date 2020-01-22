package aulas_praticas.aula02_T2_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * classe usada para resolver palavras cruzadas
 *
 */
public class WordSolver {

    private ArrayList<String> puzzle;
    private ArrayList<StringBuilder> palavras;
    private ArrayList<Solution> solucoes;
    private int puzzlesize;

    /**
     *
     * @param nomeficheiro - nome/localiza��o do ficheiro que cont�m o puzzle e
     * as palavras para se encontrarem
     * @throws Exception
     */
    public WordSolver(String nomeficheiro) throws Exception {

        BufferedReader bf = new BufferedReader(new FileReader(nomeficheiro));
        ArrayList<String> linhas = new ArrayList<>();
        puzzle = new ArrayList<>();
        palavras = new ArrayList<>();
        solucoes = new ArrayList<>();
        String line;

        while ((line = bf.readLine()) != null) {
            linhas.add(line);
        }
        bf.close();
        //System.out.println(linhas);

        puzzlesize = linhas.get(0).length();
        //.out.println(puzzlesize);
        if (!(puzzlesize >= 2 && puzzlesize <= 80) || linhas.size() <= puzzlesize) {
            throw new Exception("Puzzle n�o apresenta o tamanho correto");
        }

        for (int i = 0; i < puzzlesize; i++) {
            if (!linhas.get(i).matches("[A-Z]+")) {
                throw new Exception("Palavras t�m de ser compostas por letras!");
            }

            if (linhas.get(i).length() != puzzlesize) {
                throw new Exception("Uma das linhas do puzzle tem o tamanho errado");
            }
            //System.out.println(linhas.get(i));
            puzzle.add(linhas.get(i));
        }

        for (int i = puzzlesize; i < linhas.size(); i++) {
            extractWords(linhas.get(i), palavras);
        }

        //System.out.println(puzzle);
        //System.out.println(palavras);
    }

    /**
     * m�todo para obter as Solu��es do puzzle
     *
     * @return Lista de objetos com Objetos do tipo Solution
     */
    public ArrayList<Solution> getSolucoes() {
        return solucoes;
    }

    /**
     * m�todo para fazer com que o WorldSolver resolva as palavras cruzadas
     *
     * @throws Exception
     */
    public void solve() throws Exception {
        for (StringBuilder palavra : palavras) {
            search(palavra);
        }
        if (solucoes.size() != palavras.size()) {
            throw new Exception("Palavra repetida / nem todas as palavras na lista est�o no puzzle");
        }
//		search(palavras.get(0));
    }

    private static void extractWords(String linha, ArrayList<StringBuilder> dest) throws Exception {
        String[] pal = linha.replaceAll(";|,| ", " ").split(" ");
        for (int i = 0; i < pal.length; i++) {

            if (!(pal[i].equals("") || pal[i].equals(" "))) {

                if (!pal[i].matches("[A-Za-z]+")) {
                    throw new Exception("Palavras t�m de ser compostas por letras!");
                }
                for (StringBuilder word : dest) {
                    if (word.toString().equals(pal[i]) || word.toString().contains(pal[i])) {
                        throw new Exception("Palavra redundante ou duplicada");
                    }
                }
                dest.add(new StringBuilder(pal[i]));
            }
        }
    }

    private void search(StringBuilder palavra) {
        StringBuilder palavrainvertida = new StringBuilder(palavra);
        palavrainvertida.reverse();

        for (int y = 0; y < puzzlesize; y++) {
            //System.out.println(puzzle.get(y));
            for (int x = 0; x < puzzlesize; x++) {
                if (searchHorizontally(x, y, palavra.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + 1, y + 1, Solution.Direction.RIGHT));
                } else if (searchHorizontally(x, y, palavrainvertida.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + palavra.toString().length(), y + 1, Solution.Direction.LEFT));
                } else if (searchVertically(x, y, palavra.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + 1, y + 1, Solution.Direction.DOWN));
                } else if (searchVertically(x, y, palavrainvertida.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + 1, y + palavra.toString().length(), Solution.Direction.UP));
                } else if (searchRightDiagonal(x, y, palavra.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + 1, y + 1, Solution.Direction.DOWNRIGHT));
                } else if (searchRightDiagonal(x, y, palavrainvertida.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + palavra.toString().length(), y + palavra.toString().length() - 1, Solution.Direction.UPLEFT));
                } else if (searchLeftDiagonal(x, y, palavra.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x + 1, y + 1, Solution.Direction.DOWNLEFT));
                } else if (searchLeftDiagonal(x, y, palavrainvertida.toString())) {
                    solucoes.add(new Solution(palavra.toString(), x - palavra.toString().length() + 2, y + palavra.toString().length(), Solution.Direction.UPRIGHT));
                }
            }
        }
    }

    private boolean searchHorizontally(int x, int y, String palavra) {

        palavra = palavra.toUpperCase();
//		System.out.println(palavra);
//		System.out.println("posição x:" + puzzlesize);
//		System.out.println("tamanho:" + palavra.length());
//		//System.out.println(palavra);
        boolean result = true;
        if (puzzlesize - x - 1 < palavra.length()) {
            return false;
        }

        for (int i = 0; i < palavra.length(); i++) {
//			System.out.println("=");
//			System.out.println(puzzle.get(y).charAt(x+i));
//			System.out.println(palavra.charAt(i));

            if (puzzle.get(y).charAt(x + i) != palavra.charAt(i)) {
//				System.out.println("letra diferente achada. saindo!");
                result = false;
                break;
            }
        }

//		System.out.println("resultado: " + result);
//		System.out.println();
        return result;
    }

    private boolean searchVertically(int x, int y, String palavra) {

        boolean result = true;

        palavra = palavra.toUpperCase();
//		System.out.println(palavra);
//		System.out.println("posição x:" + puzzlesize);
//		System.out.println("tamanho:" + palavra.length());
//		System.out.println(palavra);
        if (puzzlesize - y - 1 < palavra.length()) {
            return false;
        }

        for (int i = 0; i < palavra.length(); i++) {
//			System.out.println("=");
//			System.out.println(puzzle.get(y).charAt(x+i));
//			System.out.println(palavra.charAt(i));

            if (puzzle.get(y + i).charAt(x) != palavra.charAt(i)) {
//				System.out.println("letra diferente achada. saindo!");
                result = false;
                break;
            }
        }

//		System.out.println("resultado: " + result);
//		System.out.println();
        return result;
    }

    private boolean searchRightDiagonal(int x, int y, String palavra) {

        palavra = palavra.toUpperCase();
        boolean result = true;

//		System.out.println(palavra);
//		System.out.println("posição x:" + x);
//		System.out.println("Posi");
//		System.out.println("tamanho:" + palavra.length());
//		System.out.println(palavra);
        if (puzzlesize - x - 1 < palavra.length() || puzzlesize - y - 1 < palavra.length()) {
            return false;
        }

        for (int i = 0; i < palavra.length(); i++) {
//			System.out.println("=");
//			System.out.println(puzzle.get(y+i).charAt(x+i));
//	 	    System.out.println(palavra.charAt(i));
            if (puzzle.get(y + i).charAt(x + i) != palavra.charAt(i)) {
//				System.out.println("letra diferente achada. saindo!");
                result = false;
                break;
            }
        }

        return result;
    }

    private boolean searchLeftDiagonal(int x, int y, String palavra) {

        palavra = palavra.toUpperCase();
        boolean result = true;

        if (x + 1 < palavra.length() || puzzlesize - y - 1 < palavra.length()) {
            return false;
        }

        for (int i = 0; i < palavra.length(); i++) {
//			System.out.println("=");
//			System.out.println(puzzle.get(y+i).charAt(x+i));
//	 	    System.out.println(palavra.charAt(i));
            if (puzzle.get(y + i).charAt(x - i) != palavra.charAt(i)) {
//				System.out.println("letra diferente achada. saindo!");
                result = false;
                break;
            }
        }

        return result;
    }
}