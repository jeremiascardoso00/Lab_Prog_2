package TrabajoEnClase7;

import java.util.Scanner;

public class UsoFacultad {

    public static void main(String[] args) {
        //Puma (Perez felipe, Cardoso Jeremias, Rousseau Andres)
        Scanner sc=new Scanner(System.in);
        char respuesta;
        System.out.println("Ingrese el nombre de la facultad para crearla.");
        String nomFac=sc.next();
        System.out.println("Ingrese la cantidad de estudiantes máxima de esta.");
        int cantMax=sc.nextInt();

        Facultad facultad= new Facultad(nomFac,cantMax);
        System.out.println("Se procederá al cargado de estudiantes: ");
        do{
            facultad.agregarEstudiante();
            System.out.println("Desea seguir agregando estudiantes? s/n");
            respuesta=sc.next().charAt(0);
        }while(respuesta!='n' && respuesta!='N');
        facultad.listarEstudiantes();
    }
}
