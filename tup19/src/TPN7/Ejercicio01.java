package TPN7;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner p = new Scanner (System.in);
		
		int num=0;
		
		System.out.println("ingrese un numero");
		
		try {
			
			num = p.nextInt();
			if (num % 2 == 0) {
				System.out.println("el numero ingresado es par");
			}else {
				System.out.println("el numero ingresado es impar");
			}
			
		}catch (Exception e) {
			System.out.println("el valor ingresado no es numerico");
		}	
	}

}
