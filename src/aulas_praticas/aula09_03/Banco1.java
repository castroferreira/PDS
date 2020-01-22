package aulas_praticas.aula09_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Banco1 extends ChainOfResponsability {

    public Banco1() {
        super(Banco.banco1);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco 1");
    }
}
