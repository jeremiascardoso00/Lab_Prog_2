package TPN5;

public class Estudiante {
    private String nombreEstudiante;
    private int numeroEstudiante;
    private double notaMedia;
    private static int ContadorEstudiante=1;


    public Estudiante(String nombre, double notaMedia){
        this.nombreEstudiante = nombre;
        this.notaMedia = notaMedia;
        this.numeroEstudiante = ContadorEstudiante;
        ContadorEstudiante++;
    }
    public Estudiante(){

    }
    public String getInfo(){
        return "el nombre del estudiante es:" +  this.nombreEstudiante+"\nnota media: " + this.notaMedia + "\nnumero estudiante: " + this.numeroEstudiante;
    }


}
