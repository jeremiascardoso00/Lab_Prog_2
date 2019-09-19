package TPN7;

public class excepcionPropia extends ArithmeticException{
	public excepcionPropia(){
		
	}
	
	public excepcionPropia(String mensajeError){
		super(mensajeError);
	}
}
