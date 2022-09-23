package controlador;

import javax.swing.JOptionPane;

public class Ingresar_estudiante {


    public String nEstudiantes() {
        String nEstudiantes = JOptionPane.showInputDialog("Ingrese el Nombre del Estudiante: ");
        String stu =(nEstudiantes);
        return nEstudiantes;
    }

    public String nDocumento() {
        String nDocumento = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
        String doc = (nDocumento);
        return nDocumento;
    }

}
