package exames.EN1415.Soluções.bb.base;

import java.util.ArrayList;
import java.util.List;

public class ProxySensores extends ArrayList {
	
	private List<Sensor> sensores;
	public ProxySensores(List<Sensor> sensores) {
		
		this.sensores=sensores;
	}
	@Override
	public Sensor remove(int i){
		throw new UnsupportedOperationException();
	}
	
	
	public List<Sensor> getSensores(){
		return sensores;
	}
	
	

}
