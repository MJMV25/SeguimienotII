package ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de modelo de su automóvil:");
        int numeroModelo = scanner.nextInt();

        Automovil automovil = new Automovil();
        if (automovil.esModeloDefectuoso(numeroModelo)) {
            System.out.println("El automóvil está defectuoso, llevar a garantía.");
        } else {
            System.out.println("Su automóvil no está defectuoso.");
        }

        scanner.close();
    }
}