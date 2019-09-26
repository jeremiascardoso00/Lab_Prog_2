package tpn8;

public class Moto implements Vehiculo{

	private int velocidad=0;
	
	public Moto(int velocidad) {
		
		this.velocidad=velocidad;
	}

	@Override
	public void FRENAR(int frenar) {
		int a = this.velocidad-frenar;
		if (a>=0) {
			this.velocidad-=frenar;
		}
		else {
			System.out.println("no se puede frenar mas que 0");
		}
	}

	@Override
	public String ACELERAR(int acelerar) {
		
		this.velocidad+=acelerar;
		
		if (this.velocidad>120) {
			return "velocidad m�xima ha sido superada.";
		}else {
			return "circule tranquilo buen se�or.";
		}
	}

	@Override
	public int PLAZAS() {
		
		return 2;
	}
	
}
