import java.util.Scanner;
/**
 * Hw4b is a program that will take inputs from a user via a Scanner.
 * once the user inputs the Vector (s1,s2) and a point (p1,p2),
 * we will then ask them to input the a point(r1,r2) that they would like to check for!
 *
 * after all the inputs the program will then calculate it
 * T will only go up to 10 (from 0)
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw4b
{
    public static void main(String args[])
    {
        //setting up the variables and the scanner
        Scanner scan = new Scanner(System.in);
        double s1; //this is x of the S vector
        double s2; //this is y of the S vector
        double p1; //this is x of the P point
        double p2; //this is y of the P point
        double r1; //this is x when we do a check to see if its on the line
        double r2; //this is y when we do a check to see if its on the line

        //a title println!
        System.out.println("Welcome to the 'Point on a line' Checking program");

        //normal statement and input stuff
        System.out.println("Please Enter a Number for Delta X");
        s1 = scan.nextDouble();

        System.out.println("Please Enter a Number for Delta Y");
        s2 = scan.nextDouble();

        System.out.println("Please Enter a Number for Point X");
        p1 = scan.nextDouble();

        System.out.println("Please Enter a Number for Point Y");
        p2 = scan.nextDouble();

        System.out.println("Please Enter a Number for the X that is being checked");
        r1 = scan.nextDouble();

        System.out.println("Please Enter a Number for the Y that is being checked");
        r2 = scan.nextDouble();

        scan.close();

        //statements to let the user know what they inputed into the L(t) and what point they want to check
        System.out.println();
        System.out.println("you inputed");
        System.out.println("L(t) = <" + s1 + "," + s2 + ">t + (" + p1 + "," + p2 + ")");
        System.out.println("So now we need to check if (" + r1 + "," + r2 + ") is on the line");
        System.out.println();
        System.out.println("WARNING: the T value will only go from 0 - 10");
        System.out.println();

        //time to calculate 
        for(int i = 0; i < 1; i++)
        {
            double xResult = 0;
            double yResult = 0;
            for(int t = 0; t <= 10; t++)
            {

                double x = (s1 * t) + p1;  //the answer for X
                double y = (s2 * t) + p2;  //the answer for Y

                if(x == r1 && y == r2)
                {
                    xResult = r1;
                    yResult = r2;
                }
                else
                {

                }

            }
            if( xResult == r1 && yResult == r2)
            {
                System.out.println("Yes! the point (" + r1 + "," + r2 + ") is on the line.");
                System.out.println();
            }
            else
            {
                System.out.println("No, Sadly the point (" + r1 + "," + r2 + ") is not the line.");
                System.out.println();
            }
        }
    } 
}
