package exames.EN1415.model;

import exames.EN1415.base.Sensor;

public class ScientificThermo{

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

}
