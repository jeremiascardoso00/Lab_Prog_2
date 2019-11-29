package TFI02;

public class Estudiante extends Persona {

    private String nombre;
    private String apellido;

    public Estudiante(String nombre, String apellido, int legajo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);

    }

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
    }
}
