package TFI02;

public class Profesor extends Persona {



    private double basico;



    private int antiguedad;

    public Profesor(double basico, int antiguedad){
        this.setBasico(basico);
        this.setAntiguedad(antiguedad);
    }


    public double calcularSueldo(){
        double sueldo=0;
        sueldo= (this.basico*this.antiguedad)/100;

        return sueldo;
    }
    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}

