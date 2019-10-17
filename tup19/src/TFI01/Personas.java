package TFI01;
/*El Programa debe por lo menos una clase abstracta Personas
de la cual hereden Espectadores y Empleados:

La clase Personas deberá tener por lo menos dos método abstractos:
Uno que permitirá ver si la persona es un Espectador, un Acomodador
o un Empleado dependiendo de qué clase sea.
Uno que permitirá visualizar todos los datos de la persona.
*/

public abstract class Personas {
    private String nombre;
    private int edad;



    public abstract String getTipo();

    @Override
    public abstract String toString();




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
