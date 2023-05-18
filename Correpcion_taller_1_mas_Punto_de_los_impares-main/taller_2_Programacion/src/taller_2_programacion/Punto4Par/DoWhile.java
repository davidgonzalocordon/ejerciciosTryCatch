/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto4Par;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DoWhile {

    public static void main(String[] args) {
        try {
            int k = 0;
            String raiz = " ";
            String palabra = " ";
            String[] palabras = new String[5];
            boolean validacion = false;
            Scanner lector = new Scanner(System.in);

            System.out.println("5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
            System.out.println("Ingresa 4 palabras más: ");

            for (int i = 0; i < 5; i++) {
                do {
                    System.out.print("Ingrese palabra #" + (i + 1) + ": ");
                    palabra = lector.next();
                    if (palabra.matches("[a-zA-Z]*")) {
                        palabras[k] = palabra;
                        validacion = true;
                    } else {
                        System.out.println("\nIngrese una palabra válida.\n");
                    }
                } while (validacion == false);
                k++;
            }
            int i = 0;

            for (int g = 0; g < palabras.length; g++) {
                raiz = palabras[g];
                System.out.println("Para la palabra " + raiz + ": ");
                do {
                    int j = 0;
                    do {
                        if (raiz.contains(String.valueOf(palabras[i].charAt(j)))) {
                            System.out.println("Esta palabra (" + palabras[i] + ") encaja en la palabra base.");

                        }
                        j++;
                    } while (j < palabras[i].length());

                    j = 0;
                    i++;
                } while (i < palabras.length);

                i = 0;
                System.out.println("");
            }

            System.out.println("do while");
        } catch (Exception e) {
            System.out.println("Error en la ejecución del programa.");
        }
    }
}
