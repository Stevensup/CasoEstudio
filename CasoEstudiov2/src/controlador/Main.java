package controlador;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		JOptionPane.showMessageDialog(null, "Bienvenido");
		String Mensaje = JOptionPane
				.showInputDialog("\n\tMenu inicial \n\t1. Crear Estudiante \n\t2. Salir \n\tIngrese la opcion: ");
		int numx = Integer.parseInt(Mensaje);
		System.out.println(Mensaje);

		switch (numx) {
			case 1:
				Ingresar_estudiante ie = new Ingresar_estudiante();
				System.out.println(ie.nEstudiantes());
				Ingresar_estudiante id = new Ingresar_estudiante();
				System.out.println(id.nDocumento());
				break;
			case 2:
				System.out.println("Gracias por utilizar el servicio");
				break;
		}

		String Mensaje2 = JOptionPane
				.showInputDialog("\n\tMenu secundario \n\t1.Ingresar materias \n\t2. Salir \n\tIngrese la opcion: ");
		int numx2 = Integer.parseInt(Mensaje2);
		System.out.println(Mensaje2);

		switch (numx2) {
			case 1:
				Ingresar_materia nc = new Ingresar_materia();
				System.out.println(nc.ncMateria());
				Ingresar_materia ie = new Ingresar_materia();
				System.out.println(ie.nMateria());
				Ingresar_materia id = new Ingresar_materia();
				System.out.println(id.nCorte());
				break;
			case 2:
				System.out.println("Gracias por utilizar el servicio");
				break;

		}

	}
}
