package TPN6;
import java.util.Scanner;

public class UsoContrase�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner p = new Scanner(System.in);
		
		int tama�oArray=0,tama�oContra=0;
		boolean validacion;
		
		Contrase�a[] contrase�a;
		
		System.out.println("ingrese el tama�o del array");
		tama�oArray = p.nextInt();
		System.out.println("ingrese la longitud de las contrase�as"); 
		tama�oContra = p.nextInt();
		
		contrase�a = new Contrase�a[tama�oArray];
		
		for (int i=0;i < tama�oArray; i++){
			contrase�a[i] = new Contrase�a(tama�oContra);
			validacion = contrase�a[i].validacionContra();
			if (validacion){
				System.out.println(contrase�a[i].getContrase�a() + " El tama�o de la contrase�a es: " + contrase�a[i].getTama�oContra()+ ". La contrase�a es segura.");
			}else{
				System.out.println(contrase�a[i].getContrase�a() + " El tama�o de la contrase�a es: " + contrase�a[i].getTama�oContra()+ ". La contrase�a es debil.");
			}
			
		}
		
		
	}

}
