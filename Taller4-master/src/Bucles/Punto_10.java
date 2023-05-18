package Bucles;

import java.util.Scanner;

public class Punto_10 {

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que lea un número n e imprima una pirámide de números con n filas.");

        try {
            int numero, EspaciosEnBlanco = 0;
            System.out.println("Inserte hasta qué número debe llegar la pirámide: ");
            numero = lector.nextInt();

            for (int fila = 1; fila <= numero; fila++) {
                EspaciosEnBlanco = numero - fila;
                for (int i = 0; i < EspaciosEnBlanco; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i < fila; i++) {
                    System.out.print(i);
                }
                for (int i = fila; i >= 1; i--) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el número de filas.");
        }
    }
}
