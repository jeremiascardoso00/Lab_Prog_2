package tpn9_ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Ejercicio 02:
			Se plantea desarrollar un programa Java que permita simular una instalaci�n deportiva es 
			un recinto delimitado donde se practican deportes. El programa debe tener m�todos que 
			permitan como m�nimo las siguientes operaciones:
			Un m�todo que me permita saber qu� tipo de instalaci�n es. +
			Un m�todo double que muestre la superficie del edificio. +
			Ver el nombre de la instalaci�n. +
			Cantidad de oficinas de las que dispone.-
			Cantidad de canchas que posee. +
			Listar las canchas que posee e indicar el tipo de deporte que se juega en cada una. +
			Definir por lo menos dos interfaces y una clase que implemente ambas interfaces -
			para representar la situaci�n anterior. 
			En una clase con el m�todo main, crear un Array que contiene tres polideportivos y 
			dos edificios de oficinas y utilizando un iterator, recorrer la colecci�n y mostrar los 
			atributos de cada elemento.*/
		
		Scanner p = new Scanner(System.in);
		int resp1, cant=0,cantidadDePredios;
		
		System.out.println("ingrese la cantidad de predios que desea construir");
		cantidadDePredios=p.nextInt();
		Predio[] array = new Predio[cantidadDePredios];
		
		
		
		
		
		
		String nombre;
		double superficie;
		Canchas[] campos = null;
		
		//esto no funciona porque no tengo idea de como hacer para que me deje utilizar el objeto "campos" mas adelante en el listado
		for (int i = 0; i < array.length; i++){
			System.out.println("elija la opcion que desea:\n"
					+ "1: crear polideportivo\n"
					+ "2: crear edificio de oficinas");
			resp1 = p.nextInt();
			if (resp1 == 1){
				System.out.println("ingrese el nombre del predio: ");
				nombre = p.next();
				System.out.println("ingrese la superficie del predio: ");
				superficie = p.nextDouble();
				System.out.println("ingrese la cantidad de canchas: ");
				cant = p.nextInt();
				
				campos = new Canchas[cant];
				
				array[i] = new Polideportivo(nombre, superficie, cant, campos);
			}else if (resp1 == 2){
				System.out.println("ingrese el nombre del predio: ");
				nombre = p.next();
				System.out.println("ingrese la superficie del predio: ");
				superficie = p.nextDouble();
				System.out.println("ingrese la cantidad de oficinas: ");
				cant = p.nextInt();
				array[i] = new EdificioOficinas(nombre, superficie, cant);
			}else{
				System.out.println("respuesta incorrecta");
				i--;
			}
		}
		
		System.out.println("listar los predios con sus canchas y oficinas\n");
		
		for (int x=0; x<array.length; x++){
            if (array[x].getTipo().equals("Polideportivo") ){
            	System.out.println("\n\n" + array[x].getTipo()+" " + ((Polideportivo)array[x]).getNombre());
            	System.out.println();
            	System.out.println("la superficie es: " + array[x].getSuperficie());
            	System.out.println("cantidad de canchas: " + array[x].getCantidad());
                for (int i = 0; i < array[x].getCantidad(); i++){
                	System.out.println((i+1) + ": " + campos[i].getTipo()+ "\n");
                }
            }else if(array[x].getTipo().equals("EdificioOficinas") ){
            	System.out.println("\n\n" + array[x].getTipo()+" " + ((EdificioOficinas)array[x]).getNombre());
            	System.out.println();
            	System.out.println("la superficie es: " + array[x].getSuperficie());
            	System.out.println("cantidad de oficinas: " + array[x].getCantidad() + "\n");
            }	
		}	
		
	}
}
