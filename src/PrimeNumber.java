import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number to check if it's prime: ");
            number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
                break; // exit the loop once a prime number is entered
            } else {
                System.out.println(number + " is not a prime number. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
