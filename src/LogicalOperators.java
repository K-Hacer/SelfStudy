import java.util.Scanner;

public class LogicalOperators {
    public static void main(String rgs []){

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscore.");
        }
        else{
            System.out.println("Welcome " + username);
        }

            scanner.close();
    }
}
