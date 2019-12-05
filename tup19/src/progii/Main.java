package progii;

import java.util.Scanner;

import progii.lista.ListaSimple;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String[] vertices = { "A", "B", "C", "D", "E", "F"};
        String[][] aristas =
                {
                    {"A", "B"},
                    {"A", "F"},
                    {"B", "C"},
                    {"C", "D"},
                    {"D", "E"}, 
                };

        String vertice = null;
        String vertice1 = null;
        String vertice2 = null;
        int ponderacion = 0;
        
        Scanner p = new Scanner(System.in);

        // Inicializarlo
        Grafo g = new Grafo();
        g.construir(vertices, aristas);
        
        //Incluir un método que permita imprimir por pantalla 
        //la representación del Grafo y sus conexiones.
        g.imprimir();
        System.out.println();

        // Nuevas conexiones
        
        System.out.print(g.conectar("A", "C"));

        // Nuevas conexiones con Ponderacion
        
        //g.conectar("F", "B", 2);
        
        //método que retorne todos los nodos adyacentes
        g.nodosAdyacentesTODOS();
        
      //Incluir un método que retorne todos los nodos adyacentes a un vértice dado.
        
        /*System.out.println("Ingrese un vertice para mostrar sus vecinos");
        String verti = p.next();
        g.vecinos(verti).imprimir();*/

        // Obtener los nodos vecinos de un vertice
        /*ListaSimple vecinos = g.vecinos("B");
        vecinos.imprimir();*/

        // Buscar
        g.buscar(vertice);

        // Insertar Nuevo
        g.insertar(vertice);

        // Eliminar
        System.out.println(g.eliminar("A", "B"));
        
      //Incluir un método que permita imprimir por pantalla 
        //la representación del Grafo y sus conexiones.
        g.imprimir();
        

        // Recorrer
        g.recorrer(vertice1, vertice2);
        
    }
}
