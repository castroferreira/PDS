package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Emprestado implements State {

    public static Emprestado emprestado = new Emprestado();

    public static State getInstance() {
        return emprestado;
    }

    public Emprestado() {
    }

    @Override
    public void regista(Livro livro) {
        throw new UnsupportedOperationException("operacao indisponivel");
    }

    @Override
    public void requisita(Livro livro) {
        throw new UnsupportedOperationException("Operacacao indisponivel");
    }

    @Override
    public void reserva(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponivel");
    }

    @Override
    public void devolve(Livro livro) {
        livro.setEstado(Disponivel.getInstance());
    }

    @Override
    public void cancela(Livro livro) {
        throw new UnsupportedOperationException("operacao indisponivel");
    }
}
