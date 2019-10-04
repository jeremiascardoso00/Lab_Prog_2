package tpn8_ejercicio03;

import java.util.Scanner;

public class Coche implements Vehiculo{

    private int velocidad=0;

    public Coche(int velocidad) {
    	this.ACELERAR(velocidad);
    }

    private void setVelocidad(int velocidad2) {
    	this.velocidad=velocidad2;
    		
    	
	}

	@Override
    public void FRENAR() {
		
		int frenar=0;
		Scanner p = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad que desea frenar:");
		
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