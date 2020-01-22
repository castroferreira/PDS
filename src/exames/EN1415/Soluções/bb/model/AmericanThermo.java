package exames.EN1415.Soluções.bb.model;

public class AmericanThermo {

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
	
}
