package exames.EN1819;

/**
 *
 * @author andreia
 */
public class Voz implements Servico {
    private String nome, descricao;
    private double valor;

    public Voz(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
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

    @Override
    public String toString() {
        return "TV[" + "nome=" + nome() + ", descricao=" + descricao() + ", valor=" + valor() + ']';
    }   
}