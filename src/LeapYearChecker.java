import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 ) {
            System.out.print(year + " is a Leap year.");
        }
        else {
            System.out.print(year + " is not a Leap year.");
        }


        scanner.close();
        //promt user
        //if else condition
    }
}
