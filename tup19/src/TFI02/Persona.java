package TFI02;

public abstract class Persona {


    private String nombre;
    private String apellido;
    private int legajo;

    public void modificarDatos(String nombre, String apellido, int legajo){

    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
