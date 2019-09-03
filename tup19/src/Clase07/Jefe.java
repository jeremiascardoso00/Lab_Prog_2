package Clase07;

public class Jefe extends Empleado{
    private double bonus;
    public Jefe(String nombre,double sueldo){
        super(nombre, sueldo);

    }
    public double getSueldo(){
        return super.getSueldo()+this.bonus;
    }
}
