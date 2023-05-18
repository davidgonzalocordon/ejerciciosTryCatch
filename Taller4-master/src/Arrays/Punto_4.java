package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        try {
            Scanner lector = new Scanner(System.in);
            System.out.println("Modifica el programa anterior de tal forma que los números que se introducen "
                    + "en el array se generen de forma aleatoria (valores entre 100 y 999).");
            int[][] numeros = new int[4][5];
            int[] SumaFila = new int[4];
            int[] SumaColumna = new int[5];
            Random num = new Random();
            int SumaTotal = 0;

            for (int fila = 0; fila < 4; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    numeros[fila][columna] = num.nextInt(900) + 100;
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(numeros[i][j] + "\t");
                    SumaFila[i] += numeros[i][j];
                    SumaTotal += numeros[i][j];
                }
                System.out.println("suma fila " + (i + 1) + "= " + SumaFila[i]);
            }
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 4; i++) {
                    SumaColumna[j] += numeros[i][j];
                }
                System.out.print("suma columna " + (j + 1) + "= " + SumaColumna[j] + "\t");
            }
            System.out.println("");
            System.out.println("sumatoria total= " + SumaTotal);
        } catch (Exception e) {
            System.out.println("Error: Ocurrió un problema en la ejecución del programa.");
        }
    }

}
