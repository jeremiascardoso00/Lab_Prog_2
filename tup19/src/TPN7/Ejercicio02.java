package TPN7;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		int num=0;
		
		System.out.println("ingrese un numero del 1 al 100");
		try{
			num=p.nextInt();
			comprobante(num);
		}catch(InputMismatchException e){
			System.out.println("No se ingresó un número");
		}
		
		
		
		
		
	}
	
	public static void comprobante(int num)throws excepcionPropia{
		if (num <= 1 || num >= 100){
			throw new excepcionPropia("El nº está fuera de rango");
		}else{
			System.out.println("El numero ingresado esta dentro del rango");
		}
	}

}
