package TPN1;
import java.util.Scanner;
public class TrabajoPracticoNº1 {

	public static void main(String[] args) {
		
		
		Scanner p = new Scanner (System.in);
		
        String nombre;
        
        int edad;
        
        do{
        	
            System.out.println("ingrese su nombre");
            
            nombre=p.next();
            
            System.out.println("ingrese su edad");
            
            edad=p.nextInt();
            
            if (edad>=18){
            	
                System.out.println(nombre + " es mayor de edad");
                
            }else{
            	
                System.out.println(nombre + " es menor de edad");
                
            }
            
        }while(edad!=0);

	}

}
