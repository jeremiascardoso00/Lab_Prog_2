package TFI01;
import java.util.Scanner;
public class Cine {

    public static void main(String[] args) {

	    Scanner p = new Scanner(System.in);

	    /*Cargar una espectadores pidiendo los
	    nombre,
	    edad,
	    fila y
	    silla
	    al usuario por medio de la consola.
	    En caso de que el usuario ingrese letras en
	    lugar de números donde no corresponda el programa
	    debe finalizar con el error:
	    "ERROR EN EL INGRESO DE DATOS".
        */



	    int capacidad=0, cantEspectadores, edadEspectadores;
	    String nombreEspectador, fila, silla;

        System.out.println("ingrese la cantidad de espectadores");
        cantEspectadores=p.nextInt();

        Espectadores[] espectadores = new Espectadores[cantEspectadores];

        for (int x=0; x<espectadores.length;x++){
            try{
                System.out.println("ingrese nombre del espectador");
                nombreEspectador=p.next();

                System.out.println("ingrese la edad del espectador");
                edadEspectadores=p.nextInt();

                System.out.println("ingrese la fila");
                fila=p.next();

                System.out.println("ingrese la silla");
                silla=p.next();

                espectadores[x] = new Espectadores(nombreEspectador, edadEspectadores, fila, silla);

            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
            }
        }
        /*Por medio del código crear una sala con capacidad para 3
        personas llamada “Sala 01” en donde se proyecte la película “Jocker”.
        */
        System.out.println("crear sala\n" +
                "la capacidad en este ejemplo es de 3" +
                "\n el nombre de la sala es sala 01");
        Salas sala = new Salas(3, "Sala 01", espectadores);
        sala.setPeliculaProyectada("Joker");

        System.out.println(sala.toString());


        /*Crear un acomodador por medio del código.*/

        Acomodadores acomodador = new Acomodadores("menem", 99, sala, 50000);
        System.out.println(acomodador.toString());

        /*Crear un empleado*/
        Empleados empleado = new Empleados("carlos", 56, 4000);

        System.out.println(empleado.toString());







    }
}
