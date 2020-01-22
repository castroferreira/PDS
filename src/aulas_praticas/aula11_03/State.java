package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface State {

    public void regista(Livro livro);

    public void requisita(Livro livro);

    public void reserva(Livro livro);

    public void devolve(Livro livro);

    public void cancela(Livro livro);
}
