package co.edu.udes.taller2_p2;

import java.util.Arrays;
import java.util.Scanner;

public class Punto_7 {

   public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        int size_vec1, size_vec2;

        try {
            System.out.print("Ingrese el tamaño del primer vector: ");
            size_vec1 = Reader.nextInt();
            int[] vector1 = new int[size_vec1];

            System.out.println("Ingrese los elementos del primer vector: ");
            for (int i = 0; i < size_vec1; i++) {
                vector1[i] = Reader.nextInt();
            }

            System.out.print("Ingrese el tamaño del segundo vector: ");
            size_vec2 = Reader.nextInt();
            int[] vector2 = new int[size_vec2];

            System.out.println("Ingrese los elementos del segundo vector: ");
            for (int i = 0; i < size_vec2; i++) {
                vector2[i] = Reader.nextInt();
            }

            int[] mergedVector = mergeVectors(vector1, vector2);
            int[] mergedVectorDesc = mergeVectorsDesc(vector1, vector2);

            System.out.println("El vector resultante ordenado ascendentemente es: " + Arrays.toString(mergedVector));
            System.out.println("El vector resultante ordenado descendentemente es: " + Arrays.toString(mergedVectorDesc));
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para el tamaño y los elementos de los vectores.");
        }
    }

    public static int[] mergeVectors(int[] vector1, int[] vector2) {
        int[] mergedVector = new int[vector1.length + vector2.length];
        int i = 0, j = 0, k = 0;

        while (i < vector1.length && j < vector2.length) {
            if (vector1[i] < vector2[j]) {
                mergedVector[k++] = vector1[i++];
            } else {
                mergedVector[k++] = vector2[j++];
            }
        }

        while (i < vector1.length) {
            mergedVector[k++] = vector1[i++];
        }

        while (j < vector2.length) {
            mergedVector[k++] = vector2[j++];
        }

        return mergedVector;
    }

    public static int[] mergeVectorsDesc(int[] vector1, int[] vector2) {
        int[] mergedVectorDesc = mergeVectors(vector1, vector2);
        int temp;

        for (int i = 0; i < mergedVectorDesc.length / 2; i++) {
            temp = mergedVectorDesc[i];
            mergedVectorDesc[i] = mergedVectorDesc[mergedVectorDesc.length - i - 1];
            mergedVectorDesc[mergedVectorDesc.length - i - 1] = temp;
        }

        return mergedVectorDesc;
    }

}
