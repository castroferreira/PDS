package exames.EN1415.Soluções.jt.base;

import exames.EN1415.Soluções.jt.model.ScientificThermo;
import exames.EN1415.Soluções.jt.model.EnglishPressureSensor;
import exames.EN1415.Soluções.jt.model.AmericanThermo;
import exames.EN1415.Soluções.jt.model.EuroThermo;
import exames.EN1415.Soluções.jt.base.BaseStation;
import exames.EN1415.Soluções.jt.base.Sensor;

import java.util.List;


public class Domotica {

	public static void main(String[] args) {
		// Problema 1, alinea a) - adicione mais sensores à estação
		// ...
		BaseStation base = new BaseStation("Hall");
		base.connect(new EuroThermo());
		base.connect(new AmericanThermo());
		base.connect(new EnglishPressureSensor());
		base.connect(new ScientificThermo());

		

		List<Sensor> sensors = base.getSensors();		
		// Problema 1, alinea b) - crie uma solução para impedir este tipo de acesso 	
//		sensors.add(new EuroThermo()); 
//		sensors.remove(0);
		
		System.out.printf("Base station '%s' with %d active sensors\n", base.name(), sensors.size());
		for (Sensor sensor : sensors)
			System.out.printf("%s: %5.2f\n", sensor, sensor.measure());
		for (Sensor sensor : sensors) 
			sensor.calibrate(-1.2);
		System.out.println("\n.... After Calibration ....");
		for (Sensor sensor : sensors) 
			System.out.printf("%s: %5.2f\n", sensor, sensor.measure());
	}
}