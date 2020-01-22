package exames.EN1415.Soluções.para20.domotica2;

/**
 *
 * @author Bruno Areias
 */
public class PortugueseCentral extends Central {

    public PortugueseCentral(int id) {
        super(id);
    }

    @Override
    public void update(int stationId, int activeSensors) {
        String text = "%s: Detectada estação base '%d' com %d sensores ativos";
        System.out.printf(text + "\n", this, stationId, activeSensors);
    }

}
