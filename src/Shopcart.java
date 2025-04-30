import java.util.Scanner;

public class Shopcart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        char currency = '$';
        double price;
        double total;

        System.out.print("Enter the item you buy: ");
        item = scanner.nextLine();
        System.out.print("Enter the Price of the Item: ");
        price = scanner.nextDouble();
        System.out.print("Enter the Quantity of the Item: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println(total);

        System.out.println("You purchase a " + item);
        System.out.println("total of the item is $ " + total);

        System.out.println("Thankyou and Come again!");

        scanner.close();
    }
}
