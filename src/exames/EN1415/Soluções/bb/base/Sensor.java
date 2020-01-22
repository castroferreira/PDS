package exames.EN1415.Soluções.bb.base;
//package AP1.sensor;

public interface Sensor {

	/**
	 * @return medida + valor de calibração
	 */
	public double measure();
	
	/**
	 * @param cal offset de calibração
	 * O método calibrate permite ajustar os valores que são devolvidas pelo sensor
	 */
	void calibrate(double cal);
	
}
