/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasteven;

import java.util.Scanner;

/**
 *
 * @author Duvan
 */
public class TareaSteven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        String nombreEstudiante, nombreMateria;
        int documento, opcionIni, opcionEstudiante, cantidadMaterias, cantidadEstudiante;
        Double corte1,corte2,corte3,sumaPromedios=0.0,promedioFinal;
        Materias materias[];
        Estudiante estudiante[];

        System.out.print("Cantidad de estudiantes a ingresar: ");
        cantidadEstudiante = dato.nextInt();
        estudiante = new Estudiante[cantidadEstudiante];
        
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("Registre al primer Estudiante");
            System.out.print("\nIngrese el numero de documento: ");
            documento = dato.nextInt();
            dato.nextLine();
            System.out.print("Ingrese nombre del Estudiante: ");
            nombreEstudiante = dato.nextLine();
    
            System.out.print("\nCantidad de materias a ingresar: ");
            cantidadMaterias = dato.nextInt();
            materias = new Materias[cantidadMaterias];
    
            for (int m = 0; m < cantidadMaterias; m++) {
                dato.nextLine();
                System.out.print("\nNombre Materia: ");
                nombreMateria = dato.nextLine();
                System.out.print("Ingrese nota del primer corte: ");
                corte1 = dato.nextDouble();
                System.out.print("Ingrese nota del Segundo corte: ");
                corte2 = dato.nextDouble();
                System.out.print("Ingrese nota del Tercer corte: ");
                corte3 = dato.nextDouble();
                materias[m] = new Materias(nombreMateria, corte1, corte2, corte3);
            }
            
            estudiante[i] = new Estudiante(nombreEstudiante, documento, materias);   
        }


        do {

            System.out.println("\n\tMenu inicial");
            System.out.println("1. Consultar documento");
            System.out.println("2. Salir");
            System.out.print("Ingrese la opcion: ");
            opcionIni = dato.nextInt();

            switch (opcionIni) {
                case 1:
                    System.out.print("\nIngrese el documento del estudiante: ");
                    documento = dato.nextInt();
                    for (int i = 0; i < estudiante.length; i++) {
                        if (documento == estudiante[i].getDocumento()) {
                            do {
                                System.out.println("\n\tMenu estudiante");
                                System.out.println("1. Validar Notas");
                                System.out.println("2. Tipo de beca asignada");
                                System.out.println("3. Salir");
                                System.out.print("Ingrese la opcion: ");
                                opcionEstudiante = dato.nextInt();
        
                                switch (opcionEstudiante) {
                                    case 1:
                                        for (int j = 0; j < estudiante[i].materias.length; j++) {
                                            System.out.println("\nLas notas de la materia "+ estudiante[i].materias[j].getNombreMateria());
                                            System.out.println("Primer Corte " + estudiante[i].materias[j].getCorte1());
                                            System.out.println("Segundo Corte " + estudiante[i].materias[j].getCorte2());
                                            System.out.println("Corte Corte " + estudiante[i].materias[j].getCorte3());
                                            System.out.println("Promedio de materia: " + estudiante[i].materias[j].promedioFinal());
                                            sumaPromedios += estudiante[i].materias[j].promedioFinal();
                                        }
                                        promedioFinal = sumaPromedios/estudiante[i].materias.length;

                                        break;
                                    case 2:
                                        System.out.println("Validacion de beca");
                                        break;
                                    default:
                                        System.out.println("Ha salido del menu estudiante");
                                        break;
                                }
        
                            } while (opcionEstudiante != 3);
                        }else{
                          System.out.println("Documento no existe");  
                        }
                    }
                    break;
                default:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
            }

        } while (opcionIni != 2);
    }

}
