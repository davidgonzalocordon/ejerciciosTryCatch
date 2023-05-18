package Bucles;

import java.util.Scanner;

public class Punto_7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó\n"
                + "10 €,el segundo 20 €, el tercero 40 € y así sucesivamente.\n"
                + "Realizar un programa para determinar cuánto debe pagar mensualmente y el\n"
                + "total de lo que pagará después de los 20 meses.\n"
                + "Este programa puede servir para calcular otras compras y con diferentes plazos.");
        
        try {
            System.out.println("Inserte a cuántos meses va a pagar el producto: ");
            int[] PreciosPorPagar = new int[lector.nextInt()];
            
            System.out.println("Introduzca el valor a pagar en el primer mes: ");
            PreciosPorPagar[0] = lector.nextInt();
            int SumatoriaPagos = PreciosPorPagar[0];

            for (int i = 1; i < PreciosPorPagar.length; i++) {
                PreciosPorPagar[i] = PreciosPorPagar[i - 1] * 2;
                SumatoriaPagos += PreciosPorPagar[i];
            }
            
            for (int i = 0; i < PreciosPorPagar.length; i++) {
                System.out.println("Valor a pagar en el mes " + (i + 1) + " es de " + PreciosPorPagar[i] + "€");
            }
            
            System.out.println("El total que habrá pagado en el mes " + PreciosPorPagar.length + " será de " + SumatoriaPagos + "€");
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para los meses y el primer pago.");
        }
    }
}
