package Taller_4;

import java.util.Scanner;

public class Punto_16 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Una compañía de transporte internacional tiene servicio en algunos países de\n"
                + "América del Norte, América Central, América del Sur, Europa y Asia. El costo por\n"
                + "servicio de transporte se basa en el peso del paquete y la zona a la que va\n"
                + "dirigida. Parte de su política implica que los paquetes con un peso superior a\n"
                + "5kg no son transportados, por cuestiones de logística y seguridad.\n"
                + "Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,\n"
                + "en su caso, el rechazo de la entrega.\n"
                + "ZONA UBICACIÓN COSTO/KILOGRAMO\n"
                + "1 América del Norte 24,00 euros\n"
                + "2 América Central 20, 00 euros\n"
                + "3 América del Sur 21,00 euros\n"
                + "4 Europa 10,00 euros\n"
                + "5 Asia 18,00 euros");

        try {
            double peso, costo = 0;
            int destino;
            String lugar = null;
            System.out.println("Inserte el peso del equipaje: ");
            peso = lector.nextDouble();

            if (peso > 5) {
                System.out.println("Su paquete no se puede enviar debido a que pesa 5 o más kilos.");
                System.exit(0);
            }

            System.out.println("Inserte el destino: \n"
                    + "1 América del Norte\n"
                    + "2 América Central\n"
                    + "3 América del Sur\n"
                    + "4 Europa\n"
                    + "5 Asia\n");
            destino = lector.nextInt();

            switch (destino) {
                case 1:
                    costo = peso * 24;
                    lugar = "América del Norte";
                    break;
                case 2:
                    costo = peso * 20;
                    lugar = "América Central";
                    break;
                case 3:
                    costo = peso * 21;
                    lugar = "América del Sur";
                    break;
                case 4:
                    costo = peso * 10;
                    lugar = "Europa";
                    break;
                case 5:
                    costo = peso * 18;
                    lugar = "Asia";
                    break;
            }

            System.out.println("El paquete de " + peso + " kg que tiene como destino " + lugar + ", su valor de envío es " + costo + " Euros.");
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores válidos para el peso y el destino.");
        }
    }
}
