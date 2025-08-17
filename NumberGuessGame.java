import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;  // Track user score
        int round = 0;       // Track number of rounds played

        System.out.println("Welcome to the Number Guessing Challengse!");
        System.out.println("Rules: Guess a number between 1 to 100. You have 7 chances per round.\n");

        boolean keepPlaying = true;

        while (keepPlaying) {
            round++;
            int secretNumber = random.nextInt(100) + 1; // Generate random number
            int chancesUsed = 0;
            int maxChances = 7;
            boolean isGuessed = false;

            System.out.println("Round " + round + " has started!");
            
            while (chancesUsed < maxChances) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                chancesUsed++;

                if (userGuess == secretNumber) {
                    System.out.println("Great! You guessed the number in " + chancesUsed + " attempts.");
                    totalScore++;
                    isGuessed = true;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!isGuessed) {
                System.out.println("Sorry, you ran out of chances. The correct number was: " + secretNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            keepPlaying = input.next().trim().equalsIgnoreCase("yes");
        }

        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + round);
        System.out.println("Your Final Score: " + totalScore);
        
        input.close();
    }
}

