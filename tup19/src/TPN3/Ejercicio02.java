package TPN3;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*Ejercicio 02:
		Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math. 

		Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola. */
		
		int matriz[][] = new int [3][3];
		
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz.length; y++) {
				matriz[x][y] = (int)(Math.random()*100);
				
			}
		}
		for (int x=0; x<matriz.length; x++) {
			System.out.print("|");
			for (int y=0; y<matriz.length; y++) {
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println("|");
		}
	}
}
