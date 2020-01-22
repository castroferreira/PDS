package aulas_praticas.aula09_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Banco3 extends ChainOfResponsability {

    public Banco3() {
        super(Banco.banco3);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no banco 3");
    }
}
