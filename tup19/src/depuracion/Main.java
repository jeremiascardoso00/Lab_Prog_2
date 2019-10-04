package depur.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos a crear");
        int rep=sc.nextInt();
        MiObjeto [] arreglo=new MiObjeto[rep];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese nombre: ");
            String nombre=sc.next();
            System.out.println("Ingrese numero: 0 o 1");
            boolean verdad=false;
            if (sc.nextInt()==1) {
                verdad=true;
            }
            MiObjeto nuevoObjeto=new MiObjeto(nombre,verdad);
            arreglo[i]=nuevoObjeto;
        }

        System.out.println("Acontinuacion se mostraran los valores de los objetos: ");
        for (MiObjeto objeto : arreglo) {
            System.out.println(objeto.getNombre());
            System.out.println(objeto.isExiste());
        }

        System.out.println("Ingrese nombre para modificar nombre del ultimo objeto de la lista: ");
        arreglo[rep-1].setNombre(sc.next());
        System.out.println("Ultimo objeto: "+arreglo[rep-1].getNombre());
    }

}
