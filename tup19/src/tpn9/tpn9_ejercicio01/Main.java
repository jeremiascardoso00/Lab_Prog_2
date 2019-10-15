package tpn9_ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner p= new Scanner (System.in);
        int natural, respuesta;
        int primer, segundo;
        double natural1, natural2;

        System.out.println("Ingrese la cantidad de numeros que cargar");
        int cantidad = p.nextInt();
        Numeros[] array = new Numeros[cantidad];

        for (int x=0;x<array.length;x++){
            System.out.println("Numero "+(x+1)+"\n\n");
            System.out.println("Crear un numero natural o un numero complejo? 1=Natural 2=Complejo");
            int opcion=p.nextInt();
            switch (opcion){
                case 1:
                    do {
                        System.out.println("Ingrese el numero.");
                        natural = p.nextInt();
                        if (natural<0){
                            System.out.println("Los naturales deben ser positivos, ingreselo nuevamente.");
                        }
                    }while (natural < 1);
                    array[x]=new Natural(natural);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    primer=p.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    segundo=p.nextInt();
                    array[x]=new Complejo(primer,segundo);
                    break;
                default:
                    System.out.println("No ingresa una opcion valida, vuelva a ingresarla.");
                    x--;
                    break;

            }
        }
        System.out.println("Desea relizar operaciones con los numeros?" +
                "\n 1: Operaciones con numeros Naturales:" +
                "\n 2: Operaciones con numeros Complejos:");
        respuesta = p.nextInt();
        if (respuesta == 1){
            System.out.println("ingrese la opcion que desea: \n1: sumatoria de naturales\n"
                    + "2: listado de naturales\n"
                    + "3: sumar dos numeros\n"
                    + "4: restar dos numeros\n"
                    + "5: multiplicar dos numeros\n"
                    + "6. ");
            int resp1=p.nextInt();

            if (resp1==1){
                Operaciones.sumatoriaN(array);
            }else if (resp1==2){
                Operaciones.OrdenamientoN(array);
            }else if (resp1 == 3){
            	
            	Operaciones.EleccionN(array, resp1);
            	
            }else if(resp1 == 4){
            	Operaciones.EleccionN(array, resp1);
            }else if (resp1 == 5){
            	Operaciones.EleccionN(array, resp1);
            }
            



        }else if (respuesta == 2){
            System.out.println("ingrese la opcion que desea: \n1: sumatoria de complejos\n"
            		+ "2: listar numeros complejos\n"
            		+ "3: sumar dos numeros\n"
                    + "4: restar dos numeros\n"
                    + "5: multiplicar dos numeros\n"
                    + "6. ");
            	
            int resp1=p.nextInt();
            if (resp1==1){
                Operaciones.sumatoriaC(array);
            }else if (resp1 == 2){
            	Operaciones.ListarC(array);
            }else if (resp1 == 3){
            	
            	Operaciones.EleccionC(array, resp1);
            	
            }else if(resp1 == 4){
            	Operaciones.EleccionC(array, resp1);
            }else if (resp1 == 5){
            	Operaciones.EleccionC(array, resp1);
            }
            
        }else{
            System.out.println("opcion incorrecta");
        }

    }
}
    /*
        El programa pedira la cantidad de numeros a cargar. +
        Los numeros seran cargados hasta llenar el array. +
    Cada numero cargado sera un objeto dentro de un arrays de objetos. +

    Las operaciones solo podran ser realizadas entre objetos de tipo numero que fueron creados. +

    Se debe evitar el error de division por 0 devolviendo el resultado "indeterminacion".

    El usuario debe poder solicitar las siguientes operaciones.
    Que Seran realizados por una clase que reciba como parametro un array de objetos numeros:
    Suma de todos los numeros naturales. +
    Suma de todos los numeros complejos. +

    Listado de numero naturales ordenados de menor a mayor separados por una coma. +

    Listado de los numeros complejos. +

    Las operaciones sobre los objetos números deben realizarse en una interfaz implementada por cada objeto de tipo numero:
    Sumar el objeto a otro objeto +
    Restar el objeto a otro objeto +
    Multiplicar el objeto con otro objeto +
    El programa debe poder crear también números complejos, por lo que en la creación de cada objeto se debe poder crear tanto números naturales como complejos. + 
    Las operaciones de la interfaz debe poder ser aplicada a cualquier tipo de números (complejos y naturales). + 
    
    
    
    */