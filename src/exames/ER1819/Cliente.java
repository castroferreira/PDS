package exames.ER1819;

/**
 *
 * @author andreia
 */
class Cliente {
    
    private String nome, email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ".Cliente[" + "nome=" + nome + ", email=" + email + ']';
    }
}
