package exames.EN1415.Soluções.bb.base;

public class RemoveException extends Exception{
	public RemoveException(){
		System.err.println("Operação não suportada!");
	}
}