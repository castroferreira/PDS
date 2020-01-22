package aulas_praticas.aula10_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Cliente extends Observer {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public void update(Subject produtoUpdate) {
        System.out.printf("LEILAO %d Cliente notificado: %-13s Valor atual do produto %.1f\n", produtoUpdate.codigoProduto(), nome, produtoUpdate.valorAtualDoProduto());
    }

    public void fazerLicitacao(Subject leilao, int valor) throws UnsupportedOperationException {
        super.leilaoSubject.add(leilao);
        System.out.println("Licitacao: " + nome + " fez uma licitacao de " + valor + " no produto " + leilao.produtoLeiloado());
        leilao.licitacao(this, valor);
    }
}
