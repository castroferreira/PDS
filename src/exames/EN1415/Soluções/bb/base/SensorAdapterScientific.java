package exames.EN1415.Soluções.bb.base;

import exames.EN1415.Soluções.bb.model.AmericanThermo;
import exames.EN1415.Soluções.bb.model.ScientificThermo;

public class SensorAdapterScientific implements Sensor {
	
	private ScientificThermo sc;
	private double offset = 0;
	
	public SensorAdapterScientific(ScientificThermo scientific){
		
		sc=scientific;
	}
	
	@Override
	public double measure() {
		
		return (sc.read()-272.15)+offset;
	}

	@Override
	public void calibrate(double cal) {
		offset=cal;
		
	}
	
	@Override
	public String toString() {
		return "ScientificThermo";
	}

}
