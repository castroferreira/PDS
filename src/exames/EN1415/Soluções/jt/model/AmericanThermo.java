package exames.EN1415.Soluções.jt.model;
import exames.EN1415.Soluções.jt.base.Sensor;

public class AmericanThermo implements Sensor{

	/**
	 * @return Fahrenheit temperature 
	 */
	public double getTemperature() {	
		// a ligação ao dispositivo é feita aqui. 
		// para simplificar e testar a aplicação devolve-se um valor constante
		return 150;
	}

	@Override
	public String toString() {
		return "AmericanThermo";
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
