package TFI01;

/*Una sala de cine debe contener
la capacidad de la sala, +
la película que se proyecta en la misma, +
el nombre de la sala y +
el listado de espectadores asignados a la misma. -
*/
public class Salas {

    private int capacidadSala;
    private String peliculaProyectada;
    private String nombreSala;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre, Espectadores[] espectadores){

        this.setNombreSala(nombre);
        this.setCapacidadSala(capacidad);
        this.setEspectadores(espectadores);

    }

    public void setPeliculaProyectada(String peliculaProyectada) {
        this.peliculaProyectada = peliculaProyectada;
    }

    /*Imprimir la lista de espectadores que se encuentran asignado a la sala. */
    public Espectadores[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;
    }


    /*Las Salas no deben permitir la asignación de una
    lista de Espectadores superior a su capacidad*/

    /*Se debe poder listar los espectadores de una sala,
    pero en caso de que no haya sido asignada se debe
    capturar el error emitiendo el mensaje
    "SIN ESPECTADORES CARGADOS".
    */
    @Override
    public String toString(){
        return ("tipo: " + mostrarEspectadores() + "\n\nnombre sala: " + this.getNombreSala() + "\ncapacidad sala:" + this.getCapacidadSala() + "\n" +
                "pelicula proyectada: " + this.getPeliculaProyectada());

    }

    public String mostrarEspectadores(){
        for(int x = 0; x< this.getEspectadores().length; x++){
            return getEspectadores()[x].toString();
        }
        return null;
    }


    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public String getPeliculaProyectada() {
        return peliculaProyectada;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
}
