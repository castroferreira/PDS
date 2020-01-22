package exames.EN1415.Soluções.para20.domotica2;

/**
 *
 * @author Bruno Areias
 */
public class EnglishCentral extends Central {

    public EnglishCentral(int id) {
        super(id);
    }

    @Override
    public void update(int stationId, int activeSensors) {
        String text = "%s: Recent info from base station '%d': %d active sensors";
        System.out.printf(text + "\n", this, stationId, activeSensors);
    }

}
