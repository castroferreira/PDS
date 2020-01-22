package exames.EN1415.Soluções.para20.model;

import exames.EN1415.Soluções.para20.domotica1.Sensor;

/**
 *
 * @author Bruno Areias
 */
public class EnglishPressureAdapter extends EnglishPressureSensor implements Sensor {

    private double offset = 0;

    @Override
    public double measure() {
        double psi = super.measure();
        double bar = 14.50368 * psi;
        return bar + offset;
    }

    @Override
    public void calibrate(double cal) {
        offset = cal;
    }
}
