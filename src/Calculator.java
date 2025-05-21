import java.util.Scanner;
public class Calculator {
    public static void main(String[] ars){

        // Create a Scanner object to read input from the console
        // Prompt the user to enter the first number
        // Read the first number as a double
        // Prompt the user to enter an arithmetic operator
        // Read the operator as a character

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
            if(num2 != 0) {
                result = num1 / num2;
            }
            else {
                System.out.println("Error! Invalid by zero.");
                return;
            }
            break;
            default:
                System.out.println("You enter Invalid operator.");
                return;

        }

        System.out.printf("Result: " + result);

        scanner.close();


    }
}
