package exames.EN1819;


import java.util.*;

/**
 *
 * @author andreia
 */
public class Pacote implements Servico {

    private List<Servico> servico = new ArrayList<>();
    private String nome, descricao;
    private int fidelizacao;
    private static double desconto = 0.8;

    public Pacote(String nome, String descricao, int fidelizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.fidelizacao = fidelizacao;
    }

    void add(Servico s) {
        servico.add(s);
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
        double valor_final = 0;

        for (Servico s : servico) {
            valor_final += s.valor();
        }

        return valor_final * desconto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Pactote ["
                + "nome=" + nome
                + ", descricao=" + descricao
                + ", preco=" + valor()
                + "], com fidelizacao de " + fidelizacao + " meses");

        for (Servico s : servico) {
            sb.append("\n   " + s.toString());
        }

        return sb.toString();
    }
}