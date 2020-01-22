package exames.ER1819;

/**
 *
 * @author andreia
 */
class Servico {
    
    private String titulo, descricao;
    private double preco;
    private TipoServico tipo;
    
    Servico(String titulo, String descricao, double preco, TipoServico tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
    }    

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return ".Servico[" + "titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", tipo=" + tipo + ']';
    }
}
