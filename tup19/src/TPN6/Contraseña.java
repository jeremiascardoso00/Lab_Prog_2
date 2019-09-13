package TPN6;

import java.util.UUID;

public class Contrase�a {

	private int tama�oContra;
	private String contrase�a;
	
	public Contrase�a(int tama�oContra){
		
		this.setTama�oContra(tama�oContra);
		
		this.setContrase�a(generador(tama�oContra));
	}
	
	public String generador(int tama�oContra){
		
		int parteMayus = (int)(Math.random()*tama�oContra-1);
		
		int parteMinus = tama�oContra - parteMayus;
		
		String contra = UUID.randomUUID().toString().replace("-", "").toUpperCase().substring(0, parteMayus);
		String se�a = UUID.randomUUID().toString().replace("-", "").substring(0, parteMinus);
		
		String contrase�a= contra + se�a;
		
		return contrase�a;
	}
	
	public boolean validacionContra(){
		char car;
		int mayus=0,minus=0,numeros=0;
		boolean fuerza;
		for (int i=0;i<this.tama�oContra;i++){
			car=this.contrase�a.charAt(i);
			if (Character.isUpperCase(this.contrase�a.charAt(i))) mayus++;
			
			if (Character.isLowerCase(this.contrase�a.charAt(i))) minus++;
			
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
	
	
	
	
	public String getContrase�a() {
		return contrase�a;
	}

	private void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getTama�oContra() {
		return tama�oContra;
	}

	private void setTama�oContra(int tama�oContra) {
		this.tama�oContra = tama�oContra;
	}
}
