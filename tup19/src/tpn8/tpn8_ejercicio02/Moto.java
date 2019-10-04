package tpn8_ejercicio02;

public class Moto implements Vehiculo {

    private int velocidad;

    public Moto(int velocidad) {

        this.ACELERAR(velocidad);
    }

    private void setVelocidad(int velocidad2) {
		this.velocidad=velocidad2;
		
	}

	@Override
    public void FRENAR(int frenar) {
        int a = this.velocidad-frenar;

        this.velocidad-=frenar;
        
        if (this.velocidad>120) {
            System.out.println( "velocidad máxima ha sido superada.");
        }else {
        	System.out.println("circule tranquilo buen señor.");
        }
 
    }

    @Override
    public void ACELERAR(int acelerar) {

        this.velocidad+=acelerar;

        if (this.velocidad>120) {
            System.out.println( "velocidad máxima ha sido superada.");
        }else {
        	System.out.println("circule tranquilo buen señor.");
        }
    }

    @Override
    public String PLAZAS() {

        return "Moto:\ncantidad de plazas = 2";
    }

    @Override
    public int getVelocidad() {
        return this.velocidad;
    }

}