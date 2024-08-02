package ejercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del sándwich (pequeño o grande):");
        String size = scanner.nextLine();

        System.out.println("¿Desea agregar tocineta? (true/false):");
        boolean hasBacon = scanner.nextBoolean();

        System.out.println("¿Desea agregar jalapeño? (true/false):");
        boolean hasJalapeno = scanner.nextBoolean();

        System.out.println("¿Desea agregar pavo? (true/false):");
        boolean hasTurkey = scanner.nextBoolean();

        System.out.println("¿Desea agregar queso? (true/false):");
        boolean hasCheese = scanner.nextBoolean();

        SandwichOrder order = new SandwichOrder(size, hasBacon, hasJalapeno, hasTurkey, hasCheese);

        try {
            int totalCost = order.calculateTotal();
            System.out.println("El costo total del sándwich es: $" + totalCost);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
