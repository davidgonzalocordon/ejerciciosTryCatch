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
public class Punto2While {

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

            contador = 0;
            // mediana

            if (num_max == 1) {
                System.out.println("La mediana de este ejercicio es: 1");
            }

            contador = 0;
            if (residuo == 0 & num_max != 1) {

                while (contador <= list_num.length) {
                    switch (num_max) {
                        case 2:
                            if (contador == mitad_vec) {

                                rang_1 = list_num[contador - 1];
                            }
                            if (contador == (int) a) {

                                rang_2 = list_num[contador - 1];

                            }
                            break;

                        case 4:
                            if (contador == mitad_vec) {
                                rang_1 = list_num[contador - 1];
                            } else {
                                if (contador == a) {
                                    rang_2 = list_num[contador - 1];
                                }
                            }
                            break;
                    }

                    contador++;
                }

                mediana_par = rang_1 + rang_2;

                mediana_par = mediana_par / 2;
                System.out.println("La mediana es de " + mediana_par);
                mediana_par = 0;
                rang_1 = 0;
                rang_2 = 0;

            } else {
                while (contador < list_num.length) {
                    if (contador == mitad_vec) {
                        System.out.println(
                                "La mediana es: " + list_num[(int) mitad_vec]);
                    }
                    contador++;
                }

            }

            // media
            contador = 0;
            media = 0;
            while (contador < list_num.length) {
                media = media + list_num[contador];
                contador++;
            }

            media = media / num_max;
            System.out.println("");
            System.out.println("La media de los datos dados es: " + (media));

            // moda
            moda = 0;
            contador2 = -1;
            contador3 = 0;
            contador4 = 0;

            while (contador3 < list_num.length) {
                contador = 0;
                while (contador4 < list_num.length) {
                    if (list_num[contador3] == list_num[contador4]) {
                        contador = contador++;
                    }
                    contador4++;
                }
                if (contador > contador2) {

                    moda = list_num[contador3];
                    contador2 = contador;

                }
                contador3++;
            }

            System.out.println("La moda es: " + moda);

            System.out.println("while");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la ejecución del programa.");
        }
    }
}
