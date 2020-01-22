package exames.EN1415.model;
import exames.EN1415.base.Sensor;

public class AmericanThermoAdapter extends AmericanThermo implements Sensor {

	private double offset=0;

	@Override
	public double measure() {
		double fahrenheit = getTemperature();
		double celsius= (fahrenheit - 32)*((double)5/(double)9);
		return celsius+offset;
	}

	@Override
	public void calibrate(double cal) {
		offset=cal; 
		
	} 
	
	
}
