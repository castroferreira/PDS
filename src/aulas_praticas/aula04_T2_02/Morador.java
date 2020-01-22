package aulas_praticas.aula04_T2_02;

import java.util.HashMap;
import java.io.*;
import java.util.*;

public class Morador implements RuaY {
	private HashMap<String, int[]> pessoa = new HashMap<String, int[]>();
	Scanner sc;

	public Morador(File f) throws FileNotFoundException {
		this.sc = new Scanner(f);
	}

	@Override
	public void load() {
		int[] portas = new int[2];
		String[] str;
		String s;

		while (sc.hasNextLine()) {
			portas = new int[2];
			s = sc.nextLine();
			str = null;

			if (s.charAt(0) != '>') {
				str = s.split(" |-");

				for (int i = 0; i < 2; i++)
					portas[i] = Integer.parseInt(str[i]);

				if (validate(str[2]))
					pessoa.put(str[2], portas);
			}
		}
	}

	@Override
	public void map() {
		int x = maxdoor();
		for (int i = 1; i <= x; i++) {
			int z = 0;
			int y = 0;
			System.out.printf("%d", i);
			for (String key : pessoa.keySet()) {
				int[] doors = pessoa.get(key);
				int max = doors[1];
				int mix = doors[0];
				if (i >= mix && i <= max) {
					if (max == z && mix == y) {
						System.out.printf(" %s", key);
					} else {
						System.out.printf(" : %s", key);
						z = max;
						y = mix;
					}
				}
			}
			System.out.println();
		}

	}

	@Override
	public boolean add(String s, int x, int y) {
		int[] doors = new int[2];
		doors[0] = x;
		doors[1] = y;
		
		if(validate(s)){
			pessoa.put(s, doors);
			return true;
		}
		else{
			System.err.println("Erro ao adicionar.");
			return false;
		}
	}

	@Override
	public boolean remove(String s) {
		pessoa.remove(s);

		return false;
	}

	@Override
	public void list() {

	}

	@Override
	public void lookup() {

	}

	@Override
	public void clear() {
		pessoa.clear();

	}

	@Override
	public void quit() {
		System.out.println("A terminar...");
		System.exit(0);

	}

	public int maxdoor() {
		int x = 1;
		for (String key : pessoa.keySet()) {
			int[] doors = pessoa.get(key);
			int max = doors[1];
			if (max > x)
				x = max;
		}
		return x;
	}

	public boolean validate(String s) {
		if (!Character.isLetter(s.charAt(0))) {
			System.err.printf("O nome deve começar com uma letra %s", s);
			return false;
		}
		if (!Character.isLetter(s.charAt(s.length() - 1))
				&& !Character.isDigit(s.charAt(s.length() - 1))) {
			System.err.printf("O nome não pode acabar com um simbolo %s", s);
			return false;
		}
		if (s.length() > 40) {
			System.err.printf("Nome demasiado grande %s", s);
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))
					&& !Character.isLetter(s.charAt(i))
					&& !(s.charAt(i) == '_' || s.charAt(i) == '.' || s
							.charAt(i) == '@')) {
				System.err.println("Nome Invalido");
				return false;
			}
		}
		return true;
	}
	

}
