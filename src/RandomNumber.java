import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // random number between 1-100
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess (1-100): ");
//What does scanner.hasNextInt() do?
//It checks if the next input token entered by the user is an integer
            if(scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if(guess < 1 || guess > 100){
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if(guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                }

            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // discard invalid input
            }
        }

        scanner.close();
    }
}
