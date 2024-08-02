package ejercicio15;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gimnasio gimnasio = new Gimnasio();

        System.out.println("Ingrese el tipo de suscripción (15 días, 30 días, 3 meses):");
        String tipoSuscripcion = scanner.nextLine();

        try {
            int costo = gimnasio.calcularCosto(tipoSuscripcion);
            System.out.println("El costo para " + tipoSuscripcion + " es: $" + costo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
