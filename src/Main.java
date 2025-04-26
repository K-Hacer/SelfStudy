import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // Declarationn and Assignment
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Hello" + " " + name);
        System.out.print("\tYour age is" + " " + age);



        scanner.close();
    }
}
