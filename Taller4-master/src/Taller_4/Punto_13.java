package Taller_4;

import java.util.Scanner;

public class Punto_13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida por teclado el resultado (dato\n"
                + "entero) obtenido al lanzar un dado de seis caras y muestre por\n"
                + "pantalla el número en letras (dato cadena) de la cara opuesta al\n"
                + "resultado obtenido.\n"
                + "Nota1: En las caras opuestas de un dado de seis caras están los\n"
                + "números: 1-6, 2-5 y 3-4.\n"
                + "Nota 2: Si el número del dado introducido es menor que 1 o mayor\n"
                + "que 6, se mostrará el mensaje: «ERROR: número incorrecto».");
        
        try {
            int numero;
            System.out.println("Inserte el número que salió en el dado: ");
            numero = lector.nextInt();
            
            while (numero <= 0 || numero >= 7) {
                System.out.println("ERROR: número incorrecto");
                System.out.println("Escriba un número del 1 al 6, por favor: ");
                numero = lector.nextInt();
            }
            
            switch (numero) {
                case 1:
                    System.out.println("Seis");
                    break;
                case 2:
                    System.out.println("Cinco");
                    break;
                case 3:
                    System.out.println("Cuatro");
                    break;
                case 4:
                    System.out.println("Tres");
                    break;
                case 5:
                    System.out.println("Dos");
                    break;
                case 6:
                    System.out.println("Uno");
                    break;
            }
        } catch (Exception e) {
            System.out.println("ERROR: Ingresa un número válido.");
        }
    }

}
