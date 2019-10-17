package TFI01;

public class Acomodadores extends Empleados{

    private Salas sala;
    private String nombre;
    private int edad;
    private double sueldo;

    public Acomodadores(String nombre, int edad, Salas salas, double sueldo){
        super(nombre, edad, sueldo);
        this.setSala(salas);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSueldo(sueldo);

    }


    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String getTipo(){
        return  "acomodador";
    }

    @Override
    public String toString(){

        return ("tipo: " + this.getTipo() + "\nnombre: " +this.getNombre() +"\nedad :"+ this.getEdad() +"\nsala: " + this.sala.getNombreSala() + "\nsueldo: " + this.getSueldo());
    }

    public Salas getSala() {
        return sala;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
