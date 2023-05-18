package Taller_4;

import java.util.Scanner;

public class Punto_10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("La asociación de vinicultores tiene como política fijar un precio\n"
                + "inicial al kilo de uva, la cual se clasifica en tipos (A y B), y\n"
                + "además en tamaños (1 y 2). Cuando se realiza la venta del\n"
                + "producto, ésta es de un sólo tipo y tamaño, se requiere\n"
                + "determinar cuanto recibirá un productor por la uva que\n"
                + "entrega en un embarque considerando lo siguiente:\n"
                + "* Si es de tipo A, se le cargan 20 céntimos al precio inicial\n"
                + "cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.\n"
                + "* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño\n"
                + "1, y 50 céntimos cuando es de tamaño 2.");

        try {
            int tamano;
            double precioInicial, precioFinal;
            String tipo;

            System.out.println("Introduce el tipo de uva (A o B):");
            tipo = lector.nextLine();
            System.out.println("Introduce el tamaño de la uva (1 o 2):");
            tamano = lector.nextInt();
            System.out.println("Introduce el precio inicial por kilo de uva:");
            precioInicial = lector.nextDouble();

            precioFinal = precioInicial;
            if (tipo.equalsIgnoreCase("A")) {
                if (tamano == 1) {
                    precioFinal += 0.20;
                } else if (tamano == 2) {
                    precioFinal += 0.30;
                }
            } else if (tipo.equalsIgnoreCase("B")) {
                if (tamano == 1) {
                    precioFinal -= 0.30;
                } else if (tamano == 2) {
                    precioFinal -= 0.50;
                }
            }
            System.out.println("El precio por kilo de uva que recibirá el productor es: " + precioFinal);
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores válidos para el tipo, tamaño y precio de la uva.");
        }
    }
}
