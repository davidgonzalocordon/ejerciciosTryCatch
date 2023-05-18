package Taller_4;

import java.util.Scanner;

public class Punto_6 {

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.");
        System.out.println("* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE");
        System.out.println("* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA");
        System.out.println("* Otros casos -> NO ACEPTADA");

        try {
            double nota;
            int edad;
            String sexo, respuesta;

            System.out.println("Inserte su nota: ");
            nota = lector.nextDouble();
            System.out.println("Inserte su edad: ");
            edad = lector.nextInt();
            System.out.println("Inserte su sexo (M) para masculino y (F) para femenino: ");
            sexo = lector.next();

            if (edad == 18 && nota == 5) {
                if (sexo.equals("F")) {
                    System.out.println("ACEPTADA");
                } else {
                    System.out.println("POSIBLE");
                }
            } else {
                System.out.println("NO ACEPTADA");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores válidos para la nota, edad y sexo.");
        }
    }

}
