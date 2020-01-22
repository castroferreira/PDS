package exames.EN1718;

/**
 *
 * @author andreia
 */
public class Apartamento implements Imovel {

    private String tipo, descricao;
    private int preco;

    public Apartamento(String tipo, String descricao, int preco) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String type() {
        return tipo;
    }

    @Override
    public String description() {
        return descricao;
    }

    @Override
    public double price() {
        return preco;
    }
    
    @Override
    public String toString() {
        return "Apartamento[" + "tipo=" + type() + ", descricao=" + description() + ", preco=" + price() + ']';
    }
}