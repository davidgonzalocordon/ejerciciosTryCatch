/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2_programacion.Punto3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Punto3DoWhile {

    public static void main(String[] args) {
        try {
            System.out.println("3) Pedir nombres (23), precios que ud quiera y cantidad (del 1 al 23) y que con esos datos los impriman.");
            String[] NomProductos = new String[23];
            int[] PrecioProductos = new int[23];
            int[] CantidadProductos = new int[23];
            Scanner lector = new Scanner(System.in);
            int i = 0;
            do {
                System.out.println("");
                System.out.println("Nombre #" + (i + 1));
                NomProductos[i] = lector.nextLine();
                i++;
            } while (i < NomProductos.length);
            System.out.println("");
            System.out.println("Por favor insertar los precios de cada producto: ");
            i = 0;
            do {
                try {
                    System.out.println("");
                    System.out.print("Valor del producto " + NomProductos[i] + ": ");
                    PrecioProductos[i] = lector.nextInt();
                    i++;
                } catch (Exception e) {
                    System.out.println("Error: Valor inválido. Por favor, ingrese un número entero.");
                    lector.nextLine(); // Limpiar el búfer del escáner
                }
            } while (i < PrecioProductos.length);

            System.out.println("");
            System.out.println("Por favor insertar la cantidad que hay de cada producto: ");
            i = 0;
            do {
                try {
                    System.out.println("");
                    System.out.print("Cantidad de unidades de " + NomProductos[i] + ": ");
                    CantidadProductos[i] = lector.nextInt();
                    i++;
                } catch (Exception e) {
                    System.out.println("Error: Valor inválido. Por favor, ingrese un número entero.");
                    lector.nextLine(); // Limpiar el búfer del escáner
                }
            } while (i < CantidadProductos.length);

            i = 0;
            System.out.println("Productos que la tienda tiene: ");
            do {
                System.out.println("");
                System.out.println(NomProductos[i] + ": su valor es "
                        + PrecioProductos[i] + " y tenemos "
                        + CantidadProductos[i] + " unidades");
                i++;
            } while (i < CantidadProductos.length);

            System.out.println("do while");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la ejecución del programa.");
        }
    }
}
