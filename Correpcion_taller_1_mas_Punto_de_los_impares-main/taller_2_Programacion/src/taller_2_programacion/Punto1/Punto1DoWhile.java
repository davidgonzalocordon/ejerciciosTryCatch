/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto1;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Punto1DoWhile {

    public static void main(String[] args) {
        int contador, multiplicador, producto, multiplicado;
        Random numA = new Random();
        multiplicado = numA.nextInt(2023) + 1;
        multiplicador = numA.nextInt(2023) + 1;

        System.out.println("1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar. ");
        System.out.println("");
        System.out.println("Los números que salieron son: ");
        System.out.println("multiplicado = " + multiplicado);
        System.out.println("el multiplicado va a ser multiplicado hasta el número " + multiplicador);
        contador = 0;
        try {
            do {
                producto = multiplicado * contador;
                System.out.println(multiplicado + "*" + contador + "=" + producto);
                contador = contador + 1;
            } while (contador <= multiplicador);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la ejecución del programa.");
        }
        System.out.println("do while");
    }
}
