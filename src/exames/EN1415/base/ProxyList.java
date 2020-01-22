package exames.EN1415.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProxyList<E> extends ArrayList<E> {
	
	private List<E> lista; 
	
	public ProxyList(List<E> lista){
		this.lista=lista; 
	}
	
	
	public String toString(){
		return lista.toString();
	}
	
	public Iterator<E> iterator(){
		return lista.iterator();
	}
	
}
