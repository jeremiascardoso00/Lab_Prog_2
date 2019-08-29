package TPN5;
import java.util.Scanner;
public class UsoFacultad {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        char resp;

        System.out.println("Ingrese el nombre de la facultad");
        String facultad = p.next();
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantEstudiantes = p.nextInt();
        Facultad facultad1 = new Facultad(facultad, cantEstudiantes);
        do{
            facultad1.agregarEstudiante();
            System.out.println("desea seguir agregando estudiantes? s/n");
            resp=p.next().charAt(0);
        }while(resp !='n');
        facultad1.ListarEstudiantes();
    }
}
