package todos_os_padroes.Structural_Patterns.Adapter.A;

/**
 *
 * Interface que vai ser implementada pelo Adapter. Esta define as ações que o
 * Adapter irá realizar
 *
 */
public interface TemperaturaInfo {

    public double getTemperaturaF();

    public void setTemperaturaF(double temperaturaF);

    public double getTemperaturaC();

    public void setTemperaturaC(double temperaturaC);
}
