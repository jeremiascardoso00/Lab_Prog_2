package TPN3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		int matriz[][] = new int [3][3];
		int arreglo[] = new int [9];//ARREGLO AUXILIAR PARA ORDENAR LA MATRIZ
		int cont=0;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz.length;j++){
				System.out.println("ingrese un numero para la posicion: "+"["+i+"] "+"["+j+"]");
				matriz[i][j]=p.nextInt();
				arreglo[cont] = matriz[i][j];//CARGO EL ARREGLO CON LOS VALORES DE LA MATRIZ
				cont++;
			}
		}
		System.out.println("MATRIZ DESORDENADA");
		for (int []fila:matriz){
			for (int elemento:fila){
				System.out.print(elemento+" ");
			}
			System.out.println("");
		}
				
		Arrays.sort(arreglo);//ORDENO EL ARREGLO
		
				
		cont=0;
				
		for (int i=matriz.length-1;i>=0;i--){
			for (int j=matriz.length-1;j>=0;j--){
				matriz[i][j] = arreglo[cont];//CARGO LA MATRIZ CON EL ARREGLO ORDENADO
				cont++;
			}
		}
		System.out.println ("");
		System.out.println("MATRIZ ORDENADA DE MAYOR A MENOR");
		for (int []fila:matriz){
			for (int elemento:fila){
				System.out.print(elemento+" ");
			}
			System.out.println("");
		}
				
	}

}
