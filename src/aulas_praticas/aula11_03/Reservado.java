package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Reservado implements State {

    public static Reservado reservado = new Reservado();

    public static State getInstance() {
        return reservado;
    }

    public Reservado() {
    }

    @Override
    public void regista(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponivel");
    }

    @Override
    public void requisita(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponivel");
    }

    @Override
    public void reserva(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponivel");
    }

    @Override
    public void devolve(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponivel");
    }

    @Override
    public void cancela(Livro livro) {
        livro.setEstado(Disponivel.getInstance());
    }
}
