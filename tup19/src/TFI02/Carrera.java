package TFI02;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

public class Carrera implements Informacion{




    private String nombre;

    public Carrera(String nombre){
        this.nombre = nombre;
    }


    TreeSet<Materia> ordenarMaterias = new TreeSet<Materia>();

    Iterator<Materia> iterador = ordenarMaterias.iterator();

    public void agregarMaterias(Materia materias){
        ordenarMaterias.add(materias);
    }

    public void eliminarMaterias(String nombre){

        while(iterador.hasNext()){

            String elementoEliminar = iterador.next().getNombre();
            if (elementoEliminar.equals(nombre)){
                iterador.remove();
            }
        }
    }
    /*Encontrar materias de una carrera en particular indicando
    el nombre de la materia. Si la materia existe nos deberá
    preguntar si deseamos eliminar.*/

    public void buscarMaterias(String nombre){

        Scanner pant = new Scanner(System.in);
        for(Materia materias : ordenarMaterias){
            if(materias.getNombre().equals(nombre)){
                System.out.println("elemento encontrado, desea eliminarlo? 1:si 2:no");
                int resp=pant.nextInt();
                try{
                    if (resp == 1){
                        System.out.println("ingrese el nombre de la materia que quiere eliminar");
                        String materiasAEliminar=pant.next();
                        this.eliminarMaterias(materiasAEliminar);
                    }else if(resp == 2){
                        return;
                    }else{
                        System.out.println("opcion incorrecta");
                    }
                }catch(Exception e){
                    System.out.print("SE HA PRODUCIDO UN ERROR");

                }

            }
        }

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

        Carrera carrera = (Carrera) o;

        if (nombre != null ? !nombre.equals(carrera.nombre) : carrera.nombre != null) return false;
        return ordenarMaterias != null ? ordenarMaterias.equals(carrera.ordenarMaterias) : carrera.ordenarMaterias == null;
    }


    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (ordenarMaterias != null ? ordenarMaterias.hashCode() : 0);
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
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", ordenarMaterias=" + ordenarMaterias +
                ", iterador=" + iterador +
                '}';
    }

    @Override
    public void listarContenidos() {
        for (Materia materias : ordenarMaterias) {
            System.out.println(materias.toString());
        }
    }

}
