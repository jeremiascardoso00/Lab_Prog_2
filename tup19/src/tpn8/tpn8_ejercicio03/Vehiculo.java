package tpn8_ejercicio03;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;

    void FRENAR();

    void ACELERAR(int acelerar);

    String PLAZAS();

    int getVelocidad();
}