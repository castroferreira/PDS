package Exame;

public class UnidadeCurricular {

	private int codigo;
	private String designacao;
	
	public UnidadeCurricular(int codigo, String designacao) {
		this.codigo = codigo;
		this.designacao = designacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDesignacao() {
		return designacao;
	}

	public String toString() {
		return codigo + ";" + designacao;
	}
		
}
