package Clase_2;
import javax.swing.*;

public class Clase_2_EstrucR_EJ1 {

	public static void main(String[] args) {
		
		int x;
        System.out.println("cuenta del 1 al 10 con for");
        for( x=1; x<=10; x++){
            System.out.print(x + " ");
        }
        x=1;
        System.out.println();
        System.out.println();
        System.out.println("cuenta del 1 al 10 con while");
        while(x<=10){
            System.out.print(x + " ");
            x++;
        }
        String [] nombres = new String [4];

        for (x=0;x< nombres.length;x++){
            nombres[x]= JOptionPane.showInputDialog("ingrese el nombre");

        }

        for (String nombre: nombres){
            JOptionPane.showMessageDialog(null, nombre);
        }
	}

}
