package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_1 {

   public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        System.out.println("Inserta los segundos");

        try {
            int seg = Lector.nextInt();
            int min = 0, horas24 = 0, horas12 = 0, dias = 0;

            if (seg >= 60) {
                min = (seg / 60);
                seg = seg % 60;
            }

            if (min >= 60) {
                horas24 = min / 60;
                min = min % 60;
            }

            if (horas24 > 12) {
                horas12 = horas24 - 12;
            } else {
                horas12 = horas24;
            }

            if (horas24 > 24) {
                dias = horas24 / 24;
                horas24 = horas24 % 24;
            }

            System.out.println("Dias: " + dias + " Horas: " + horas12 + " Min: " + min + " Seg: " + seg);
            System.out.println("Dias: " + dias + " Horas: " + horas24 + " Min: " + min + " Seg: " + seg);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para los segundos.");
        }
    }
}
