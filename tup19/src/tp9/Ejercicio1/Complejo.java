package tp9.Ejercicio1;

public class Complejo extends Numeros implements ParaNumeros {
    double valor1, valor2;
    public Complejo(double valor1, double valor2){
        this.valor1=valor1;
        this.valor2=valor2;
        super.tipo="Complejo";
    }

    @Override
    public void Suma(Numeros n1, Numeros n2) {

    }

    @Override
    public void Resta(Numeros n1, Numeros n2) {

    }

    @Override
    public void Multiplicacion(Numeros n1, Numeros n2) {

    }
}
