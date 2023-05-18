package Taller_4;

import java.util.Scanner;

public class Punto_12 {

     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("La política de cobro de una compañía telefónica es:\n"
                + "Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma\n"
                + "que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los\n"
                + "siguientes dos minutos a 70 céntimos y a partir del décimo minuto, 50 céntimos.\n"
                + "Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de\n"
                + "mañana 15% y en turno de tarde 10%.\n"
                + "Realice un algoritmo para determinar cuánto debe pagar por cada concepto una\n"
                + "persona que realiza una llamada.");
        int duracion, dia, turno;
        double costo = 0, impuesto = 0;

        try {
            System.out.println("Duración de la llamada en minutos: ");
            duracion = lector.nextInt();
            System.out.println("Día de la semana (1=domingo, 2=lunes, 3=martes, 4=miercoles, 5=jueves, 6=viernes, 7=sábado): ");
            dia = lector.nextInt();
            System.out.println("Turno del día (1=mañana, 2=tarde, 3=noche): ");
            turno = lector.nextInt();

            if (duracion <= 5) {
                costo = duracion * 0.2;
            }
            if (duracion <= 8) {
                costo = 5 * 0.2 + (duracion - 5) * 0.8;
            }
            if (duracion <= 10) {
                costo = 5 * 0.2 + 3 * 0.8 + (duracion - 8) * 0.7;
            } else {
                costo = 5 * 0.2 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
            }

            if (dia == 1) {
                impuesto = costo * 0.03;
            } else {
                if (turno == 1) {
                    impuesto = costo * 0.15;
                }
                if (turno == 2) {
                    impuesto = costo * 0.1;
                }
            }
            System.out.println("La llamada tiene un valor de " + costo + " euros con un impuesto aplicado de " + impuesto + " euros, por lo tanto debe pagar " + (costo + impuesto) + " euros.");
        } catch (Exception e) {
            System.out.println("Error: Ingresa un valor numérico válido para la duración, día y turno.");
        }
    }

}
