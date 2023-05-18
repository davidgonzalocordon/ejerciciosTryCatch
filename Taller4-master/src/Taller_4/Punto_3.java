package Taller_4;

import java.util.Scanner;

public class Punto_3 {

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.");

        try {
            double[] numeros = new double[2];
            System.out.println("Inserte el primer número: ");
            numeros[0] = lector.nextDouble();
            System.out.println("Inserte el segundo número, recuerde que ningún número se puede dividir entre 0: ");
            numeros[1] = lector.nextDouble();

            while (numeros[1] == 0) {
                System.out.println("Inserte un número diferente a 0: ");
                numeros[1] = lector.nextDouble();
            }

            double division = numeros[0] / numeros[1];

            if (numeros[0] % numeros[1] == 0) {
                System.out.println("La división entre estos dos números es de " + (int) division);
            } else {
                System.out.println("La división entre estos dos números es de " + division);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos para los números.");
        }
    }

}
