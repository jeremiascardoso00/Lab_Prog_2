package TrabajoEnClase7;

import java.util.Scanner;

public class Facultad {

    private String nColegio;
    private int cantEstudiantes;
    private Estudiante[] estudiantes;
    private static int EstudianteActual=0;

    public Facultad(String nColegio, int cantEstudiantes){
        this.nColegio=nColegio;
        this.cantEstudiantes=cantEstudiantes;
        this.estudiantes=new Estudiante[cantEstudiantes];

    }

    public void agregarEstudiante(){
        Scanner sc=new Scanner(System.in);
        if (EstudianteActual<=cantEstudiantes){
            System.out.println("Ingrese el nombre del estudiante");
            String nombre=sc.next();
            System.out.println("Ingrese nota media del estudiante");
            Double nota=sc.nextDouble();
            estudiantes[EstudianteActual]=new Estudiante(nombre,nota);
            EstudianteActual++;
        }
        else{
            System.out.println("No hay más cupo en la facultad.");
        }
    }
    public void listarEstudiantes(){
        for (int x=0;x<EstudianteActual;x++){
            System.out.println(estudiantes[x].getInfo());
        }
        System.out.println();
    }

}
