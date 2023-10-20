
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;
            
            if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfGuesses + " attempts.");
            }
        }
        
        scanner.close();
    }
}