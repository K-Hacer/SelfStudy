import java.util.Scanner;

public class Mysecondclass {
    public static void main(String[] args){
    // calculate of te area of rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height = scanner.nextDouble();

        System.out.println("The Width is " + width);

        area = width * height;

        System.out.println("The total of Area is " + area + "cm");
    }
}