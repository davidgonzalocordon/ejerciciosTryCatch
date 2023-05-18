/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Punto1Foreach {
    public static void main(String[] args) {
        try {
            int contador = 0, multiplicador, producto, multiplicado;
            Random numA = new Random();
            multiplicado = numA.nextInt(2024);
            multiplicador = numA.nextInt(2024);
            int[] productos = new int[multiplicador + 1];

            System.out.println("1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar. ");
            System.out.println("");
            System.out.println("los números que salieron son: ");
            System.out.println("multiplicado = " + multiplicado);
            System.out.println("el multiplicado va a ser multiplicado hasta el numero " + multiplicador);

            for (contador = 0; contador <= multiplicador; contador++) {
                producto = multiplicado * contador;
                productos[contador] = producto;
            }
            for (int contar : productos) {
                contar = contador;
                System.out.println(multiplicado + "*" + contar + "=" + productos[contar]);
                contador++;
            }
            System.out.println("foreach");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la ejecución del programa.");
        }
    }
}
