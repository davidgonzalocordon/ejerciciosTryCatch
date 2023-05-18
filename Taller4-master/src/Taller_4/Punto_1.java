package Taller_4;

import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] numeros = new int[2];
        System.out.println("Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.");

        try {
            System.out.println("Introduce el valor del primer número: ");
            numeros[0] = lector.nextInt();

            System.out.println("Introduce el valor del segundo número: ");
            numeros[1] = lector.nextInt();

            if (numeros[0] == numeros[1]) {
                System.out.println("Los dos números son iguales.");
            } else {
                if (numeros[0] < numeros[1]) {
                    System.out.println("El número mayor es el segundo número.");
                } else {
                    System.out.println("El primer número es el mayor.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos para los números.");
        }
    }

}
