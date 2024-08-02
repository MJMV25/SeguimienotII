package ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("La computadora emite un pitido al iniciarse? (si/no):");
        String pitidoRespuesta = scanner.nextLine();
        boolean emitePitido = pitidoRespuesta.equalsIgnoreCase("si");

        System.out.println("El disco duro gira? (si/no):");
        String discoRespuesta = scanner.nextLine();
        boolean discoGira = discoRespuesta.equalsIgnoreCase("si");

        Computadora computadora = new Computadora();
        String estado = computadora.determinarEstado(emitePitido, discoGira);

        System.out.println(estado);

        scanner.close();
    }
}

