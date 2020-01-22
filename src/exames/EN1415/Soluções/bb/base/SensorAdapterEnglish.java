package exames.EN1415.Soluções.bb.base;

import exames.EN1415.Soluções.bb.model.EnglishPressureSensor;

public class SensorAdapterEnglish implements Sensor {
	
	private EnglishPressureSensor es;
	private double offset = 0;
	
	public SensorAdapterEnglish(EnglishPressureSensor english){
		
		es=english;
	}
	
	@Override
	public double measure() {
		
		return (13.50368*es.measure())+offset;
	}

	@Override
	public void calibrate(double cal) {
		offset=cal;
		
	}
	
	@Override
	public String toString() {
		return "EnglishPressure";
	}

}
