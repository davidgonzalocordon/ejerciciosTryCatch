package Taller_4;

import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.");

        try {
            int dia;
            System.out.println("Inserte un número del 1 al 7: ");
            dia = lector.nextInt();

            while (dia <= 0 || dia >= 8) {
                System.out.println("ERROR: Número incorrecto");
                System.out.println("Escriba un número del 1 al 7 por favor: ");
                dia = lector.nextInt();
            }

            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Hoy es viernes y el cuerpo lo sabe");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo (mañana hay clase)");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido.");
        }
    }

}
