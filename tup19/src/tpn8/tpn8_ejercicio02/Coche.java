package tpn8_ejercicio02;



public class Coche implements Vehiculo{

    private int velocidad=0;

    public Coche(int velocidad) {
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
        this.setVelocidad(this.getVelocidad() + acelerar);

        if (this.getVelocidad() >120) {
        	System.out.println( "velocidad máxima ha sido superada.");
        }else {
        	System.out.println( "circule tranquilo buen señor.");
        }

    }

    @Override
    public String PLAZAS() {

        return "Coche:\ncantidad de plazas = 5";
    }

    @Override
    public int getVelocidad() {
        return this.velocidad;
    }


}