import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("                                    \t\t\t\t\tStudent Information");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = scanner.nextLine();

        System.out.print("Enter your Course & Section:  ");
        String course = scanner.nextLine();

        System.out.print("Enter your gender:  ");
        String gender = scanner.nextLine();

        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("HELLO, " + name);
        System.out.println("From "  + course + " Program");
        System.out.println("your age is " + age);
        System.out.println("and you are a " + gender);
        System.out.println("Your GPA is " + gpa);
        scanner.close();
    }
}