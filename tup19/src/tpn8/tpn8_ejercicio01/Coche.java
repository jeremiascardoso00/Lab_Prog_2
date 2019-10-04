package tpn8_ejercicio01;

public class Coche implements Vehiculo{

    private int velocidad=0;

    public Coche(int velocidad) {
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
            return "velocidad máxima ha sido superada.";
        }else {
            return "circule tranquilo buen señor.";
        }

    }

    @Override
    public int PLAZAS() {

        return 5;
    }



}