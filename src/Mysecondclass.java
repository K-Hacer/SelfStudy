import java.util.Scanner;

public class Mysecondclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Hello " + name);
        System.out.print("\tYour age is " + age);
        scanner.close();
    }
}
