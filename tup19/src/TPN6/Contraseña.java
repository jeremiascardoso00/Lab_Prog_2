package TPN6;

import java.util.UUID;

public class Contraseña {

	private int tamañoContra;
	private String contraseña;
	
	public Contraseña(int tamañoContra){
		
		this.setTamañoContra(tamañoContra);
		
		this.setContraseña(generador(tamañoContra));
	}
	
	public String generador(int tamañoContra){
		
		int parteMayus = (int)(Math.random()*tamañoContra-1);
		
		int parteMinus = tamañoContra - parteMayus;
		
		String contra = UUID.randomUUID().toString().replace("-", "").toUpperCase().substring(0, parteMayus);
		String seña = UUID.randomUUID().toString().replace("-", "").substring(0, parteMinus);
		
		String contraseña= contra + seña;
		
		return contraseña;
	}
	
	public boolean validacionContra(){
		char car;
		int mayus=0,minus=0,numeros=0;
		boolean fuerza;
		for (int i=0;i<this.tamañoContra;i++){
			car=this.contraseña.charAt(i);
			if (Character.isUpperCase(this.contraseña.charAt(i))) mayus++;
			
			if (Character.isLowerCase(this.contraseña.charAt(i))) minus++;
			
			if (car == '1' || car == '2' || car == '3' || car == '4' || car == '5' || car == '6' || car == '7' || car == '8' || car == '9' || car == '0'){
				numeros++;
			}
		}
		if (numeros>5 && mayus>2 && minus>1){
			fuerza=true;
		}else{
			fuerza=false;
		}
		return fuerza;
	}
	
	
	
	
	public String getContraseña() {
		return contraseña;
	}

	private void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getTamañoContra() {
		return tamañoContra;
	}

	private void setTamañoContra(int tamañoContra) {
		this.tamañoContra = tamañoContra;
	}
}
