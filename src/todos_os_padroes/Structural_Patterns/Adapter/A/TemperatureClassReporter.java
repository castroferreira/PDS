package todos_os_padroes.Structural_Patterns.Adapter.A;

/**
 *
 * Esta classe é um adapter. Esta vai estender o CelciusReporter(adaptado) e
 * implementa TemperaturaInfo(interface de destino)
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperaturaInfo {

    private double temperaturaF;

    @Override
    public double getTemperaturaC() {
        return temperaturaC;
    }

    @Override
    public double getTemperaturaF() {
        return cToF(temperaturaC);
    }

    @Override
    public void setTemperaturaC(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }

    @Override
    public void setTemperaturaF(double temperaturaF) {
        this.temperaturaF = temperaturaF;
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
