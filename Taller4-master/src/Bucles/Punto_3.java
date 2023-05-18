package Bucles;

import java.util.Scanner;

public class Punto_3 {

    public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra);
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL' en caso contrario, el programa termina cuando se introduce un espacio.");

        try {
            String txt;
            char caracter;

            while (true) {
                System.out.print("Introduce un caracter o un espacio para terminar: ");
                txt = lector.nextLine();

                if (txt.equals(" ")) {
                    break;
                }

                caracter = txt.charAt(0);

                if (esVocal(caracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        }
    }
}
