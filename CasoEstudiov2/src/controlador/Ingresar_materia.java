package controlador;

import javax.swing.JOptionPane;

public class Ingresar_materia {

    public String ncMateria() {
        String ncMateria = JOptionPane.showInputDialog("Ingrese cantidad de materias : ");
		int nc = Integer.parseInt(ncMateria);
        return ncMateria;
    }

    public String nMateria() {
        String nMateria = JOptionPane.showInputDialog("Ingrese el Nombre de la materia : ");
        String mat =(nMateria);
        return nMateria;
    }

    public String nCorte() {
        String nCorte = JOptionPane.showInputDialog("Ingrese la nota del corte: ");
        double cor = Integer.parseInt(nCorte);
        return nCorte;
    }

}
