package Bucles;

import java.util.Scanner;

public class Punto_6 {

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.");
        
        while (true) {
            try {
                double base, resultado;
                int exponente;
                String aux;
                
                System.out.println("Introduce la base que se va a usar para la potenciación: ");
                base = lector.nextDouble();
                System.out.println("Introduce el exponente que se va a usar en la potencia: ");
                exponente = lector.nextInt();

                resultado = 1;
                for (int i = 0; i < exponente; i++) {
                    resultado *= base;
                }
                System.out.println("El número " + base + " elevado a " + exponente + " da como resultado " + resultado);
                
                System.out.println("¿Desea ingresar otro par de números? (s/n)");
                aux = lector.next();
                if (aux.equals("n")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa valores numéricos válidos.");
                lector.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}
