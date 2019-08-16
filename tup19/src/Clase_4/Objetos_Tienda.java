package Clase_4;

import javax.swing.JOptionPane;

public class Objetos_Tienda {

	public static void main(String[] args) {

		int dimen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de pantalla de su dispositivo"));
		int capa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de capacidad"));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
		double cam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los MPX de la camara"));
		String tipo = (JOptionPane.showInputDialog("Ingrese el tipo"));
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock"));
		Movil celular = new Movil(dimen, capa, precio, cam, tipo, stock);
		System.out.println(celular.getInfo());
	}

}
