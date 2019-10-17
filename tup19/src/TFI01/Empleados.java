package TFI01;

public class Empleados extends Personas {

    private double sueldo;
    private String nombre;
    private int edad;

    public Empleados(){

    }
    public Empleados(String nombre, int edad, double sueldo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSueldo(sueldo);

    }








    @Override
    public String getTipo() {
        return "acomodador";
    }

    @Override
    public String toString() {

        return ("tipo: " + getTipo() + "\nnombre: " + this.getNombre() + "\nedad: " + this.getEdad() + "\nsueldo: " + this.getSueldo());
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
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
}
