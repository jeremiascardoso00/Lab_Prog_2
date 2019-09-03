package TPN4;
import java.util.Scanner;
import java.lang.Math;
public class CuentaCorriente {
	private String nombreTitular;
	private double saldo;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo,long numeroCuenta){
		this.nombreTitular = nombreTitular;
		this.setSaldo(saldo);
		
		this.numeroCuenta = numeroCuenta;
	}
	public CuentaCorriente(){
		
	}
	

	public static void Creacion(CuentaCorriente[] cuentas) {
		Scanner p=new Scanner (System.in);
		for (int i=0;i<cuentas.length;i++) {
			System.out.print("Nombre: ");
			String nombre=p.next();
			System.out.print("\nSaldo inicial: ");
			double saldo=p.nextDouble();
			long numeroCuenta= (long) (Math.random()* 10000);
			
			CuentaCorriente cuenta= new CuentaCorriente(nombre,saldo,numeroCuenta);
			cuentas[i]=cuenta;
		}
	}
	

	public static void ListarCuentas(CuentaCorriente[] cuentas) {
		for (CuentaCorriente cuenta:cuentas) {
			System.out.println("Nombre: "+ cuenta.nombreTitular);
			System.out.println("Saldo: "+ cuenta.getSaldo());
			System.out.println("Numero de cuenta: "+ cuenta.numeroCuenta);
		}
	}
	
	
	public void setDeposito(double ingreso){
		this.setSaldo(this.getSaldo() + ingreso);
	}
	public int setExtraccion(double ingreso){
		if (this.getSaldo()-ingreso>=0){
			ingreso=this.saldo-ingreso;
			this.setSaldo(ingreso);
			return 1;
		}else{
			System.out.println("no tiene suficiente saldo");
			return 0;
		}
		
	}
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getInfo() {
		return ("Su nombre es: "+this.nombreTitular+".\nTiene un saldo de $"+this.getSaldo()+".\nSu número de cuenta es: "+this.numeroCuenta+".");
	}
	
	public long getNum(){
		return this.numeroCuenta;
	}
	
	public int transferencia(CuentaCorriente [] cuentas,int cuentaNum,int indice, double ingreso){
		int comprobante=cuentaNum;
	    for(int x=0;x<cuentas.length;x++){
	    	if (cuentas[x].getNum() == indice){
	    		comprobante = cuentas[cuentaNum].setExtraccion(ingreso);
	   			if (comprobante == 1){
	   				cuentas[x].setDeposito(ingreso);
	   				comprobante=x;
	   			}else{
	   				comprobante=cuentaNum;
	   			}
	   		break;
	    	}
	    }
	    return comprobante;
	    
	    
	}
	
	
	/*public static void Transferencia(CuentaCorriente origen, CuentaCorriente destino, int monto) {
		int retorno=origen.setExtraccion(monto);
		if (retorno!=1){
			destino.setDeposito(monto);
		}else{
			System.out.println("no posee esa cantidad en su cuenta");
		}
		
	}*/
}
