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
		String auxiliar[] = new String [3];

		int x=0,c=0,y=0;
		Scanner p = new Scanner(System.in);
		
		
		
		for (x=0; x<matriz.length; x++) {
			
				c=0;
				System.out.println("Ingrese el nombre");
				matriz[c][x]=p.nextLine();
				
				c++;
				System.out.println("Ingrese el DNI");
				matriz[c][x]=p.nextLine()+"	";
				
				c++;
				System.out.println("Ingrese la edad");
				matriz[c][x]=p.nextLine()+"		";
				
				
		}
		//agregar otra estructura repetitiva de 3.
		c=0;
		for (int j=0;j<matriz.length;j++){
			for (x=0 ; x <matriz.length ;x++){
				for (y=0; y<matriz.length;y++){
					if (y==0 && x!=2 ){
						if (matriz[y][x].compareTo(matriz[y][x+1])>0){
							for (int i=0 ;i<matriz.length ;i++){
								auxiliar[i]=matriz[i][x+1];
								matriz[i][x+1]=matriz[i][x];
								matriz[i][x]=auxiliar[i];
							}
						}
					}
					
				}
				
			}
		}
		
		
		for(String[] fila:matriz) {
			for(String elemento:fila) {
				System.out.print(elemento+" ");
			}
			System.out.println("");
			}
		
	}

}
