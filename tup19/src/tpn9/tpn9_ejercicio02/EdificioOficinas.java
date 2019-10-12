package tpn9_ejercicio02;

public class EdificioOficinas extends Predio{
	
	private int cantidad;
	private double superficie;
	private String nombre = "jorgito";
	private String tipo = "EdificioOficinas";
	
	public EdificioOficinas(String nombre, double superficie, int cant){
		
		this.nombre = nombre;
		setSuperficie(superficie);
		
		
		setCantidad(cant);
		
		
		
	}
	@Override
	public double getSuperficie() {
		return superficie;
	}
	@Override
	public String getTipo() {
		return tipo;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		return this.cantidad;
	}
	public void setCantidad(int cant){
		this.cantidad = cant;
	}
	
}
