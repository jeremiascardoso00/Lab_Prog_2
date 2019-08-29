package TPN5;
import java.util.Scanner;
public class Facultad {
    private String nColegio;
    private int cantEstudiantes;
    private Estudiante[] estudiantes;
    private static int EstudianteActual=0;



    public Facultad(String nColegio, int cantEstudiantes){
        this.nColegio= nColegio;
        this.cantEstudiantes= cantEstudiantes;
        this.estudiantes = new Estudiante[cantEstudiantes];
    }
    public void agregarEstudiante(){
        if (EstudianteActual<=cantEstudiantes){
            Scanner p = new Scanner(System.in);
            System.out.println("ingrese el nombre");
            String nombre=p.nextLine();
            System.out.println("ingrese nota media\n");
            int notaMedia=p.nextInt();
            estudiantes[EstudianteActual]= new Estudiante(nombre,notaMedia);
            EstudianteActual++;
        }else{
            System.out.println("no hay mas cupo en la facultad");
        }
    }

    public void ListarEstudiantes(){
        for (int x=0;x<EstudianteActual;x++){
            System.out.println(estudiantes[x].getInfo());
        }
    }
    public static Estudiante BuscarAlumno(Estudiante[] alumnos, String nombre) {
		Estudiante almSalida = new Estudiante();
		for (Estudiante alumno: alumnos ) {
			if (nombre.equals(alumno.getNombre)) {
				almSalida=alumno;
				break;
			}
		}
		return almSalida;
	}
    //hacer un get del nombre para mandarlo al buscador
}
