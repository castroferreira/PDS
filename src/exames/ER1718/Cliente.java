package exames.ER1718;

/**
 *
 * @author andreia
 */
public class Cliente {

    private String ref, nome;

    public Cliente(String ref, String nome) {
        this.ref = ref;
        this.nome = nome;
    }

    public String getRef() {
        return ref;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[ref=" + ref + ", nome=" + nome + "]";
    }
}