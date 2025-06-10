import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] studentNames = {"Mark", "Dave", "Cymie", "Jm", "Jovic", "Jomar", "James", "John Mark"};

        System.out.print("Enter a Name: ");
        String inputName = scan.nextLine();

        boolean found = false;

        for (String name : studentNames) {
            if (name.equalsIgnoreCase(inputName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(inputName + " is in the list.");
        } else {
            System.out.println(inputName + " is not in the list.");
        }

        scan.close();
    }
}
