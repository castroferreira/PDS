package exames.ER1819;

/**
 *
 * @author andreia
 */
public class Prestador {

    private String nome, email;
    private TipoServico tipo;

    public Prestador(String nome, String email, TipoServico tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return ".Prestador[" + "nome=" + nome + ", email=" + email + ", tipo=" + tipo + ']';
    }
}
