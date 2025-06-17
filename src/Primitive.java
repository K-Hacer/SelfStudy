import java.awt.*;

public class Primitive {
    public static void main(String[] args){
        // This line is Contain with Primitive Data types
       byte x = 1;
        byte y = 1;
        x = 2;
        System.out.println(y);
// Y is not change the value because it is completely independence of each other


        // This Line is example of reference Data types
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 5;
        // point2 doesnt store acutal value they store a reference  to object in somewhere in the memory
        System.out.println(point2);


        String message = "Hello Jm!!";
        System.out.println(message.startsWith(message));


    }
}
