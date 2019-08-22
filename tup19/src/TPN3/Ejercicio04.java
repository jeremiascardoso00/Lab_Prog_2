package TPN3;
import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola. 

		Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor*/
		int matriz[][] = new int [3][3];
		int arreglo[] = new int [9];//ARREGLO AUXILIAR PARA ORDENAR LA MATRIZ
		int cont=0;
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz.length;j++){
				matriz[i][j]=(int) (Math.random()*100);
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
		
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz.length;j++){
				matriz[i][j] = arreglo[cont];//CARGO LA MATRIZ CON EL ARREGLO ORDENADO
				cont++;
			}
		}
		System.out.println ("");
		
		System.out.println("MATRIZ ORDENADA");
		for (int []fila:matriz){
			for (int elemento:fila){
				System.out.print(elemento+" ");
			}
			System.out.println("");
		}
		
	}

}
