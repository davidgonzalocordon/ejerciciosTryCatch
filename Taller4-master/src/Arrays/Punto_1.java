package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Punto_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que lea 10 números por teclado y que luego los muestre en\n"
                + "orden inverso, es decir, el primero que se introduce es el último en mostrarse y\n"
                + "viceversa.");

        try {
            List<Integer> Numeros = new ArrayList<Integer>();
            int contador = 1;

            System.out.println("Inserte los números.");
            for (int i = 0; i <= 9; i++) {
                System.out.print("Posición #" + (i + 1) + ": ");
                Numeros.add(lector.nextInt());
            }

            Collections.reverse(Numeros);

            System.out.println("Ahora se mostrarán los números desde el último al primero:");
            for (Integer i : Numeros) {
                System.out.println("Posición #" + contador + ": " + i);
                contador++;
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido.");
        }
    }

}
