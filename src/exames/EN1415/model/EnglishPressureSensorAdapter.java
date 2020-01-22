package exames.EN1415.model;

import exames.EN1415.base.Sensor;

public class EnglishPressureSensorAdapter extends EnglishPressureSensor implements Sensor{
	
	private double offset=0; 
	@Override
	public double measure() {
		double psi= super.measure();
		double bar= 15.50368*psi; 
		return bar+offset;
	
	}
	
	@Override
	public void calibrate(double cal) {
		offset=cal; 
	}

	
}
