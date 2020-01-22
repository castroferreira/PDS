package exames.EN1415.Soluções.jt.model;
import exames.EN1415.Soluções.jt.base.Sensor;


public class EuroThermo implements Sensor{
	
	private double offset = 0; // valor de calibração dos sensor

	/**
	 * @return Celcius temperature 
	 */
	@Override
	public double measure() {
		// a ligação ao dispositivo é feita aqui. 
		// para simplificar e testar a aplicação devolve-se um valor constante
		return 30.6 + offset;
	}
	
	@Override
	public void calibrate(double cal) {
		offset = cal;
	}
	
	@Override
	public String toString() {
		return "EuroThermo";
	}

}
