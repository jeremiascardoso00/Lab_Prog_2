package depur.com;

public class MiObjeto {
    private String nombre;
    private boolean existe;

    public MiObjeto() {

    }

    public MiObjeto(String nombre, boolean existe) {
        this.nombre=nombre;
        this.existe=existe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }


}