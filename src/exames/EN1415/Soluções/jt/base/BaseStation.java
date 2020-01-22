package exames.EN1415.Soluções.jt.base;

import java.util.ArrayList;
import java.util.List;

public class BaseStation {
	
	private String name;
	private List<Sensor> sensores = new ArrayList<>();
	
	public BaseStation(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public void connect(Sensor s) {				//adiciona
		sensores.add(s);
	}
	
	public void disconnect(Sensor s) {			//remove
		sensores.remove(s);
	}

	public List<Sensor> getSensors() {			//retorna todos os sensores
		return sensores;
	}
}
