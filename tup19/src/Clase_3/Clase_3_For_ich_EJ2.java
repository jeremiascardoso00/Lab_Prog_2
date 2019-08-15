package Clase_3;

public class Clase_3_For_ich_EJ2 {

	public static void main(String[] args) {
		int [][] matriz = new int [9][9];
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				matriz[i][j]= (int) (Math.random()*100);
			}
		} 
		
		for (int[] x:matriz) {
			for (int j:x) {
				System.out.print(j +" ");
				
			}
			System.out.println();
		}
	}

}
