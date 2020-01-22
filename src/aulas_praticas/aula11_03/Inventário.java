package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Inventário implements State {

    public static Inventário inventario = new Inventário();

    public static State getInstance() {
        return inventario;
    }

    public Inventário() {
    }

    @Override
    public void regista(Livro livro) {
        livro.setEstado(Disponivel.getInstance());
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
        throw new UnsupportedOperationException("Operacao indisponivel");
    }
}
