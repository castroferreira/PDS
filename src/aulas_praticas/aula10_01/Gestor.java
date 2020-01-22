package aulas_praticas.aula10_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Gestor extends Observer {

    private final String nome;
    List<Produto> produto = new ArrayList<>();

    public Gestor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addProduto(Produto p) {
        produto.add(p);
    }

    public boolean existeProduto(int codigo) {
        for (Produto p : produto) {
            if (p.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public Subject iniciarLeilao(Produto produto, int timeSeconds) {
        // O gestor tem de conhecer o produto
        if (!existeProduto(produto.getCodigo())) {
            // Caso nao exista, lança exceção
            throw new UnsupportedOperationException("O gestor desconhece o produto fornecido.");
        }

        Subject leilao = new Subject(this, produto);

        super.leilaoSubject.add(leilao);

        produto.setEstado(Estados.LEILAO);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            // implementar o run da thread
            @Override
            public void run() {
                //o timer acabou!
                if (leilao.valorAtualDoProduto() > produto.getPreco_base()) {
                    //existiram bids e por isso foi vendido
                    produto.setEstado(Estados.VENDAS);
                    System.out.println("\n---- FIM LEILAO " + leilao.codigoProduto() + " ----\n" + produto.getDescricao() + " vendido ao " + leilao.vencedor() + " por " + leilao.valorAtualDoProduto());
                    removeSubject(leilao);
                } else {
                    produto.setEstado(Estados.STOCK);
                    System.out.println("\n---- FIM LEILAO " + leilao.codigoProduto() + " ----\n" + produto.getDescricao() + " colocado em stock.");
                }
                timer.cancel();
            }
        },
                timeSeconds * 1000);

        System.out.println("Leilão do produto " + produto.getCodigo() + " (" + produto.getDescricao() + ") com um tempo de duração de " + timeSeconds + " segundos ");
        System.out.println("--------------- INICIADO ---------------\n");
        return leilao;
    }

    @Override
    public void update(Subject produtoUpdate) {
        System.out.println("LEILAO " + produtoUpdate.codigoProduto() + "Gestor autoriza licitacao no produto " + produtoUpdate.produtoLeiloado());
    }

    public void removeSubject(Subject s) {

    }
}
