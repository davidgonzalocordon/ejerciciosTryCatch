package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size, Blanks;
        String alignment;
        System.out.print("Introduzca el tamaño del triángulo: ");
        
        try {
            size = reader.nextInt();
            reader.nextLine();
        
            System.out.print("Indique la alineación del triángulo (Derecha / Izquierda): ");
            alignment = reader.nextLine();
        
            if (alignment.equalsIgnoreCase("derecha")) {
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (alignment.equalsIgnoreCase("izquierda")) {
                for (int fila = 1; fila <= size + 1; fila++) {
                    Blanks = (size + 1) - fila;
                    for (int i = 0; i < Blanks; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 1; i < fila; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("La alineación introducida no es válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor válido para el tamaño del triángulo.");
        }
    }
}
