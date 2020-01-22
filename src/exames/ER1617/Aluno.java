package Exame;

public class Aluno {

	private int nMec;
	private String nome;
	
	public Aluno(int nMec, String nome) {
		this.nMec = nMec;
		this.nome = nome;
	}

	public int getnMec() {
		return nMec;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return nMec + ";" + nome;
	}

}
