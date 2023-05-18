package Taller_4;

import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.");

        try {
            String letra;

            System.out.println("Inserte la letra: ");
            letra = lector.nextLine();

            while (letra.length() != 1) {
                System.out.println("Inserte una letra, no una cadena de texto: ");
                letra = lector.nextLine();
            }

            if (Character.isUpperCase(letra.charAt(0))) {
                System.out.println("La letra es mayúscula.");
            } else {
                System.out.println("La letra es minúscula.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa una letra válida.");
        }
    }

}
