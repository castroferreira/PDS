package exames.EN1415.Soluções.para20.model;

import exames.EN1415.Soluções.para20.domotica1.Sensor;

/**
 *
 * @author Bruno Areias
 */
public class ScientificThermoAdapter extends ScientificThermo implements Sensor {

    private double offset = 0;

    @Override
    public double measure() {
        double kelvin = super.read();
        double celsius = kelvin - 273.15;
        return celsius + offset;
    }

    @Override
    public void calibrate(double cal) {
        offset = cal;
    }
}
