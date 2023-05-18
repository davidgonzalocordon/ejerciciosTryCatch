package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_8 {

    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);

        try {
            int num_subject, y, num_month, year, x, big, small;
            String nbig = "", nsmall = "";
            System.out.println("inserte la cantidad de asignaturas: ");
            num_subject = Reader.nextInt();
            y = num_subject + 1;
            System.out.println("inserte la cantidad de meses que estudio: ");
            num_month = Reader.nextInt();
            num_month += 1;

            String date[][] = new String[y][num_month];
            int vec1[] = new int[y];
            int monthTotal[] = new int[num_month];

            for (int i = 0; i < y; i++) {
                if (i != 0) {
                    System.out.println("\nIngrese las horas de la asignatura #" + i);
                }
                for (int h = 0; h < num_month; h++) {
                    if (i == 0 && h == 0) {
                        date[i][h] = "X Asignatura";
                        continue;
                    }
                    if (i == 0) {
                        date[i][h] = "mes " + h;
                        continue;
                    }
                    if (h == 0) {
                        System.out.println("Ingrese el nombre de la asignatura");
                        date[i][h] = Reader.next();
                        continue;
                    }
                    System.out.print("Mes #" + h + ": ");
                    String value = Reader.next();
                    date[i][h] = value;
                    monthTotal[h] += Integer.parseInt(value);
                }
            }

            System.out.print("\nSumatoria mensual de horas de estudio:");
            for (int h = 1; h < num_month; h++) {
                System.out.print(" " + monthTotal[h]);
            }
            System.out.println();

            System.out.println("\nSu candelario de estudio se ve graficamente asi");
            for (String[] i : date) {
                for (String j : i) {
                    System.out.print("[" + j + "]");
                }
                System.out.println("");
            }
            x = 0;
            year = 0;

            for (int i = 0; i < y; i++) {
                if (i == 0) {
                    continue;
                }
                for (int h = 0; h < num_month; h++) {
                    if (h == 0) {
                        continue;
                    }
                    x = Integer.parseInt(date[i][h]);
                    year += x;
                    vec1[i] = year;
                }
                System.out.println("\nla cantidad de horas al año que le dedico a la asignatura #" + (i) + " fue de " + year);
                year = 0;
            }
            big = 0;
            small = 999;
            for (int i = 0; i < vec1.length; i++) {
                if (i == 0) {
                    continue;
                }
                if (vec1[i] > big) {
                    big = vec1[i];
                    nbig = date[i][0];
                } else if (vec1[i - 1] > big) {
                    big = vec1[i - 1];
                    nbig = date[i][0];
                }

                if (vec1[i] < small) {
                    small = vec1[i];
                    nsmall = date[i][0];
                }
            }

            // Mostrar la sumatoria de horas mensuales
            System.out.println("\nSumatoria de horas mensuales:");
            for (int h = 1; h < num_month; h++) {
                int sumMonth = 0;
                for (int i = 1; i < y; i++) {
                    sumMonth += Integer.parseInt(date[i][h]);
                }
                System.out.println("Mes " + h + ": " + sumMonth + " horas");
            }
            System.out.println("\nLa asignatura con más horas de estudio fue " + nbig + " con " + big + " horas");
            System.out.println("\nLa asignatura con menos horas de estudio fue " + nsmall + " con " + small + " horas");
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para las cantidades de asignaturas y meses.");
        }
    }

}
