package aulas_praticas.aula09_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        ChainOfResponsability banco = new Banco1();
        banco.setNext(new Banco2());
        banco.setNext(new Banco3());
        banco.setNext(new Banco4());

        try {
            banco.efetuarPagamento(Banco.banco1);
            banco.efetuarPagamento(Banco.banco2);
            banco.efetuarPagamento(Banco.banco3);
            banco.efetuarPagamento(Banco.banco4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
