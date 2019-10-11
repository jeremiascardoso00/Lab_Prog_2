package tpn9_ejercicio01;

public class Natural extends Numeros implements ParaNumeros {
    private int valor;
    private static int id=0;
    private int idNumero;

    public Natural(int valor){
        this.valor=valor;
        id++;
        this.setIdNumero(id);
        
        getTipo();
    }

    @Override
    public void Suma(int n1, int n2, int n3, int n4) {
        System.out.println("La suma da como resultado: "+ (n1+n2));
    }

    @Override
    public void Resta(int n1, int n2, int n3, int n4) {
        System.out.println("La resta da como resultado: "+ (n1-n2));
    }

    @Override
    public void Multiplicacion(int n1, int n2, int n3, int n4) {
        System.out.println("La multiplicacion da como resultado: " + (n1*n2));
    }

    @Override
    public String getTipo() {
        return "Natural";
    }

    @Override
    public int getValor1() {
        return 0;
    }

    @Override
    public int getValor2() {
        return 0;
    }

    public int getValor()  {
        return this.valor;
    }

	public int getId() {
		return id;
	}

	public static void setId(int id) {
		Natural.id = id;
	}

	public int getIdNumero() {
		return idNumero;
	}

	public void setIdNumero(int idNumero) {
		this.idNumero = idNumero;
	}
}