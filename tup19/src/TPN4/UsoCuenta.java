package TPN4;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
		
		String nombreTitular;
		int saldo,cuentaNum;
		double ingreso;
		boolean confirmacion=false;
		
		Scanner p = new Scanner (System.in);
		
		CuentaCorriente[] cuenta = new CuentaCorriente [2];
		
		CuentaCorriente.Creacion(cuenta);
		CuentaCorriente.ListarCuentas(cuenta);
		
		do{
			System.out.println("Ingrese la cuenta que desea utilizar: 0/1");
			cuentaNum = p.nextInt();
			if (cuentaNum == 0 || cuentaNum == 1){
				confirmacion=true;
			}else{
				System.out.print("Opcion incorrecta");
			}
		}while(confirmacion = false);
		
		//seleccion de operacion prox
		System.out.println("Ingrese la operacion que desea realizar sobre la cuenta numero "+cuenta[cuentaNum].getNum()+": \n"
				+ "1_deposito\n"
				+ "2_extraccion\n"
				+ "3_ver saldo\n"
				+ "4_ver informacion de la cuenta\n"
				+ "5_transferencias" );
		int resp=p.nextInt();
		switch(resp){
			case 1:
				System.out.println("Ingrese la cantidad que desea depositar en su cuenta: ");
				ingreso=p.nextDouble();
				cuenta[cuentaNum].setDeposito(ingreso);
				System.out.println("su nuevo saldo es: "+cuenta[cuentaNum].getSaldo());
				break;
			case 2:
				System.out.println("Ingrese la cantidad que desea extraer de su cuenta: ");
				ingreso=p.nextDouble();
				cuenta[cuentaNum].setExtraccion(ingreso);
				System.out.println("su nuevo saldo es: "+cuenta[cuentaNum].getSaldo());
				break;
			case 3:
				cuenta[cuentaNum].getSaldo();
				break;
			case 4:
				cuenta[cuentaNum].getInfo();
				break;
			case 5:
				System.out.println("ingrese el numero de la cuenta a la que desea transferir:");
				int indice = p.nextInt();
				System.out.println("ingrese el monto que desea transferir");
				ingreso=p.nextDouble();
				int retorno=cuenta[cuentaNum].transferencia(cuenta, cuentaNum,indice , ingreso);
				System.out.println("el nuevo saldo de la cuenta "+cuenta[retorno].getNum()+" es: "+cuenta[retorno].getSaldo());
				System.out.println("el nuevo saldo de la cuenta "+cuenta[cuentaNum].getNum()+" es: "+cuenta[cuentaNum].getSaldo());
				break;
			default:
				System.out.println("opcion incorrecta");
				break;
		}
		
		
	}

}
