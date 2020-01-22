package todos_os_padroes.Structural_Patterns.Adapter.A;

/**
 *
 * Armazena um valor da temperatura em Celsius.
 *
 */
public class CelciusReporter {

    double temperaturaC;

    public CelciusReporter() {
    }

    public double getTemperatura() {
        return temperaturaC;
    }

    public void setTemperatura(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }
}
