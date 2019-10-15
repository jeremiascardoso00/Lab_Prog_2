package tpn9_ejercicio01;

public class Complejo extends Numeros implements ParaNumeros {
    private double valor1, valor2;
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
    public void Suma(double n1, double n2, double n3, double n4) {
    	System.out.print("La suma da como resultado: "+ (n1+n3)+", "+(n2+n4));
    	
    	}

    @Override
    public void Resta(double n1, double n2, double n3, double n4) {
    	System.out.print("La resta da como resultado: "+ (n1-n3)+", "+(n2-n4));
    }

    @Override
    public void Multiplicacion(double n1, double n2, double n3, double n4) {
    	System.out.print("La multiplicacion da como resultado: "+ (n1*n3)+", "+(n2*n4));
    }

    @Override
    public String getTipo() {
        return "Complejo";
    }

    @Override
    public double getValor1() {
        return this.valor1;
    }

    @Override
    public double getValor2() {
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