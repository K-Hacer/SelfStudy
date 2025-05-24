import java.sql.SQLOutput;
import java.util.Scanner;
/*This Code is Contain user input user for student information
using import java.util packages to allow te user to input to the system.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;


        System.out.println("                                    \t\t\t\t\tStudent Information");

        System.out.print("Enter your name:  ");
        name = scanner.nextLine();

        System.out.print("Enter your Course & Section:  ");
        String course = scanner.nextLine();

        System.out.print("Enter your gender:  ");
        String gender = scanner.nextLine();

        System.out.print("Enter your age:  ");
        age = scanner.nextInt();


        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you student (true/false): ");
        boolean isStudent = scanner.hasNextBoolean();
        if (isStudent){
            System.out.println("Your are a Student");
        }

        else{
            System.out.println("You are Not a Student");
        }
        System.out.println("HELLO, " + name);
        System.out.println("From "  + course + " Program");
        System.out.println("your age is " + age);
        System.out.println("and you are a " + gender);
        System.out.println("Your GPA is " + gpa);

        if(name.isEmpty()) {
            System.out.println("You did not enter your name! 🥹");
        }

        else{
            System.out.println("Hello" + name);
        }
        if(course.isEmpty()){
            System.out.println("Please enter your course! 😒");
        }
        else{
            System.out.println("You are a" + course);
        }


        scanner.close();
    }
}