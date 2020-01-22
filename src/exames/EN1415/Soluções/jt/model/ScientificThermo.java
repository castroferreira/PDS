package exames.EN1415.Soluções.jt.model;

import exames.EN1415.Soluções.jt.base.Sensor;

public class ScientificThermo implements Sensor{

	/**
	 * @return Kelvin temperature 
	 */
	public double read() {
		// a ligação ao dispositivo é feita aqui. 
		// para simplificar e testar a aplicação devolve-se um valor constante
		return 355;
	}
	
	@Override
	public String toString() {
		return "ScientificThermo";
	}

	@Override
	public double measure() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calibrate(double cal) {
		// TODO Auto-generated method stub
		
	}

}
