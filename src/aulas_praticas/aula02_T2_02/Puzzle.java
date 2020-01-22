package aulas_praticas.aula02_T2_02;

import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
	
	private char[][] areadopuzzle;
	private ArrayList<PalavraPuzzle> palavras;
	private final int size;
	
	public Puzzle(int size) throws Exception {
		
		if (size < 2 || size > 80) {
			throw new Exception("Tamanho inv�lido! Tem que ser entre 2 e 80!");
		}
		this.size = size;
		areadopuzzle = new char[size][size];
		palavras = new ArrayList<>();
	}
	
	public int getPalavras() {
		return palavras.size();
	}

	public ArrayList<PalavraPuzzle> array(){
		return palavras;
	}
	public void setPalavras(ArrayList<PalavraPuzzle> palavras) {
		this.palavras = palavras;
	}

	public boolean addPalavraPuzzle(PalavraPuzzle palavra) {
		
		if (palavras.size() == 0) {
			palavras.add(palavra);
			return true;
		}
		
		int endx = palavra.getX()+( (palavra.length-1) * palavra.getDirection().getX());
		int endy = palavra.getY()+( (palavra.length-1) * palavra.getDirection().getY());
		
		if ( endx < 0 || endx >= size || endy < 0 || endy >= size) {
			return false;
		}
		for (PalavraPuzzle palavra2 : palavras) {
			if (palavra2.getPalavra().equals(palavra.getPalavra()) || 
					palavra2.getPalavra().contains(palavra.getPalavra()) ||
					palavra.getPalavra().contains(palavra2.getPalavra()) ||
					palavra2.intercepts(palavra)) {
				return false;
			}
		}
		
		palavras.add(palavra);
		return true;
	}
	
	public void generate() {
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++)
				areadopuzzle[i][j] = getRandomChar();
		}
		printCharArray();
		
		for (PalavraPuzzle palavra : palavras)
			insertIntoPuzzle(palavra);
		
	}
	
	private void insertIntoPuzzle(PalavraPuzzle palavra) {
		
		String pal = palavra.getPalavra().toUpperCase();
		int xindex,yindex;
		
		for(int i = 0; i < pal.length(); i++) {
			xindex = palavra.getX()+( i * palavra.getDirection().getX());
			yindex = palavra.getY()+( i * palavra.getDirection().getY());
			areadopuzzle[yindex][xindex] = pal.charAt(i);
		}
		
		printCharArray();
	}
	
	private static char getRandomChar() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'A');
		return c;
	}
	
	public void printCharArray() {
		for (int i=0;i<size;i++) {
			System.out.println(areadopuzzle[i]);
		}
	}
	
}
