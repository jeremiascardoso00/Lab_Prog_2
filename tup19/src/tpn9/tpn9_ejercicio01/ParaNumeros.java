package tpn9_ejercicio01;

/*Las operaciones sobre los objetos números deben realizarse
en una interfaz implementada por cada objeto de tipo número:
    Sumar el objeto a otro objeto
    Restar el objeto a otro objeto
    Multiplicar el objeto con otro objeto*/

public interface ParaNumeros {
    void Suma (double n1, double n2, double n3, double n4);
    void Resta (double n1, double n2, double n3, double n4);
    void Multiplicacion (double n1, double n2, double n3, double n4);
}