package TPN3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Ejercicio 01:
		Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
		El programa debe imprimir en consola todos los valores almacenados en el array.
		Utiliza un bucle for-each para leer los valores almacenados.
		(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
		BONUS: Verificar que el número no se repita.*/

        int array [] = new int [100];
        int copia[] = new int [100];
        int c=0;

        for (int x=0;x<array.length;x++ ) {
            array[x]= (int) (Math.random() * 100);

        }
        System.out.println("arreglo desordenado con numeros repetidos: ");
        for(int fila:array) {

            System.out.print(fila+" ");

        }

        for (int j=0;j<array.length;j++){
            for (int x=0; x<array.length-1;x++){
                for (int y=x+1; y<array.length;y++){
                    if(array[x] == array[y]){
                        array[y]++;
                        if (array[y]>=100){
                            array[y] = 0;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("arreglo desordenado sin ningun numero repetido: ");
        for(int fila:array) {

            System.out.print(fila+" ");

        }
        Arrays.sort(array);
        System.out.println();
        System.out.println("arreglo ordenado sin ningun numero repetido: ");
        for(int fila:array) {

            System.out.print(fila+" ");

        }
    }
}
