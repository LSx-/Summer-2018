import java.util.Scanner;
/**
 * in this project we will make the user input a length (d) and a angle (Theta)
 * and with that information we will calulate and print the information needed
 * to let the user know what there Vector is
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw2a
{
    public static void main(String args[])
    {
        //the scanner and the Variables 
        Scanner s = new Scanner(System.in);
        double length; //this = d
        double degrees;  //this = O with the line threw it (Theta)
        double vX;
        double vY;
        double rad;

        //here we have the welcome message!
        System.out.println("Welcome to Hw2A");
        System.out.println("Please provide the data need");
        System.out.println("so we can give you a vector from you data!");
        System.out.println();
        //posting statements and taking the inputs and 
        //plugging them into the variables
        System.out.println("Please Enter a Number for the length");
        length = s.nextDouble();
        System.out.println();

        System.out.println("Please Enter a Number for the Angle (Degrees)");
        degrees = s.nextDouble();
        System.out.println();

        s.close();

        //here we will take the angle which is in degress and convert it to rad
        rad = degrees * ((2*Math.PI)/360);

        //here we will take the length and the rad and get the Vectors
        vX = length * Math.cos(rad);
        vY = length * Math.sin(rad);

        /*
         * here we have the code for testing, it was to make sure everything
         * worked out well, if you would like to see this code working
         * then uncomment it :D 
        //a test run for see what the rad is 
        System.out.println(rad); 

        //her we will do the converstion to make sure the answer was actually 
        //correct
        double v1 = vX * vX;
        double v2 = vY * vY;
        double d = v1 + v2;
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("(should = around 36) d: " + d);
         */

        //here we will print it all out!
        System.out.println("Your Vector is: <" + vX + "," + vY + ">");
        System.out.println();

        
    }
}
