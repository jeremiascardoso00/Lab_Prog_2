package TFI02;

import java.util.Iterator;
import java.util.TreeSet;


public class Materia implements Informacion{

    private String nombre;
    private Profesor titular;

    public Materia(String nombre, Profesor titular){

        this.setNombre(nombre);
        this.setTitular(titular);
    }

    TreeSet<Estudiante> ordenarEstudiante = new TreeSet<Estudiante>();

    Iterator<Estudiante> iterador = ordenarEstudiante.iterator();

    public void agregarEstudiante(Estudiante estudiante){
        ordenarEstudiante.add(estudiante);
    }

    public void eliminarEstudiante(String nombre){

        while(iterador.hasNext()){

            String elementoEliminar = iterador.next().getNombre();
            if (elementoEliminar.equals(nombre)){
                iterador.remove();
            }
        }
    }
    public void modificarTitular(Profesor profesor){

        this.setTitular(profesor);

    }


    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materia materia = (Materia) o;

        if (nombre != null ? !nombre.equals(materia.nombre) : materia.nombre != null) return false;
        if (ordenarEstudiante != null ? !ordenarEstudiante.equals(materia.ordenarEstudiante) : materia.ordenarEstudiante != null)
            return false;
        return iterador != null ? iterador.equals(materia.iterador) : materia.iterador == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (ordenarEstudiante != null ? ordenarEstudiante.hashCode() : 0);
        result = 31 * result + (iterador != null ? iterador.hashCode() : 0);
        return result;
    }

    @Override
    public int verCantidad() {
        int contador=0;
        while(iterador.hasNext()){
            contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", ordenarEstudiante=" + ordenarEstudiante +
                ", iterador=" + iterador +
                '}';
    }

    @Override
    public void listarContenidos() {
        for (Estudiante estudiante : ordenarEstudiante) {
            System.out.println(estudiante.toString());
        }
    }
}
