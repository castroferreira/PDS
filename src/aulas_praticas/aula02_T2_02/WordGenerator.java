package aulas_praticas.aula02_T2_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
	
	private Puzzle puzzle;
	private final int size;
	
	public WordGenerator(String filepath,int size) throws Exception {
		
		this.size = size;
		
		BufferedReader bf = new BufferedReader( new FileReader(filepath));
		ArrayList<String> linhas = new ArrayList<>();
		String linha;
		
		while ( (linha = bf.readLine()) != null ) {
			linhas.add(linha);
		}
		bf.close();
		
		try {
			puzzle = new Puzzle(size);
			
			
		} catch(Exception e) {
			throw new Exception("Argumentos inv�lidos", e);
		}
	}
	
	private static void extractWords(String linha, Puzzle dest, int size) throws Exception {
		String[] pal = linha.replaceAll(";|,| ", " ").split(" ");
		for (int i = 0; i < pal.length; i++) {
			
			if( !(pal[i].equals("") || pal[i].equals(" ")) ) {
				dest.addPalavraPuzzle(generateRandomPP(pal[i],size));
			}
		}
	}
	
	private static PalavraPuzzle generateRandomPP(String palavra, int size) throws Exception {
		Random rn = new Random();
		int x = rn.nextInt(size);
		int y = rn.nextInt(size);
		PalavraPuzzle p = new PalavraPuzzle(palavra, x, y, null);
		/*PalavraPuzzle*/ p = new PalavraPuzzle(palavra,x,y,p.getDirection());
		return p; 
	}
	
}
