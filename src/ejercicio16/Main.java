package ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer ángulo del triángulo:");
        int angulo1 = scanner.nextInt();

        System.out.println("Ingrese el segundo ángulo del triángulo:");
        int angulo2 = scanner.nextInt();

        System.out.println("Ingrese el tercer ángulo del triángulo:");
        int angulo3 = scanner.nextInt();

        Triangulo triangulo = new Triangulo();
        boolean esValido = triangulo.esTrianguloValido(angulo1, angulo2, angulo3);

        if (esValido) {
            System.out.println("Los ángulos ingresados forman un triángulo válido.");
        } else {
            System.out.println("Los ángulos ingresados no forman un triángulo válido.");
        }

        scanner.close();
    }
}
