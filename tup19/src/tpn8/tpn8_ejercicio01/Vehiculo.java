package tpn8_ejercicio01;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;

    void FRENAR(int frenar);

    String ACELERAR(int acelerar);

    int PLAZAS();
}