package exames.EN1415.Soluções.para20.domotica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseStation {

    private String name;
    private List<Sensor> sensores = new ArrayList<>();

    public BaseStation(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void connect(Sensor s) {
        sensores.add(s);
    }

    public void disconnect(Sensor s) {
        sensores.remove(s);
    }

    public List<Sensor> getSensors() {
        return Collections.unmodifiableList(sensores);
        //return sensores;
    }
}
