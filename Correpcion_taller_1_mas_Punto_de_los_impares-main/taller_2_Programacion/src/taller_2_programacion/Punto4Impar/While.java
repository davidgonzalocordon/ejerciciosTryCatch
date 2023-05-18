/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto4Impar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class While {

    public static void main(String[] args) {
        try {
            Scanner lector = new Scanner(System.in);
            String palabra, PInvertida = "";
            int i;
            System.out.println("Por favor ingrese la palabra que desea invertir: ");
            palabra = lector.nextLine();
            System.out.println("");

            i = palabra.length() - 1;

            while (i >= 0) {
                PInvertida += palabra.charAt(i);
                i--;
            }

            System.out.println("La palabra invertida es: " + PInvertida);
        } catch (Exception e) {
            System.out.println("Error en la ejecución del programa.");
        }
    }
}
