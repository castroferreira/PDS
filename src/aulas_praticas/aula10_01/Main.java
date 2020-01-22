package aulas_praticas.aula10_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Quadro Picasso", 10);
        Produto p2 = new Produto("BatleField 1", 20);
        Produto p3 = new Produto("Corta Relva", 10.50);
        Produto p4 = new Produto("Nissan GTR", 8);
        Produto p5 = new Produto("Máquina de Turin", 100);

        Gestor gestor = new Gestor("Gestor");

        // Adicionar os produtos ao gestor
        gestor.addProduto(p1);
        gestor.addProduto(p2);
        gestor.addProduto(p3);
        gestor.addProduto(p4);
        gestor.addProduto(p5);

        // Criar os intervenientes do leilao
        Cliente c1 = new Cliente("Andreia Castro");
        Cliente c2 = new Cliente("Rui Serrano");
        Cliente c3 = new Cliente("Bia Marques");

        // Leilao do produto 1 com um tempo de duracao de 10 segundos
        Subject l1 = gestor.iniciarLeilao(p1, 10);

        c1.fazerLicitacao(l1, 20);
        c2.fazerLicitacao(l1, 30);

        // Leilao do produto 4 com um tempo de duracao de 5 segundos
        Subject l2 = gestor.iniciarLeilao(p4, 5);

        c2.fazerLicitacao(l2, 30);
        c3.fazerLicitacao(l1, 40);
        c1.fazerLicitacao(l2, 50);
        c1.fazerLicitacao(l1, 60);
        c3.fazerLicitacao(l2, 80);

        // Leilao do produto 5 com um tempo de duracao de 1 segundos
        Subject l3 = gestor.iniciarLeilao(p5, 1);

        // Licitacao invalida de valor inferior
        try {
            c2.fazerLicitacao(l3, 20);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }

        // Criar um produto desconhecido ao gestor
        Produto p6 = new Produto("Toshiba L50", 200);
        try {
            System.out.println("Tentativa de criar um leilao com um produto que o gestor desconhece.");
            gestor.iniciarLeilao(p6, 1);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
