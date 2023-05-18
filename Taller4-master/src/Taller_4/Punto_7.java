package Taller_4;

import java.util.Scanner;

public class Punto_7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida los puntos centrales\n"
                + "de dos circunferencias (x1, y1), (x2, y2) y los radios de\n"
                + "las mismas (r1, r2). El programa debe clasificar según\n"
                + "corresponda como: exteriores, tangentes exteriores,\n"
                + "secantes, tangentes interiores, interiores o\n"
                + "concéntricas.");

        try {
            double x1, y1, r1, x2, y2, r2, distancia;
            System.out.println("Introduce los puntos centrales de la primera circunferencia:");
            System.out.print("x1= ");
            x1 = lector.nextDouble();
            System.out.print("y1= ");
            y1 = lector.nextDouble();
            System.out.println("Introduce el radio de la primera circunferencia:");
            r1 = lector.nextDouble();

            System.out.println("Introduce los puntos centrales de la segunda circunferencia:");
            System.out.print("x2= ");
            x2 = lector.nextDouble();
            System.out.print("y2= ");
            y2 = lector.nextDouble();
            System.out.println("Introduce el radio de la segunda circunferencia:");
            r2 = lector.nextDouble();

            distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distancia > r1 + r2) {
                System.out.println("Las circunferencias son exteriores");
            } else if (distancia == r1 + r2) {
                System.out.println("Las circunferencias son tangentes exteriores");
            } else if (distancia > Math.abs(r1 - r2) && distancia < r1 + r2) {
                System.out.println("Las circunferencias son secantes");
            } else if (distancia == Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son tangentes interiores");
            } else if (distancia < Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son interiores");
            } else if (distancia == 0 && r1 == r2) {
                System.out.println("Las circunferencias son concéntricas");
            } else {
                System.out.println("Las circunferencias no se pueden clasificar");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos para los puntos y radios de las circunferencias.");
        }
    }

}
