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
public class Punto3while {

    public static void main(String[] args) {
        System.out.println("3) Pedir nombres (23), precios que ud quiera y cantidad (del 1 al 23) y que con esos datos los impriman.");
        String[] NomProductos = new String[23];
        int[] PrecioProductos = new int[23];
        int[] CantidadProductos = new int[23];
        Scanner lector = new Scanner(System.in);
        int i = 0;

        try {
            while (i < NomProductos.length) {
                System.out.println("");
                System.out.println("Nombre #" + (i + 1));
                NomProductos[i] = lector.nextLine();
                i++;
            }

            System.out.println("");
            System.out.println("Por favor insertar los precios de cada producto: ");
            i = 0;
            while (i < PrecioProductos.length) {
                System.out.println("");
                System.out.print("valor del producto " + NomProductos[i] + ": ");
                try {
                    PrecioProductos[i] = lector.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: El valor ingresado no es válido. Se asignará el precio 0 al producto.");
                    PrecioProductos[i] = 0;
                }
                i++;
            }

            System.out.println("");
            System.out.println("por favor insertar la cantidad que hay de cada producto: ");
            i = 0;
            while (i < PrecioProductos.length) {
                System.out.println("");
                System.out.print("cantidad de unidades de " + NomProductos[i] + ": ");
                CantidadProductos[i] = lector.nextInt();
                i++;
            }

            i = 0;
            System.out.println("Productos que la tienda tiene: ");
            while (i < NomProductos.length) {
                System.out.println("");
                System.out.println(NomProductos[i] + ": su valor es "
                        + PrecioProductos[i] + " y tenemos "
                        + CantidadProductos[i] + " unidades");
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error en la ejecución del programa.");
        }
    }
}
