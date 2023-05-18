package co.edu.udes.taller2_p2;

import java.util.Scanner;

public class Punto_2 {

   public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato dd/mm/aaaa:");

        try {
            int day = reader.nextInt();
            int month = reader.nextInt();
            int year = reader.nextInt();

            // Verificar si la fecha es válida
            boolean valid_date = true;
            if (year < 0) {
                valid_date = false;
            } else {
                switch (month) {
                    case 2:
                        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                            if (day < 1 || day > 29) {
                                valid_date = false;
                            }
                        } else {
                            if (day < 1 || day > 28) {
                                valid_date = false;
                            }
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day < 1 || day > 30) {
                            valid_date = false;
                        }
                        break;
                    default:
                        if (day < 1 || day > 31) {
                            valid_date = false;
                        }
                }
            }

            // Si la fecha es válida, calcular los días transcurridos
            if (valid_date) {
                int days_passed = day;
                switch (month - 1) {
                    case 11:
                        days_passed += 30;
                    case 10:
                        days_passed += 31;
                    case 9:
                        days_passed += 30;
                    case 8:
                        days_passed += 31;
                    case 7:
                        days_passed += 31;
                    case 6:
                        days_passed += 30;
                    case 5:
                        days_passed += 31;
                    case 4:
                        days_passed += 30;
                    case 3:
                        days_passed += 31;
                    case 2:
                        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                            days_passed += 29;
                        } else {
                            days_passed += 28;
                        }
                    case 1:
                        days_passed += 31;
                }
                System.out.println("La fecha es válida y han transcurrido " + days_passed + " días en el año.");
            } else {
                System.out.println("La fecha ingresada no es válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa la fecha en el formato correcto (dd/mm/aaaa).");
        }
    }
}
