package TPN7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner (System.in);
		
		int num=0,resp=0;
		do{
			resp=0;
			
			System.out.println("ingrese un numero");
		
			try {
				
				num = Integer.parseInt(p.next());
				if (num % 2 == 0) {
					System.out.println("el numero ingresado es par");
				}else {
					System.out.println("el numero ingresado es impar");
				}
				
			}catch (NumberFormatException e) {
				System.out.println("el valor ingresado no es numerico");
				resp=1;
			}	
			
		}while(resp==1);
		
		
		
	}

}
