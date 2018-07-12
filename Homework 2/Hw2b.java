import java.util.Scanner;
/**
 * In this program we will be taking information from the user, the information
 * that will be taken is Delta x and Delta y( or v1 and v2). and with that
 * information we will be giving back the user the length (d) and the angle (Theta)
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw2b
{
    public static void main(String args[])
    {
        //here we have the scanner named 's' and all the defined variables
        Scanner s = new Scanner(System.in);
        double vX;
        double vY;
        double d;
        double rad;
        double degrees;
        
        //here we have the welcome message!
        System.out.println("Welcome to Hw2B.");
        System.out.println("Please provide the right data to print out");
        System.out.println("the length and the angle!");
        System.out.println();
        
        //here we take the inputs given from the statement
        System.out.println("Please Enter a Number for delta X");
        vX = s.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for delta Y");
        vY = s.nextDouble();
        System.out.println();
        
        s.close();
        
        //getting the rad here by taking the delta X and Y information inputed
        rad = Math.atan2(vY,vX);
        
        //converting the rad to degrees for the user
        degrees = rad * (360/(2*Math.PI));
    
        //getting the distance (aka d)
        double v1 = vX * vX;
        double v2 = vY * vY;
        d = Math.sqrt(v1 + v2);
        
        //output it here
        System.out.println("Your Length is: " + d);
        System.out.println("Your angle is: " + degrees + " Degrees");
        System.out.println();
        
    }
}
