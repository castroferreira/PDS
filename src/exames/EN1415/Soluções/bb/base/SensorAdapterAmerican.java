package exames.EN1415.Soluções.bb.base;

import exames.EN1415.Soluções.bb.model.AmericanThermo;

public class SensorAdapterAmerican implements Sensor {
	
	private AmericanThermo at;
	private double offset = 0;
	
	public SensorAdapterAmerican(AmericanThermo american){
		
		at=american;
	}
	
	@Override
	public double measure() {
		
		return (at.getTemperature()-32)*(5.0/9.0)+offset;
	}

	@Override
	public void calibrate(double cal) {
		offset=cal;
		
	}
	
	@Override
	public String toString() {
		return "AmericanThermo";
	}

}
