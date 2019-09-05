package TPN5;

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
        if (EstudianteActual<cantEstudiantes){
            System.out.println("Ingrese el nombre del estudiante");
            String nombre=sc.next();
            System.out.println("Ingrese nota media del estudiante");
            Double nota=sc.nextDouble();
            estudiantes[EstudianteActual]=new Estudiante(nombre,nota);
            EstudianteActual++;
        }
        else{
            System.out.println("No hay mas cupo en la facultad.");
        }
    }
    public void listarEstudiantes(){
        for (int x=0;x<EstudianteActual;x++){
            System.out.println(estudiantes[x].getInfo());
        }
        System.out.println();
    }
    
    public void buscarEstudiante (String nomEstudiante) {
    	for (int x=0;x<EstudianteActual;x++) {
    		if ((estudiantes[x].getNomEstudiante()).equals (nomEstudiante)) {
    			System.out.println(estudiantes[x].getInfo());
    			return;
    		}
    	}
    	System.out.println("No se encontro el estudiante solicitado");
    }
    
    public void borrarEstudiante (String nomEstudiante) {
    	int comp=0;
    	for (int x=0;x<EstudianteActual;x++) {
    		if ((estudiantes[x].getNomEstudiante()).equals (nomEstudiante)) {
    			for (int y=x;y<EstudianteActual-1;y++) {
    				estudiantes[y]=estudiantes[y+1];
    			}
    			EstudianteActual--;
    			comp=1;
    		}
    	}
    	if (comp!=1){
    		System.out.println("No se encontro el estudiante solicitado");
    	}
    	
    }
    
    public void modificarNota (String nomEstudiante, double nota) {
    	for (int x=0;x<EstudianteActual;x++) {
    		if ((estudiantes[x].getNomEstudiante()).equals (nomEstudiante)) {
    			estudiantes[x].setNotaMedia(nota);
                System.out.println(estudiantes[x].getInfo());
    			return;
    		}
    	}
    	System.out.println("No se encontro el estudiante solicitado");
    }
    
    

}