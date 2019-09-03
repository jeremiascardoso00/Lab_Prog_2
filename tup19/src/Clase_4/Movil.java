package Clase_4;

public class Movil {
	private int tamanioPantalla;
	private int capacidad;
	private double precio;
	private double camara;
	private String tipo;
	private int Stock;
	public Movil (int tamanioPantalla, int capacidad, double precio, double camara, String tipo, int Stock) {
		
		this.tamanioPantalla = tamanioPantalla;
		this.capacidad = capacidad;
		this.precio = precio;
		this.camara = camara;
		this.tipo = tipo;
		this.Stock = Stock;
	}

	
	
	
	public String getInfo() {
		return (" "+ capacidad +" "+ tamanioPantalla +" "+ precio +" "+ camara+ " "+ tipo+ " "+Stock);
	}
	
}

