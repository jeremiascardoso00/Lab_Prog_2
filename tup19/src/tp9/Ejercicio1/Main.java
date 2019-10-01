package tp9.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int natural;
        double primer;
        double segundo;

        System.out.println("Ingrese la cantidad de números que cargará");
        int cantidad = sc.nextInt();
        Numeros[] array = new Numeros[cantidad];

        for (int x=0;x<array.length;x++){
            System.out.println("Número "+(x+1)+"\n\n");
            System.out.println("¿Creará un número natural o un número complejo? 1=Natural 2=Complejo");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    do {
                        System.out.println("Ingrese el número.");
                        natural = sc.nextInt();
                        if (natural<0){
                            System.out.println("Los naturales deben ser positivos, ingreselo nuevamente.");
                        }
                    }while (natural < 1);
                    array[x]=new Natural(natural);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número");
                    primer=sc.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    segundo=sc.nextDouble();
                    array[x]=new Complejo(primer,segundo);
                    break;
                default:
                    System.out.println("No ingresó una opción válida, vuelva a ingresarla.");
                    x--;
                    break;

            }
        }

    }
}
    /*
        El programa pedirá la cantidad de números a cargar. Los números serán cargados hasta llenar el array.
    Cada número cargado será un objeto dentro de un arrays de objetos.
    Las operaciones sólo podrán ser realizadas entre objetos de tipo número que fueron creados.
    Se debe evitar el error de división por 0 devolviendo el resultado “indeterminación”.
    El usuario debe poder solicitar las siguientes operaciones. Que Serán realizados por una clase que reciba como parámetro un array de objetos números:
    Suma de todos los números naturales.
    Suma de todos los números complejos.
    Listado de número naturales ordenados de menor a mayor separados por una coma.
    Listado de los números complejos.
    Las operaciones sobre los objetos números deben realizarse en una interfaz implementada por cada objeto de tipo número:
    Sumar el objeto a otro objeto
    Restar el objeto a otro objeto
    Multiplicar el objeto con otro objeto
    El programa debe poder crear también números complejos, por lo que en la creación de cada objeto se debe poder crear tanto números naturales como complejos.
    Las operaciones de la interfaz debe poder ser aplicada a cualquier tipo de números (complejos y naturales).

    */