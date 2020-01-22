package exames.EN1415.Soluções.jt.model;

import exames.EN1415.Soluções.jt.base.Sensor;

public class EnglishPressureSensor implements Sensor{

	/**
	 * @return PSI pressure 
	 */
	public double measure() {
		// a ligação ao dispositivo é feita aqui. 
		// para simplificar e testar a aplicação devolve-se um valor constante
		return 20.5;
	}

	@Override
	public String toString() {
		return "EnglishPressure";
	}

	@Override
	public void calibrate(double cal) {
		// TODO Auto-generated method stub
		
	}
	
}
