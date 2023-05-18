package Taller_4;

import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida un número por teclado y nos indique si es par o impar.");

        try {
            int num;

            System.out.println("Inserta el número: ");
            num = lector.nextInt();

            if (num % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el número.");
        }
    }
}
