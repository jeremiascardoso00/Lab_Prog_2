package tpn9_ejercicio01;

/*Las operaciones sobre los objetos números deben realizarse
en una interfaz implementada por cada objeto de tipo número:
    Sumar el objeto a otro objeto
    Restar el objeto a otro objeto
    Multiplicar el objeto con otro objeto*/

public interface ParaNumeros {
    void Suma (int n1, int n2, int n3, int n4);
    void Resta (int n1, int n2, int n3, int n4);
    void Multiplicacion (int n1, int n2, int n3, int n4);
}