package Clase07;

public class Empresa {

    public static void main(String[] args) {
	// write your code here
        Empleado[] Empleados = new Empleado[5];
        Empleados[0] = new Empleado ("Juan",40000);
        Empleados[1] = new Empleado ("Matis",40000);
        Empleados[2] = new Empleado ("Anabela",40000);
        Empleados[3] = new Empleado ("Graciela",40000);

        Empleados[4] = new Empleado ("Yamil",45000);
        for(Empleado empleado:Empleados){
            System.out.println(empleado.getDatos()+ "\n SUELDO: "+empleado.getSueldo());
        }
    }
}
