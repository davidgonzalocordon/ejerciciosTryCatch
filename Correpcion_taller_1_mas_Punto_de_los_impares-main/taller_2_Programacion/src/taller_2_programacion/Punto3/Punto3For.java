/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Punto3For {

    public class Main {

        public static void main(String[] args) {
            String[] NomProductos = new String[23];
            int[] PrecioProductos = new int[23];
            int[] CantidadProductos = new int[23];
            Scanner lector = new Scanner(System.in);

            System.out.println("3) Pedir nombres (23), precios que ud quiera y cantidad (del 1 al 23) y que con esos datos los impriman.");

            System.out.println("Por favor insertar los nombres: ");
            for (int i = 0; i < NomProductos.length; i++) {
                System.out.println("");
                System.out.println("Nombre #" + (i + 1));
                NomProductos[i] = lector.nextLine();
            }

            System.out.println("");
            System.out.println("Por favor insertar los precios de cada producto: ");
            for (int i = 0; i < PrecioProductos.length; i++) {
                System.out.println("");
                System.out.print("Valor del producto " + NomProductos[i] + ": ");

                try {
                    PrecioProductos[i] = lector.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: El valor ingresado no es válido. Se asignará el precio 0 al producto.");
                    PrecioProductos[i] = 0;
                }
            }

            System.out.println("");
            System.out.println("Por favor insertar la cantidad que hay de cada producto: ");
            for (int i = 0; i < CantidadProductos.length; i++) {
                System.out.println("");
                System.out.print("Cantidad de unidades de " + NomProductos[i] + ": ");
                CantidadProductos[i] = lector.nextInt();
            }

            System.out.println("Productos que la tienda tiene: ");
            for (int i = 0; i < NomProductos.length; i++) {
                System.out.println("");
                System.out.println(NomProductos[i] + ": su valor es " + PrecioProductos[i] + " y tenemos " + CantidadProductos[i] + " unidades");
            }

            System.out.println("Fin del programa.");
        }
    }
}
