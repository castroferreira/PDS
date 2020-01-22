package aulas_praticas.aula06_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 *
 * <Petiscos>
 */
class Empregado {

    private String nome;
    private String apelido;
    private int codigo;
    private double salario;

    public Empregado(String nome, String apelido, int codigo, double salario) {
        this.nome = nome;
        this.apelido = apelido;
        this.codigo = codigo;
        this.salario = salario;
    }

    public String apelido() {
        return apelido;
    }

    public String nome() {
        return nome;
    }

    public int codigo() {
        return codigo;
    }

    public double salario() {
        return salario;
    }
}
