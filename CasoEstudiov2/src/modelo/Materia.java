package modelo;

public class Materia {

    private String NombreMateria;
    private int CantidadMaterias;
    private double corte1;
    private double corte2;
    private double corte3;

    public Materia(String pNombreMateria, int pCantidadMaterias, double pcorte1, double pcorte2, double pcorte3) {
        this.NombreMateria = pNombreMateria;
        this.CantidadMaterias = pCantidadMaterias;
        this.corte1 = pcorte1;
        this.corte2 = pcorte2;
        this.corte3 = pcorte3;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public int getCantidadMaterias() {
        return CantidadMaterias;
    }

    public double getCorte1() {
        return corte1;
    }

    public double getCorte2() {
        return corte2;
    }

    public double getCorte3() {
        return corte3;
    }

}
