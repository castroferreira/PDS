package aulas_praticas.aula09_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public abstract class ChainOfResponsability {

    //next element in chain or responsibility
    protected ChainOfResponsability next;
    protected Banco idBanco;

    public ChainOfResponsability(Banco id) {
        next = null;
        idBanco = id;
    }

    public void setNext(ChainOfResponsability chain) {
        if (next == null) {
            next = chain;
        } else {
            next.setNext(chain);
        }
    }

    public void efetuarPagamento(Banco id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();
        } else {
            if (next == null) {
                throw new Exception("o banco nao esta registado");
            }
            next.efetuarPagamento(id);
        }
    }

    private boolean podeEfetuarPagamento(Banco id) {
        if (idBanco == id) {
            return true;
        }
        return false;
    }

    protected abstract void efetuaPagamento();
}
