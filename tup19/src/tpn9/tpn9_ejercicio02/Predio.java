package tpn9_ejercicio02;

public abstract class Predio implements Cantidad, Tipo{
	
	@Override
	public int getCantidad(){
		return 0;
		
	}
	
	@Override
	public String getTipo(){
		return null;
	}
	
	
	public double getSuperficie(){
		return 0;
		
	}
	
	
}
