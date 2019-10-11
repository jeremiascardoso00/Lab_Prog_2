package tpn9_ejercicio01;

public class Complejo extends Numeros implements ParaNumeros {
    private int valor1, valor2;
    private static int id=0;
    private int idComplejo;
    
    public Complejo(int valor1, int valor2){
    	
        this.valor1=valor1;
        this.valor2=valor2;
		id++;
		this.setIdComplejo(id);
		getTipo();
        }


    @Override
    public void Suma(int n1, int n2, int n3, int n4) {
    	System.out.print("La suma da como resultado: "+ (n1+n3)+", "+(n2+n4));
    	
    	}

    @Override
    public void Resta(int n1, int n2, int n3, int n4) {
    	System.out.print("La resta da como resultado: "+ (n1-n3)+", "+(n2-n4));
    }

    @Override
    public void Multiplicacion(int n1, int n2, int n3, int n4) {
    	System.out.print("La multiplicacion da como resultado: "+ (n1*n3)+", "+(n2*n4));
    }

    @Override
    public String getTipo() {
        return "Complejo";
    }

    @Override
    public int getValor1() {
        return this.valor1;
    }

    @Override
    public int getValor2() {
        return this.valor2;
    }

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Complejo.id = id;
	}

	public int getIdComplejo() {
		return idComplejo;
	}

	public void setIdComplejo(int idComplejo) {
		this.idComplejo = idComplejo;
	}
}