package tpn8_ejercicio03;

import java.util.Scanner;

public class Moto implements Vehiculo {

    private int velocidad;

    public Moto(int velocidad) {

        this.ACELERAR(velocidad);
    }

    private void setVelocidad(int velocidad2) {
		this.velocidad=velocidad2;
		
	}

	@Override
    public void FRENAR() {
		
		int delantero=0,trasero=0;
		
		Scanner p = new Scanner(System.in);
		System.out.println("la suma de los dos frenos sera el total.");
		System.out.println("ingrese la cantidad que desea frenar con el freno delantero:");
		delantero= p.nextInt();
		System.out.println("ingrese la cantidad que desea frenar con el freno trasero:");
		trasero= p.nextInt();
		
		

        this.velocidad-=(delantero+trasero);
        
        
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