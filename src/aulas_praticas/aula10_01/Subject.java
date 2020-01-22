package aulas_praticas.aula10_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Subject {

    private Produto produto;
    private Observer gestor;
    private List<Observer> licitador = new ArrayList<>();

    private Observer licitacao_mais_alta;
    private double preco;

    public Subject(Gestor gestor, Produto produto) {
        this.produto = produto;
        this.gestor = gestor;
        preco = produto.getPreco_base();
        licitador = null;
    }

    public void licitacao(Cliente cliente, int valor) {
        licitador.add(cliente);

        if (valor > preco) {
            preco = valor;
            licitacao_mais_alta = cliente;
            notifyGestor();
            notifyCliente(cliente);
            System.out.println("\n");
        } else {
            throw new UnsupportedOperationException("A licitacao " + produto.getCodigo() + " de " + cliente + " e invalida porque tem um valor inferior à licitacao atual.\n\n");
        }
    }

    // Notifica o vencedor do produto
    public Observer vencedor() {
        return licitacao_mais_alta;
    }

    private void notifyGestor() {
        gestor.update(this);
    }

    private void notifyCliente(Cliente c) {
        for (Observer l : licitador) {
            if (l != c) {
                l.update(this);
            }
        }
    }

    public String produtoLeiloado() {
        return produto.getDescricao();
    }

    public double valorAtualDoProduto() {
        return preco;
    }

    public int codigoProduto() {
        return produto.getCodigo();
    }
}
