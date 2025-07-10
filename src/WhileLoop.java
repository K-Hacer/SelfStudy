import java.util.Scanner;

public class WhileLoop {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("Q")){
            System.out.println("You are playing a Game");
            System.out.print("Press Q to Quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game.");

    }
}
