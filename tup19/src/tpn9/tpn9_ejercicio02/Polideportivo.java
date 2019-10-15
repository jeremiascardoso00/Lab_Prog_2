package tpn9_ejercicio02;

public class Polideportivo extends Predio{

	private int cantidad;
	private double superficie;
	private String nombre = "jorgito";
	private String tipo = "Polideportivo";
	
	
	
	public Polideportivo(String nombre, double superficie,int cant, Canchas[] campos){
		this.nombre = nombre;
		setSuperficie(superficie);
		setCantidad(cant);
		
		
		for (int i=0; i<cant; i++){
			campos[i] = new Canchas(cant);
		}
	}
	
	
	
	@Override
	public String getTipo() {
		return tipo;
	}
	@Override
	public double getSuperficie() {
		return superficie;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
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
