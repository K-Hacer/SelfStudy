import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to celcius or farenheit ( C or F ): ");
        unit = scanner.next().toUpperCase();

       // (Condition ) ? True : False
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}
