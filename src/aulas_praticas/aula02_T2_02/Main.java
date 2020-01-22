package aulas_praticas.aula02_T2_02;


import java.io.PrintWriter;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		
		//PalavraPuzzle pp1 = new PalavraPuzzle("teste", 1, 5, PalavraPuzzle.Direction.RIGHT);
		//PalavraPuzzle pp2 = new PalavraPuzzle("adeus", 5, 0, PalavraPuzzle.Direction.DOWN);
		Puzzle puzzle = new Puzzle(10);
		
		//System.out.println(puzzle.addPalavraPuzzle(pp1));
		//System.out.println(puzzle.addPalavraPuzzle(pp2));
		
		//puzzle.generate();
		ArrayList<PalavraPuzzle> arr= puzzle.array();
		WordGenerator WG= new WordGenerator("wordlist_1.txt",10);
		try (PrintWriter writer = new PrintWriter("sdl_01.txt", "UTF-8")) {
		    writer.println(arr);	
		    writer.close();
		} catch (Exception e) {
		    System.err.println("Erro");
		}
		
//		for (int i = 0; i < 200; i++)
//			System.out.println(Puzzle.getRandomChar());
		
	}

}
