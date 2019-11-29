package TFI02;
import java.util.*;

public class Facultad implements Informacion{

    private String nombre;

    public Facultad(String nombre){
        this.setNombre(nombre);
    }

    TreeSet<Carrera> ordenarCarreras = new TreeSet<Carrera>();

    Iterator<Carrera> iterador = ordenarCarreras.iterator();



    public void agregarCarrera(Carrera carreras){
        ordenarCarreras.add(carreras);
    }

    public void eliminarCarrera(String nombre){

        while(iterador.hasNext()){

            String elementoEliminar = iterador.next().getNombre();
                if (elementoEliminar.equals(nombre)){
                        iterador.remove();
                    }
        }
    }

    public void eliminarEstudiante(Estudiante estudiante){

        for (Carrera carrera : ordenarCarreras) {
            for (Materia materias : carrera.ordenarMaterias){
                while(materias.iterador.hasNext()){
                    if (materias.iterador.equals(estudiante)){
                        materias.iterador.remove();
                    }
                }

            }
        }


    }
    public void setNombre(String nombre) {
        this.nombre = this.nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facultad facultad = (Facultad) o;

        if (nombre != null ? !nombre.equals(facultad.nombre) : facultad.nombre != null) return false;
        if (ordenarCarreras != null ? !ordenarCarreras.equals(facultad.ordenarCarreras) : facultad.ordenarCarreras != null)
            return false;
        return iterador != null ? iterador.equals(facultad.iterador) : facultad.iterador == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (ordenarCarreras != null ? ordenarCarreras.hashCode() : 0);
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
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", ordenarCarreras=" + ordenarCarreras +
                ", iterador=" + iterador +
                '}';
    }

    @Override
    public void listarContenidos() {
        for (Carrera carrera : ordenarCarreras) {
            System.out.println(carrera.toString());
        }
    }

}
