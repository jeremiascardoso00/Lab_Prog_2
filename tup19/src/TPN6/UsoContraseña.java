package TPN6;
import java.util.Scanner;

public class UsoContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner p = new Scanner(System.in);
		
		int tamañoArray=0,tamañoContra=0;
		boolean validacion;
		
		Contraseña[] contraseña;
		
		System.out.println("ingrese el tamaño del array");
		tamañoArray = p.nextInt();
		System.out.println("ingrese la longitud de las contraseñas"); 
		tamañoContra = p.nextInt();
		
		contraseña = new Contraseña[tamañoArray];
		
		for (int i=0;i < tamañoArray; i++){
			contraseña[i] = new Contraseña(tamañoContra);
			validacion = contraseña[i].validacionContra();
			if (validacion){
				System.out.println(contraseña[i].getContraseña() + " El tamaño de la contraseña es: " + contraseña[i].getTamañoContra()+ ". La contraseña es segura.");
			}else{
				System.out.println(contraseña[i].getContraseña() + " El tamaño de la contraseña es: " + contraseña[i].getTamañoContra()+ ". La contraseña es debil.");
			}
			
		}
		
		
	}

}
