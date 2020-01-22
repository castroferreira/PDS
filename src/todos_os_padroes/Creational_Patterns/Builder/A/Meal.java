package todos_os_padroes.Creational_Patterns.Builder.A;

/**
 *
 * A classe Meal vai ser o produto que representa os itens numa refeição.
 *
 */
public class Meal {

    private String prato;
    private String bebida;
    private String entrada;

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "prato principal: " + prato + ", bebida: " + bebida + ", entrada: " + entrada;
    }
}
