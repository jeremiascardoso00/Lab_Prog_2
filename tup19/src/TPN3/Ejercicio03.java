package TPN3;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		/*Ejercicio03: 
		Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas. 

		Los datos para rellenar la matriz deben ser proporcionados por el usuario. 

		Una vez que se llene todo el arreglo de arreglos se debe mostrar la información en la consola de una forma clara.
	    matriz[0][0]="NOMBRE";
		
		matriz[1][0]="DNI";
		
		matriz[2][0]="EDAD";
		
		BONUS: ordenar alfabéticamente el arreglo.*/
		
		String matriz[][] = new String [3][3];

	
		Scanner p= new Scanner(System.in);
		
		
		
		for (int x=0; x<matriz.length; x++) {
			
				int c=0;
				System.out.println("Ingrese el nombre");
				matriz[c][x]=p.nextLine();
				c++;
				System.out.println("Ingrese el DNI");
				matriz[c][x]=p.nextLine();
				c++;
				System.out.println("Ingrese la edad");
				matriz[c][x]=p.nextLine();
				
				
		}
		
		for (int x=0;x<3;x++) {
					
			for (int y=0;y<3;y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
