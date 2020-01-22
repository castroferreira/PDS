package aulas_praticas.aula09_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Banco2 extends ChainOfResponsability {

    public Banco2() {
        super(Banco.banco2);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco 2");
    }
}
