package aulas_praticas.aula04_T1_02;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {

        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }

}
