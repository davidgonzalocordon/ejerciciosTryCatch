/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Punto2Forearch {

    public static void main(String[] args) {
        try {
            System.out.println("2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
            System.out.println("");
            Scanner lector = new Scanner(System.in);
            int num_max = (int) (Math.random() * 4 + 1);
            int[] list_num = new int[num_max];
            int rang_1, rang_2, moda, contador3, contador4, contador2, contador;
            double mediana_par;
            rang_1 = 0;
            rang_2 = 0;
            double mitad_vec = num_max / 2;
            double residuo = num_max % 2;
            Math.round(mitad_vec);
            double a = mitad_vec + 1;
            double media = 0;

            System.out.println("El número máximo de números que se pueden registrar es de " + num_max);
            for (int j = 0; j < list_num.length; j++) {
                System.out.println("Por favor digitar el valor #" + (j + 1));
                list_num[j] = lector.nextInt();
            }
            System.out.println("");

            // Mediana
            if (num_max == 1) {
                System.out.println("La mediana de este ejercicio es: 1");
            }

            contador = 0;
            if (residuo == 0 & num_max != 1) {
                for (int k : list_num) {
                    switch (num_max) {
                        case 2:
                            if (k == mitad_vec) {
                                rang_1 = list_num[k - 1];
                                rang_2 = list_num[k];
                            }
                            break;

                        case 4:
                            if (k == mitad_vec) {
                                rang_1 = list_num[k - 1];
                            } else {
                                if (k == a) {
                                    rang_2 = list_num[k - 1];
                                }
                            }
                            break;
                    }
                }

                mediana_par = rang_1 + rang_2;

                mediana_par = mediana_par / 2;
                System.out.println("La mediana es de " + mediana_par);
                mediana_par = 0;
                rang_1 = 0;
                rang_2 = 0;
            } else {
                System.out.println("La mediana es: " + list_num[(int) mitad_vec]);
            }

            // Media
            media = 0;
            for (int k : list_num) {
                media = media + list_num[k];
            }

            media = media / num_max;
            System.out.println("");
            System.out.println("La media de los datos dados es: " + (media));

            // Moda
            moda = 0;
            contador2 = -1;
            contador3 = 0;
            contador4 = 0;
            for (int i : list_num) {
                contador = 0;
                contador3 = i;
                for (int j : list_num) {
                    contador4 = j;
                    if (list_num[contador3] == list_num[contador4]) {
                        contador = contador++;
                    }
                }
                if (contador > contador2) {
                    moda = list_num[contador3];
                    contador2 = contador;
                }
            }
            System.out.println("La moda es: " + moda);

            System.out.println("foreach");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la ejecución del programa.");
        }
    }
}
