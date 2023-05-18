package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un programa que pida 10 números por teclado y que luego muestre los\n"
                + "números introducidos junto con las palabras “máximo” y “mínimo” al lado del\n"
                + "máximo y del mínimo respectivamente.");

        try {
            List<Integer> Numeros = new ArrayList<Integer>();

            System.out.println("Inserta los números.");
            for (int i = 0; i <= 9; i++) {
                System.out.print("Posición #" + (i + 1) + ": ");
                Numeros.add(lector.nextInt());
            }

            for (int i = 0; i <= 9; i++) {
                System.out.print(Numeros.get(i));
                if (i == 0) {
                    System.out.print(" mínimo");
                }
                if (i == 9) {
                    System.out.print(" máximo");
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa valores numéricos válidos.");
        }
    }

}
