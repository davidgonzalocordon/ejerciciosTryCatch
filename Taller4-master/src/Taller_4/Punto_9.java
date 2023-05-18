package Taller_4;

import java.util.Scanner;

public class Punto_9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que reciba un año y nos diga si es bisiesto o no.");

        try {
            System.out.println("Ingrese el año que desea verificar:");
            int year = lector.nextInt();

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " es un año bisiesto");
            } else {
                System.out.println(year + " no es un año bisiesto");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el año.");
        }
    }

}
