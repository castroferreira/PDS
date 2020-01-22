package exames.EN1415.Soluções.bia.model;

import exames.EN1415.Soluções.bia.base.Sensor;

public class ScientificThermoAdapter extends ScientificThermo implements Sensor{
	private double offset=0; 
	@Override
	public double measure() {
		double kelvin= read(); 
		double celsius= kelvin-274.15; 
		return celsius+offset;
	}

	@Override
	public void calibrate(double cal) {
		offset=cal; 
		
	}

}
