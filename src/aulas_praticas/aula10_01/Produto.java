package aulas_praticas.aula10_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Produto {

    private int codigo;
    private String descricao;
    private double preco_base;
    private Estados estado;

    static int totalProdutos = 0;

    public Produto(String descricao, double preco) {
        codigo = ++totalProdutos;
        estado = Estados.STOCK;
        this.descricao = descricao;
        preco_base = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco_base() {
        return preco_base;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
