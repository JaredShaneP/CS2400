import java.util.Scanner;
import javax.script.ScriptContext;

public class CircleArea
{
public static void main(String[] args)
     {
       
Scanner keyboard = new Scanner(System.in);
double radius;
System.out.print("Enter the radius? ");
radius = keyboard.nextDouble();
System.out.print("Area of a circle with radius " + radius + " is " + (Math.PI * radius * radius) + ".");
       
    }
}
