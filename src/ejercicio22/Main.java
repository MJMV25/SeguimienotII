package ejercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameOf21 game = new GameOf21();

        System.out.println("Welcome to the Game of 21!");
        System.out.println("Your initial score: " + game.getUserScore());

        String choice;
        do {
            System.out.println("Do you want to draw another card? (Enter 'A' for yes, 'N' for no):");
            choice = scanner.nextLine().toUpperCase();
            if (choice.equals("A")) {
                game.userDrawCard();
                System.out.println("Your new score: " + game.getUserScore());
            }
        } while (choice.equals("A") && game.getUserScore() <= 21);

        if (game.getUserScore() <= 21) {
            System.out.println("Your final score: " + game.getUserScore());
            System.out.println("Computer is drawing cards...");
            while (game.getComputerScore() < 17) {
                game.computerDrawCard();
            }
            System.out.println("Computer's final score: " + game.getComputerScore());
        }

        System.out.println(game.determineWinner());

        scanner.close();
    }
}
