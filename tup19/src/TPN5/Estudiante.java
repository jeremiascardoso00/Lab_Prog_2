package TPN5;

public class Estudiante {
    private String nomEstudiante;
    private int nroEstudiante;
    private double notaMedia;
    private static int ContadorEstudiante=1;

    public Estudiante(String nomEstudiante, double notaMedia){

        this.nomEstudiante=nomEstudiante;
        this.setNotaMedia(notaMedia);
        this.nroEstudiante=ContadorEstudiante;
        ContadorEstudiante++;

    }
	public double getNotaMedia() {
			return notaMedia;
		}
	
	public void setNotaMedia(double notaMedia) {
			this.notaMedia = notaMedia;
	}
	
	
    public String getInfo(){
        return "El nombre del estudiante es: "+this.nomEstudiante+"\nEl numero del estudiante es: "+this.nroEstudiante+"\nSu nota media es de: "+this.getNotaMedia();
    }
    
    public String getNomEstudiante() {
    	return nomEstudiante;
    }
    public void borrar() {
    	this.nomEstudiante=null;
        this.setNotaMedia(0);
        this.nroEstudiante=0;
    }

	

}
