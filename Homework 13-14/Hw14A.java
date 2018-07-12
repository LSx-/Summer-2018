import java.util.Scanner;
/**
 * Write a description of class Hw14A here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw14a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double angle;
        
        //the welcome message
        System.out.println("Welcome to the 2D Matrix Program!");
        System.out.println();
        
        //here we will have the statements to get the inputs
        System.out.println("Please Enter a Number for point X");
        x = scan.nextDouble();
        
        System.out.println("Please Enter a NUmber for point Y");
        y = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the Angle");
        angle = scan.nextDouble();
        
    }
}
