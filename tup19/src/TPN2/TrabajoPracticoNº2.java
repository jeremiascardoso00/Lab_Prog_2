package TPN2;

import java.util.Scanner;

public class TrabajoPracticoNş2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner p=new Scanner (System.in);

	        int array[]= new int [11], negativos=0, positivos=0, nulos=0, contador=0, divisor=0;
       
	        for (int x = 1; x < array.length; x++){
	            System.out.println("ingrese un numero");
	            array[x]=p.nextInt();
	        }
       
	        for (int x = 1; x < array.length; x++){
	           if(array[x]<0){
	               negativos++;
	           }else if (array[x]>0){
	               positivos++;
	           }else{
	               nulos++;
	           }
	        }
       
	        System.out.println("numeros negativos: " + negativos);
	        System.out.println("numeros positivos: " + positivos);
	        System.out.println("numeros iguales a cero: " + nulos);
	        
	        for (int x = 1; x < array.length; x++){
	            if (x % 2 == 0){
	            	contador=array[x]+contador;
	            	divisor++;
	            }
	        }
       
	        System.out.println("el promedio de los numeros que se encuentran en las pociciones pares es: " + contador/divisor);      
	}

}
