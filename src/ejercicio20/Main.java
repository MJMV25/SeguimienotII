package ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su operador (Tigo, Claro, Movistar):");
        String operador = scanner.nextLine();

        System.out.println("Ingrese la cantidad de minutos internacionales consumidos:");
        int minutosInternacionales = scanner.nextInt();

        try {
            Celumovil celuMovil = new Celumovil( operador,  minutosInternacionales);
            int costoTotal = celuMovil.calcularCosto();
            System.out.println("El costo total es: $" + costoTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

