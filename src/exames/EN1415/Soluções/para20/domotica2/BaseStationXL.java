package exames.EN1415.Soluções.para20.domotica2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import exames.EN1415.Soluções.para20.domotica1.BaseStation;
import exames.EN1415.Soluções.para20.domotica1.Sensor;

/**
 *
 * @author Bruno Areias
 */
public class BaseStationXL extends BaseStation {

    private int id;
    private List<StationObserver> observers;

    public BaseStationXL(int id, String name) {
        super(name);
        this.id = id;
        observers = new ArrayList<>();
    }

    @Override
    public void connect(Sensor s) {
        super.connect(s);
        sendUpdate();
    }

    @Override
    public void disconnect(Sensor s) {
        super.disconnect(s);
        sendUpdate();
    }

    public void regist(StationObserver observer) {
        observers.add(observer);
    }

    public void sendUpdate() {
        for (Iterator<StationObserver> it = observers.iterator(); it.hasNext();) {
            StationObserver observer = it.next();
            observer.update(id, super.getSensors().size());
        }
    }
}
