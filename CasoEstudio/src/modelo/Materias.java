/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasteven;

/**
 *
 * @author Duvan
 */
public class Materias {
    private String nombreMateria;
    private Double corte1;
    private Double corte2;
    private Double corte3;

    public Materias(String nombreMateria, Double corte1, Double corte2, Double corte3) {
        this.nombreMateria = nombreMateria;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public Double getCorte1() {
        return corte1;
    }

    public Double getCorte2() {
        return corte2;
    }

    public Double getCorte3() {
        return corte3;
    }

    public Double promedioFinal(){
        Double resultado;
        resultado = (corte1 + corte2 + corte3)/3;
        return resultado;
    }

}
