package TFI01;

public class Espectadores extends Personas{

    private String nombre;
    private int edad;

    private String fila;
    private String silla;

    public Espectadores(String nombre,int edad, String fila, String silla){
        this.setNombre(nombre);

        this.setEdad(edad);
        this.setFila(fila);
        this.setSilla(silla);
    }

    public String getButaca(){
        return (this.getFila() + this.getSilla());
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {

        return (getTipo() + "\nnombre: " + this.getNombre() +"\n edad "+ this.getEdad() + "\nbutaca numero: " + this.getButaca());

    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }
}
