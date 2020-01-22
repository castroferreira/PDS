package exames.EN1415.Soluções.jt.base;

import exames.EN1415.Soluções.bb.model.EnglishPressureSensor;
import exames.EN1415.Soluções.bb.model.AmericanThermo;
import exames.EN1415.Soluções.bb.model.ScientificThermo;
import exames.EN1415.Soluções.bb.model.EuroThermo;

public class StationAdapter implements Sensor{
	Sensor sensor;
	
	public StationAdapter(String stationType){
		if(stationType.equalsIgnoreCase("Fahrenheit")){
			sensor = (Sensor) new AmericanThermo();
		}
		
		else if(stationType.equalsIgnoreCase("Celsius")){
			sensor = (Sensor) new EuroThermo();
		}
		
		else if(stationType.equalsIgnoreCase("Kelvin")){
			sensor = (Sensor) new ScientificThermo();
		}
		
		else if(stationType.equalsIgnoreCase("PSI")){
			sensor = (Sensor) new EnglishPressureSensor();
		}
	}
	@Override
	public double measure() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calibrate(double cal) {
	}

}
