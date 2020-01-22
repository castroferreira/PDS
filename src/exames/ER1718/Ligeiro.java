package exames.ER1718;

/**
 *
 * @author andreia
 */
public class Ligeiro implements Viatura {

    private String matricula, descricao, tipo;
    
    public Ligeiro(String matricula, String descricao, String tipo) {
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
        return "Ligeiro [" + "matricula=" + matricula + ", descricao=" + descricao + ", tipo=" + tipo + ']';
    }
    
}