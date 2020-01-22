package exames.EN1819;

/**
 *
 * @author andreia
 */
public class TV implements Servico {
    
    private String nome, descricao;
    private double valor;
    private int canais;

    public TV(String nome, String descricao, double valor, int canais) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.canais = canais;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public double valor() {
        return valor;
    }

    public int getCanais() {
        return canais;
    }

    @Override
    public String toString() {
        return "TV[" + "nome=" + nome() + ", descricao=" + descricao() + ", valor=" + valor() + ", canais=" + getCanais() + ']';
    }
}