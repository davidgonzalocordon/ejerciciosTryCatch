package Taller_4;

import java.util.Scanner;

public class Punto_11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("El director de una escuela está organizando un viaje de estudios y requiere determinar\n"
                + "cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el\n"
                + "servicio. La forma de cobrar es la siguiente:\n"
                + "* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.\n"
                + "* De 50 a 99 alumnos, el costo es de 70 euros.\n"
                + "* De 30 a 49 alumnos, el costo es de 95 euros.\n"
                + "* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar\n"
                + "el número de alumnos.\n"
                + "Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo\n"
                + "que debe pagar cada alumno por el viaje.");

        try {
            double NumEstudiantes, TotalPagarEuros = 0, ValorPorEstudianteCentimos = 0, ValorPorEstudianteEuros = 0;

            System.out.println("Inserte el número de estudiantes: ");
            NumEstudiantes = lector.nextDouble();

            if (NumEstudiantes >= 100) {
                ValorPorEstudianteEuros = 65;
                TotalPagarEuros = NumEstudiantes * ValorPorEstudianteEuros;
            }

            if (NumEstudiantes >= 50 & NumEstudiantes <= 99) {
                ValorPorEstudianteEuros = 70;
                TotalPagarEuros = NumEstudiantes * ValorPorEstudianteEuros;
            }
            if (NumEstudiantes >= 30 & NumEstudiantes <= 49) {
                ValorPorEstudianteEuros = 95;
                TotalPagarEuros = NumEstudiantes * ValorPorEstudianteEuros;
            }
            if (NumEstudiantes <= 29) {
                TotalPagarEuros = 4000;
                ValorPorEstudianteEuros = 4000 / NumEstudiantes;
                ValorPorEstudianteCentimos = ValorPorEstudianteEuros % 1;
                ValorPorEstudianteEuros -= ValorPorEstudianteCentimos;
                ValorPorEstudianteCentimos *= 100;
            }

            if (NumEstudiantes >= 30) {
                System.out.println("El total a pagar es de " + (int) TotalPagarEuros + " euros. Cada estudiante debe pagar " + (int) ValorPorEstudianteEuros + " euros.");
            } else {
                if (ValorPorEstudianteCentimos == 0) {
                    System.out.println("El total a pagar es de " + (int) TotalPagarEuros + " euros. Cada estudiante debe pagar " + (int) ValorPorEstudianteEuros + " euros.");
                } else {
                    System.out.println("El total a pagar es de " + (int) TotalPagarEuros + " euros. Cada estudiante debe pagar " + (int) ValorPorEstudianteEuros + " euros con " + (int) ValorPorEstudianteCentimos + " céntimos.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el número de estudiantes.");
        }
    }

}
