package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int amount, num1 = 0, num2 = 1;
        
        try {
            System.out.print("Introduzca la cantidad de elementos de la serie de Fibonacci que desea visualizar: ");
            amount = reader.nextInt();

            System.out.print("Serie de Fibonacci de " + amount + " elementos:");

            for (int i = 1; i <= amount; ++i) {
                System.out.print(num1 + " ");

                int suma = num1 + num2;
                num1 = num2;
                num2 = suma;
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para la cantidad de elementos.");
        }
    }

}
