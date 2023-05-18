package Arrays;

import java.util.Scanner;

public class Punto_3 {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que pida 20 números enteros. Estos números se deben\n"
                + "introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas\n"
                + "parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La\n"
                + "suma total debe aparecer en la esquina inferior derecha.");

        try {
            int[][] numeros = new int[4][5];
            int[] SumaFila = new int[4];
            int[] SumaColumna = new int[5];
            int SumaTotal = 0;
            
            for (int fila = 0; fila < 4; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print("Inserte el número para la fila " + (fila + 1) + " y columna " + (columna + 1) + ": ");
                    numeros[fila][columna] = lector.nextInt();
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(numeros[i][j] + "\t");
                    SumaFila[i] += numeros[i][j];
                    SumaTotal += numeros[i][j];
                }
                System.out.println("Suma fila " + (i + 1) + "= " + SumaFila[i]);
            }

            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 4; i++) {
                    SumaColumna[j] += numeros[i][j];
                }
                System.out.print("Suma columna " + (j + 1) + "= " + SumaColumna[j] + "\t");
            }

            System.out.println("");
            System.out.println("Sumatoria total= " + SumaTotal);
        } catch (Exception e) {
            System.out.println("Error: Ingresa solo números enteros.");
        }
    }

}
