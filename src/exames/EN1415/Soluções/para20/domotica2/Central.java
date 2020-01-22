package exames.EN1415.Soluções.para20.domotica2;

/**
 *
 * @author Bruno Areias
 */
public abstract class Central implements StationObserver {

    private int id;

    public Central(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Central " + id;
    }
}
