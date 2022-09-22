/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasteven;

/**
 *
 * @author Git
 */
public class Estudiante {
    private String nombreEstudiante;
    private int documento;
    Materias materias [];

    public Estudiante(String nombreEstudiante, int documento, Materias[] materias) {
        this.nombreEstudiante = nombreEstudiante;
        this.documento = documento;
        this.materias = materias;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getDocumento() {
        return documento;
    }



}
