package TrabajoEnClase7;

public class Estudiante {
    private String nomEstudiante;
    private int nroEstudiante;
    private double notaMedia;
    private static int ContadorEstudiante=1;

    public Estudiante(String nomEstudiante, double notaMedia){

        this.nomEstudiante=nomEstudiante;
        this.notaMedia=notaMedia;
        this.nroEstudiante=ContadorEstudiante;
        ContadorEstudiante++;

    }

    public String getInfo(){
        return "El nombre del estudiante es: "+this.nomEstudiante+"\nEl número del estudiante es: "+this.nroEstudiante+"\nSu nota media es de: "+this.notaMedia;
    }

}
