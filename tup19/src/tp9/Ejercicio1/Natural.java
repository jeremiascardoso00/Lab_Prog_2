package tp9.Ejercicio1;

public class Natural extends Numeros implements ParaNumeros {
    int valor;
    public Natural(int valor){
        this.valor=valor;
        super.tipo="Natural";
    }

    @Override
    public void Suma(Numeros n1, Numeros n2) {
        System.out.println("La suma da como resultado: "+(((Natural)n1).valor+(((Natural)n2).valor)));
    }

    @Override
    public void Resta(Numeros n1, Numeros n2) {
        System.out.println("La resta da como resultado: "+(((Natural)n1).valor-(((Natural)n2).valor)));
    }

    @Override
    public void Multiplicacion(Numeros n1, Numeros n2) {
        System.out.println("La multiplicacion da como resultado: "+(((Natural)n1).valor*(((Natural)n2).valor)));
    }
}
