
package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            System.out.print("Introduzca una frase: ");
            String phrase = reader.nextLine();

            String[] words = phrase.split(" ");

            System.out.println("Número de palabras: " + words.length);

            System.out.println("Número de letras en cada palabra:");

            for (String word : words) {
                System.out.println(word + ": " + word.length());
            }
        } catch (Exception e) {
            System.out.println("Error: Ocurrió un problema al procesar la frase.");
        }
    }

    
}
