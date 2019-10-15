package tpn9_ejercicio01;
import java.util.Scanner;
/*El usuario debe poder solicitar las siguientes operaciones.
        Que Seran realizados por una clase que reciba como parámetro un array de objetos numeros:
        Suma de todos los numeros naturales.
        Suma de todos los numeros complejos.
        Listado de numero naturales ordenados de menor a mayor separados por una coma.
        Listado de los numeros complejos.*/
public class Operaciones{
	
	static Scanner p = new Scanner(System.in);


    public static void sumatoriaN(Numeros[] array){
        int acumulador=0;
        for (int x=0; x<array.length; x++){
            if (array[x].getTipo() == "Natural"){
                acumulador += array[x].getValor1();
            }
        }
        System.out.println("sumatoria naturales: " + acumulador);
    }

    public static void sumatoriaC(Numeros[] array){
        int acumulador1=0, acumulador2=0;
        for (int x=0; x<array.length; x++){
            if (array[x].getTipo() == "Complejo"){
                acumulador1 += array[x].getValor1();
                acumulador2 += array[x].getValor2();
            }
        }
        System.out.println("sumatoria complejos: " + acumulador1 + ", " + acumulador2);
    }

    public static void OrdenamientoN(Numeros[] array){
        double aux =0;
        int contador=0, a=0;
        boolean correc = false;

        for (int x=0;x<array.length;x++){
            if (array[x].getTipo() == "Natural"){
                contador++;
            }
        }
        
        double arreglo[] = new double[contador];
        for (int x=0;x<array.length;x++){
            if (array[x].getTipo() == "Natural"){
                arreglo[a] = ((Natural)array[x]).getValor();//downcast.: imprimis usando un metodo de natural utilizando un array de tipo numero
                a++;
            }
        }
        
        while(correc == false){
            correc = true;
            for (int x=0;x<arreglo.length-1;x++){
                if (arreglo[x] > arreglo[x+1]){
                    aux= arreglo[x+1];
                    arreglo[x+1] = arreglo[x];
                    arreglo[x] = aux;
                    correc = false;
                }
            }
        }

        for(int x=0;x<arreglo.length;x++){
            if(x+1 == arreglo.length){
                System.out.println(arreglo[x]);
            }else{
                System.out.print(arreglo[x] + ", ");
            }

        }
    }

    public static void ListarC(Numeros[] arreglo){
    	for (int x=0; x<arreglo.length; x++){
            if (arreglo[x].getTipo() == "Complejo"){
            	System.out.println(arreglo[x].getValor1() + ", " + arreglo[x].getValor2());
            }
        }
    }
    
    public static void EleccionN(Numeros[] array, int eleccion){
        
        for (int x=0;x<array.length;x++){
            if (array[x].getTipo() == "Natural"){
            	
                System.out.print(((Natural)array[x]).getIdNumero() + "_");//downcast.: imprimis usando un metodo de natural utilizando un array de tipo numero
                System.out.println(((Natural)array[x]).getValor());         
            }
        }
        int i=0;
        System.out.println("elija el id del primer numero con el que desea operar");
    	int natural1 = p.nextInt();
    	System.out.println("elija el id del segundo numero con el que desea operar");
    	int natural2 = p.nextInt();
    	
    	for (int x=0;x<array.length;x++){
            if (array[x].getTipo() == "Natural"){
            	if (natural1 == ((Natural)array[x]).getIdNumero()){
            		for (int y=0;y<array.length;y++){
            			if (array[y].getTipo() == "Natural"){
            				if (natural2 == ((Natural)array[y]).getIdNumero()){
            					natural1 = ((Natural) array[x]).getValor();
            					natural2 = ((Natural) array[y]).getValor();
            					
            					switch(eleccion){
                				case 3:
                					((Natural)array[y]).Suma(natural1, natural2, 0, 0);
                					i=1;
                					break;	
                				case 4:
                					((Natural)array[y]).Resta(natural1, natural2, 0, 0);
                					i=1;
                					break;
                				case 5:
                					((Natural)array[y]).Multiplicacion(natural1, natural2, 0, 0);
                					i=1;
                					break;
                				}
            				}
            			}
            		}
            	}	
            }
        }
    	
        
        
    }

		public static void EleccionC(Numeros[] array, int eleccion){
		        
		        for (int x=0;x<array.length;x++){
		            if (array[x].getTipo() == "Complejo"){
		            	
		                System.out.print(((Complejo)array[x]).getIdComplejo() + "_");//downcast.: imprimis usando un metodo de natural utilizando un array de tipo numero
		                System.out.print(((Complejo)array[x]).getValor1() + " - ");  
		                System.out.println(((Complejo)array[x]).getValor2());
		            }
		        }
		        int i=0;
		        System.out.println("elija el id del primer numero con el que desea operar");
		    	double complejo1 = p.nextInt();
		    	System.out.println("elija el id del segundo numero con el que desea operar");
		    	double complejo2 = p.nextInt();
		    	
		    	double complejo3,complejo4;
		    	for (int x=0;x<array.length;x++){
		            if (array[x].getTipo() == "Complejo"){
		            	if (complejo1 == ((Complejo)array[x]).getIdComplejo()){
		            		for (int y=0;y<array.length;y++){
		            			if (array[y].getTipo() == "Complejo"){
		            				if (complejo2 == ((Complejo)array[y]).getIdComplejo()){
		            					complejo1 = ((Complejo) array[x]).getValor1();
		            					complejo2 = ((Complejo) array[x]).getValor2();
		            					complejo3 = ((Complejo) array[y]).getValor1();
		            					complejo4 = ((Complejo) array[y]).getValor2();
		            					
		            					
		            					switch(eleccion){
		                				case 3:
		                					((Complejo)array[y]).Suma(complejo1, complejo2, complejo3, complejo4);
		                					
		                					return;	
		                				case 4:
		                					((Complejo)array[y]).Resta(complejo1, complejo2, complejo3, complejo4);
		                					
		                					return;
		                				case 5:
		                					((Complejo)array[y]).Multiplicacion(complejo1, complejo2, complejo3, complejo4);
		                					
		                					return;
		                				}
		            				}
		            			}
		            		}
		            	}	
		            }
		        }
		    	
		        
		}

    
    
    
}