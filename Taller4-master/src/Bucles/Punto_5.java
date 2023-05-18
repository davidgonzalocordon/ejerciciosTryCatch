package Bucles;

import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que pida el límite inferior y superior de un intervalo. Si el\n"
                + "límite inferior es mayor que el superior lo tiene que volver a pedir. A\n"
                + "continuación se van introduciendo números hasta que introduzcamos el 0.\n"
                + "Cuando termine el programa dará las siguientes informaciones:\n"
                + "• La suma de los números que están dentro del intervalo (intervalo abierto).\n"
                + "• Cuántos números están fuera del intervalo.\n"
                + "• Informa si hemos introducido algún número igual a los límites del intervalo.");

        try {
            int LimiteSuperior = 0, LimiteInferior = 0, Aux, NumerosFueraDelIntervalo = 0, SumaNumerosDentroDelIntervalo = 0,
                    IgualesLimiteInferior = 0, IgualesLimiteSuperior = 0;

            do {
                System.out.println("Introduce el valor del límite inferior: ");
                LimiteInferior = lector.nextInt();
                System.out.println("Introduce el valor del límite superior: ");
                LimiteSuperior = lector.nextInt();
                if (LimiteInferior >= LimiteSuperior) {
                    System.out.println("El límite inferior es mayor que el límite superior, por favor introdúcelos de nuevo.");
                }
            } while (LimiteInferior >= LimiteSuperior);

            while (true) {
                System.out.println("Introduce un número: ");
                Aux = lector.nextInt();
                if (Aux == 0) {
                    break;
                }
                if (Aux > LimiteSuperior || Aux < LimiteInferior) {
                    NumerosFueraDelIntervalo++;
                }

                if (Aux <= LimiteSuperior || Aux >= LimiteInferior) {
                    SumaNumerosDentroDelIntervalo += Aux;
                }
                if (Aux == LimiteInferior) {
                    IgualesLimiteInferior++;
                }
                if (Aux == LimiteSuperior) {
                    IgualesLimiteSuperior++;
                }
                Aux = 0;
            }

            System.out.println(NumerosFueraDelIntervalo + " son los números que están fuera del intervalo.");
            System.out.println("El resultado de la suma de todos los números que estaban dentro del intervalo es " + SumaNumerosDentroDelIntervalo + ".");
            if (IgualesLimiteInferior > 0 || IgualesLimiteSuperior > 0) {
                System.out.println("La cantidad de números iguales al límite inferior es " + IgualesLimiteInferior + ".");
                System.out.println("La cantidad de números iguales al límite superior es " + IgualesLimiteSuperior + ".");
            } else {
                System.out.println("No hay ningún número igual a uno de los límites.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos.");
        }
    }

}
