import java.util.Scanner;

public class Madlibsgame {
    public static void main(String[] args){

        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an Adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("enter a Noun (Animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a Verb end with -ing (Action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " amd " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();
    }
}
