package aulas_praticas.aula11_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Livro {

    private String titulo, ISBN, autor;
    private int ano;
    private State estado;

    public Livro(String titulo, String ISBN, String autor, int ano) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.ano = ano;
        estado = Inventário.getInstance();
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAno() {
        return ano;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void regista() {
        estado.regista(this);
    }

    public void requisita() {
        estado.requisita(this);
    }

    public void reserva() {
        estado.reserva(this);
    }

    public void devolve() {
        estado.devolve(this);
    }

    public void cancela() {
        estado.cancela(this);
    }

    @Override
    public String toString() {
        return String.format("%-23s %-15s [%s]", titulo, autor, estado.getClass().getSimpleName());
    }
}
