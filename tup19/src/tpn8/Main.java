package tpn8;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner p = new Scanner(System.in);
		
		
		Vehiculo[] vehiculos = new Vehiculo[2];
		
		vehiculos[0] = new Coche(112);
		vehiculos[1] = new Moto(121);
		
		for (int x=0; x<vehiculos.length; x++) {
			System.out.println(vehiculos[x].PLAZAS());
			System.out.println("ingrese la cantidad que desea acelerar");
			int acelerar = p.nextInt();
			System.out.println(vehiculos[x].ACELERAR(acelerar));
			
			System.out.println("ingrese la cantidad que desea frenar");
			int frenar = p.nextInt();
			
			vehiculos[x].FRENAR(frenar);
		}
		
	}

}
