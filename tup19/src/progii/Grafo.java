package progii;

import java.awt.List;
import java.util.Iterator;

import progii.lista.ListaSimple;

public class Grafo {

    private String[] vertices;
    private String[][] aristas;
    private int[][] matriz;
    private int[] vector;

    // Construir grafo
    public void construir(String[] vertices, String[][] aristas){

        this.setVertices(vertices);
        this.setAristas(aristas);
        
        

        this.vector =  new int [vertices.length];
        
        this.setMatriz(new int[vertices.length][vertices.length]);
        

        // Inicializar grafo
        for (int i = 0; i < vertices.length; i++) {
        	this.getVector()[i]=0;
            // columnas
            for (int j = 0; j < vertices.length; j++) {
                this.getMatriz()[i][j] = 0;
                
            }
        }
        

        // cargar grafo
        for (int i = 0; i < aristas.length; i++) {
        	
        	

            String vertice1 = aristas[i][0];
            String vertice2 = aristas[i][1];
            
            System.out.print(vertice1);
            System.out.println(vertice2);
            System.out.println();

            int iVertice1 = buscarVertice(vertice1);
            int iVertice2 = buscarVertice(vertice2);
           
            if (vector[iVertice1] < 2 && vector[iVertice2] < 2){
            	getMatriz()[iVertice1][iVertice2] = 1;
                getMatriz()[iVertice2][iVertice1] = 1;
                vector[iVertice1]++;
                vector[iVertice2]++;
                System.out.println();
                System.out.print(vector[iVertice1]);
                System.out.println( vector[iVertice2]);
            }
          	
            	
            
            //System.out.println("error en arista " + vertice1 + vertice2 +" no se pueden cargar mas de 2 conexiones por nodo");
            
            
    }
    }
    
    public void nodosAdyacentesTODOS(){
    	for (int i = 0; i<getVertices().length; i++){
        	
        	System.out.println("\nNodos adyacentes a " + getVertices()[i] + " son: ");
        	this.vecinos(getVertices()[i]).imprimir();
        	System.out.println();
        	
        }
    	
    }

    // Nuevas conexiones
    public String conectar(String vertice1, String vertice2){
    	for (int i = 0; i<this.getVertices().length; i++){
    		
    		//System.out.println("conectar nodo " + vertice1 + " y nodo " + vertice2);
			int iVertice1 = buscarVertice(vertice1);
			int iVertice2 = buscarVertice(vertice2);

			if (vector[iVertice1] < 2 && vector[iVertice2] < 2){
            	getMatriz()[iVertice1][iVertice2] = 1;
                getMatriz()[iVertice2][iVertice1] = 1;
                vector[iVertice1]++;
                vector[iVertice2]++;
                System.out.println();
                System.out.print(vector[iVertice1]);
                System.out.println( vector[iVertice2]);
             
	            
	           return("conectar nodo " + vertice1 + " y nodo " + vertice2);
			}else{
	            
	        	return("error en arista " + vertice1 + vertice2 +" no se pueden cargar mas de 2 conexiones por nodo");
	        	
	        }
    	} 
    	return null;
    }

    // Nuevas conexiones con Ponderacion
    public String conectar(String vertice1, String vertice2, int ponderacion) {
    	
    	for (int i = 0; i<this.getVertices().length; i++){
	        int iVertice1 = buscarVertice(vertice1);
	        int iVertice2 = buscarVertice(vertice2);

	        if (vector[iVertice1] < 2 && vector[iVertice2] < 2){
	        	getMatriz()[iVertice1][iVertice2] = ponderacion;
		        getMatriz()[iVertice2][iVertice1] = ponderacion;
                vector[iVertice1]++;
                vector[iVertice2]++;
                System.out.println();
                System.out.print(vector[iVertice1]);
                System.out.println( vector[iVertice2]);
	            return ("Conectar nodo "+ vertice1 +" y nodo "+ vertice2 + " con ponderacion " + ponderacion);
	        }else{
	            return("error en arista " + vertice1 + vertice2 +" no se pueden cargar mas de 2 conexiones por nodo");
	        	
	        }
    		
    	}
		return null;
    	
    }

    // Recorrer matriz
    public void imprimir() {

        for (int i = 0; i < this.getVertices().length; i++) {
            // columnas
            for (int j = 0; j < this.getVertices().length; j++) {
                System.out.print(this.getMatriz()[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Vecinos
    public ListaSimple vecinos(String vertice){
        // creo una TAD Lista para guardar
        // nodos vecinos al argumento 'vertice'
        ListaSimple nodosVecinos = new ListaSimple();

        // Obtengo la posicion de la matriz
        // del argumento 'vertice'
        int iVertice = buscarVertice(vertice);

        // Recorro las filas de la columna
        // del vertice hasta encontrar un valor
        // mayor a 0.
        for (int i = 0; i < getVertices().length; i++) {

            // Obtengo el nombre del nodo
            // que corresponde a la posicion de
            // la columna del vertice
            int valor = getMatriz()[iVertice][i];

            // Si el valor es mayor a cero,
            // lo agrego a la TAD Lista.
            if (valor > 0){
                String nodo = this.getVertices()[i];
                nodosVecinos.agregar(nodo);
            }
        }

        // Retorno la lista de vecinos del
        // argumento 'vertice'
        return nodosVecinos;
    }

    // Buscar
    public void buscar(String vertice){

    }

    // Insertar Nuevo
    public void insertar(String vertice) {

    }

    // Eliminar
    public String eliminar(String vertice1, String vertice2){
    	boolean resp = true;
    	
    	for (int j =0; j<this.getVertices().length; j++){
    		if (vertice1 == this.getVertices()[j]){
    			for (int k = 0; k<this.getVertices().length; k++){
    				if (vertice2 == this.getVertices()[k]){
	    				resp = true;
	    				break;
	    			}else {
	    				resp = false;
	    			}
    			}
    			break;
    		}else {
    			resp = false;
    		}	
    	}
    	if (resp == true){
    		
    		for (int i = 0; i<this.getVertices().length; i++){
    		
	    		int iVertice1 = buscarVertice(vertice1);
				int iVertice2 = buscarVertice(vertice2);
				
				this.getMatriz()[iVertice1][iVertice2] = 0;
				this.getMatriz()[iVertice2][iVertice1] = 0;
				this.vector[iVertice1]--;
				this.vector[iVertice2]--;
			
    		}
    		return ("eliminar la conexion del nodo " + vertice1 + " y nodo " + vertice2);
    	}else if (resp == false){
    		return("[ERROR] Alguno de los nodos insertados no se encuentra entre los vertices");
    	}else{
    		return null;
    	}
		
    		
    	
    	
    	

    }

    // Recorrer
    public void recorrer(String vertice1, String vertice2){

    }

    private int buscarVertice(String vertice) {
        for (int i = 0; i < this.getVertices().length; i++) {
            if (this.getVertices()[i].equals(vertice)) {
                return i;
            }
        }

        return -1;
    }

	private int[][] getMatriz() {
		return matriz;
	}

	private void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	private String[] getVertices() {
		return vertices;
	}

	private void setVertices(String[] vertices) {
		this.vertices = vertices;
	}

	private String[][] getAristas() {
		return aristas;
	}

	private void setAristas(String[][] aristas) {
		this.aristas = aristas;
	}

	private int[] getVector() {
		return vector;
	}

	private void setVector(int[] vector) {
		this.vector = vector;
	}

	

}
