package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Disponivel implements State {

    public static Disponivel disponivel = new Disponivel();

    public static State getInstance() {
        return disponivel;
    }

    public Disponivel() {
    }

    @Override
    public void regista(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponvel");
    }

    @Override
    public void requisita(Livro livro) {
        livro.setEstado(Emprestado.getInstance());
    }

    @Override
    public void reserva(Livro livro) {
        livro.setEstado(Reservado.getInstance());
    }

    @Override
    public void devolve(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponvel");
    }

    @Override
    public void cancela(Livro livro) {
        throw new UnsupportedOperationException("Operacao indisponvel");
    }
}
