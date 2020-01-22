package exames.EN1415.Soluções.bb.base;
import exames.EN1415.Soluções.bb.model.EuroThermo;
import exames.EN1415.Soluções.bb.model.ScientificThermo;
import exames.EN1415.Soluções.bb.model.AmericanThermo;
import exames.EN1415.Soluções.bb.model.EnglishPressureSensor;
import java.util.List;


public class Domotica {

	public static void main(String[] args) {
		
		BaseStation base = new BaseStation("Hall");
		base.connect(new EuroThermo());
		base.connect(new SensorAdapterAmerican(new AmericanThermo()));
		base.connect(new SensorAdapterEnglish(new EnglishPressureSensor()));
		base.connect(new SensorAdapterScientific(new ScientificThermo()));
		// Problema 1, alinea a) - adicione mais sensores à estação
		// ...
		
		
		List<Sensor> sensors = base.getSensors();
		
		// Problema 1, alinea b) - crie uma solução para impedir este tipo de acesso 	
		
		try{
			sensors.add(new EuroThermo()); 
			sensors.remove(0);
		}catch(UnsupportedOperationException e){
			System.out.println("Operacoes nao suportadas!");
		}
		
		
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