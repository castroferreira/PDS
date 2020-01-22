package exames.EN1819;

/**
 *
 * @author andreia
 */
public class Net implements Servico {

    private String nome, descricao, mb;
    private double valor;

    public Net(String nome, String descricao, double valor, String mb) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.mb = mb;
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

    public String getMb() {
        return mb;
    }

    @Override
    public String toString() {
        return "NET[" + "nome=" + nome() + ", descricao=" + descricao() + ", valor=" + valor() + ", mb=" + getMb() + ']';
    }
}
