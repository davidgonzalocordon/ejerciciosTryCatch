package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cans, aux, cotator = 1;
        System.out.println("Inserte el número de latas:");
        
        try {
            cans = reader.nextInt();
            aux = cans;
            
            do {
                if (aux > 0) {
                    aux -= cotator;
                    cotator++;
                }

                if (aux == 0) {
                    System.out.println("No le hacen falta latas para armar una pirámide porque quedó justa.");
                    break;
                } else if (aux < 0) {
                    System.out.println("Le faltan " + (aux * -1) + " latas para poder hacer el siguiente piso.");
                    break;
                }
            } while (aux > 0);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el número de latas.");
        }
    }

}
