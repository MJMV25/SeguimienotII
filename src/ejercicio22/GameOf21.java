package ejercicio22;

import java.util.Random;

public class GameOf21 {
    private Random random;
    private int userScore;
    private int computerScore;

    public GameOf21() {
        random = new Random();
        userScore = 0;
        computerScore = 0;
        dealInitialCards();
    }

    private void dealInitialCards() {
        userScore += drawCard() + drawCard();
        computerScore += drawCard() + drawCard();
    }

    public void userDrawCard() {
        userScore += drawCard();
    }

    public void computerDrawCard() {
        computerScore += drawCard();
    }

    private int drawCard() {
        return random.nextInt(10) + 1;
    }

    public int getUserScore() {
        return userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public String determineWinner() {
        if (userScore > 21) {
            return (computerScore <= 21) ? "Computer wins!" : "No one wins.";
        } else if (computerScore > 21) {
            return "User wins!";
        } else if (userScore > computerScore) {
            return "User wins!";
        } else if (userScore < computerScore) {
            return "Computer wins!";
        } else {
            return "It's a tie!";
        }
    }
}
