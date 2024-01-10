import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min, max;

        System.out.println("Enter min:");
        min = scanner.nextInt();

        System.out.println("Enter max:");
        max = scanner.nextInt();

        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guessedNumber = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + min + " and " + max + ". Try to guess it.");

        while (guessedNumber != randomNumber) {
            System.out.print("Enter your guess: ");
            guessedNumber = scanner.nextInt();
            attempts++;

            if (guessedNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
