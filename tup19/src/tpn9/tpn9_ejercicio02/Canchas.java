package tpn9_ejercicio02;
import java.util.Scanner;

public class Canchas{

	private String tipo;
	
	public Canchas(int cant) {
		
		int resp1=0;
		Scanner p = new Scanner(System.in);
	
		do{
			System.out.println("ingrese el tipo de cancha: \n"
			+ "1: Basquet\n"
			+ "2: Futbol\n"
			+ "3: Tennis\n"
			+ "4: Olimpiadas de cocineros de torta frita");
			resp1 = p.nextInt();
			if (resp1 != 1 && resp1 != 2 && resp1 != 3 && resp1 != 4){
				System.out.println("opcion incorrecta");
			}
		}while(resp1 != 1 && resp1 != 2 && resp1 != 3 && resp1 != 4);
		
		switch(resp1){
		case 1: 
			setTipo("Basquet");
			break;
		case 2:
			setTipo("Futbol");
			break;
		case 3: 
			setTipo("Tennis");
			break;
		case 4: 
			setTipo("Olimpiadas de cocineros de torta frita");
			break;
		}
		
	}
	
	
	public void setTipo(String tipode){
		this.tipo = tipode;
	}
	
	
	public String getTipo(){
		return tipo;
		
	}


	
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 0;
	}





	

	
	

}
