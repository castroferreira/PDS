package aulas_praticas.aula04_T2_02;

import java.io.*;
import java.util.*;

public class Rua {
	public static void main(String[] args) throws FileNotFoundException{
		Morador x = new Morador(new File("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/exemplo1.txt"));
		x.load();
		
		Scanner sc = new Scanner(new File("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/commands1.txt"));
		
		do {
			String []line = sc.nextLine().split(" ");
			String op = line[0];
			
			switch(op) {
			
				case "map":
					x.map();
					break;
				case "add":
					x.add(line[1],Integer.parseInt(line[2]) ,Integer.parseInt(line[3]));
					break;
				case "remove":
					x.remove(line[1]);
					break;
				case "quit":
					x.quit();
					break;
				case "clear":
					x.clear();
					break;
				default:
			}	
		} while(sc.hasNextLine());
	}
}
