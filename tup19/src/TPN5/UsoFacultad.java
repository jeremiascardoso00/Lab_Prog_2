package TPN5;

import java.util.Scanner;

public class UsoFacultad {

    public static void main(String[] args) {
        //Puma (Perez felipe, Cardoso Jeremias, Rousseau Andres)
        Scanner sc=new Scanner(System.in);
        char respuesta;
        String estudianteABuscar;
        char terminar;
        double nota;
        
        System.out.println("Ingrese el nombre de la facultad para crearla.");
        String nomFac=sc.next();
        System.out.println("Ingrese la cantidad de estudiantes maxima de esta.");
        int cantMax=sc.nextInt();

        Facultad facultad= new Facultad(nomFac,cantMax);
        
        System.out.println("Se procedera al cargado de estudiantes: ");
        do{
            facultad.agregarEstudiante();
            System.out.println("Desea seguir agregando estudiantes? s/n");
            respuesta=sc.next().charAt(0);
        }while(respuesta!='n' && respuesta!='N');
        
        do {
        	System.out.println("Que desea realizar?\n1_Listar Estudiantes\n2_Buscar Estudiante \n3_Borrar estudiante\n4_Agregar estudiante\n5_Modificar la nota media del estudiante");

        	int opcion=sc.nextInt();
        	switch (opcion) {
        	case 1:
        		facultad.listarEstudiantes();
        		break;
        	case 2:
        		System.out.println("Ingrese el nombre del estudiante que desea buscar: ");
    	        estudianteABuscar=sc.next();
    	        facultad.buscarEstudiante(estudianteABuscar);
    	        break;
        	case 3:
        		System.out.println("Ingrese el nombre del estudiante que desea borrar: ");
    	        estudianteABuscar=sc.next();
    	        facultad.borrarEstudiante(estudianteABuscar);
    	        break;
        	case 4:
        		facultad.agregarEstudiante();
        		break;
        	case 5:
        		System.out.println("Ingrese el nombre del estudiante");
        		estudianteABuscar=sc.next();
        		System.out.println("Ingrese la nueva nota media");
        		nota=sc.nextDouble();
        		facultad.modificarNota(estudianteABuscar,nota);
        		
        		break;
    	   default :
    	        System.out.println("La opcion no es correcta.");
        	}
	        
	        
	        System.out.println("Desea seguir operando? s/n");
	        terminar=sc.next().charAt(0);
        }while(terminar!='n' && terminar!='N');
    }
}