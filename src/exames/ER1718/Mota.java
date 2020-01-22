package exames.ER1718;

/**
 *
 * @author andreia
 */
public class Mota implements Viatura {

    private String matricula, descricao, tipo;

    public Mota(String matricula, String descricao, String tipo) {
        this.matricula = matricula;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getType() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Mota [" + "matricula=" + matricula + ", descricao=" + descricao + ", tipo=" + tipo + ']';
    }
}