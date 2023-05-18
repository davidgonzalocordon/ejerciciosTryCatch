package Bucles;

import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.");

        try {
            System.out.println("Inserte la cantidad de números que va a introducir:");
            int[] numeros = new int[lector.nextInt()];
            int mayores = 0, iguales = 0, menores = 0;

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Introduzca un número:");
                numeros[i] = lector.nextInt();
            }

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    mayores++;
                } else if (numeros[i] == 0) {
                    iguales++;
                } else {
                    menores++;
                }
            }

            System.out.println("La cantidad de números iguales, mayores y menores es:");
            System.out.println("Iguales: " + iguales);
            System.out.println("Mayores: " + mayores);
            System.out.println("Menores: " + menores);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para la cantidad de números.");
        }
    }

}
