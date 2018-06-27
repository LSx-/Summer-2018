import java.util.Scanner;
/**
 * This Program will be used to run 3D
 * Pythagoream Theorm. This will take inputs
 * via a Scanner and it and plug it into all the
 * 3D points (aka the Variables). and with that information it will get the vector
 * and the distance.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw1b
{public static void main(String  args[])
    {
        //here we have the Scanner!
        Scanner s = new Scanner(System.in);
        //here we will have the variables and have them already defined
        double p1;
        double p2;
        double p3;
        double q1;
        double q2;
        double q3;

        // A nice pop up for the user to know what program they are running!
        System.out.println("Welcome to the 3D Pythagoream Theorm Program");
        System.out.println();
        
        //here we will take user input and also have the statements pop up
        System.out.println("Enter a Number for x (P1)");
        p1 = s.nextDouble();
        
        System.out.println("Enter a Number for y (P2)");
        p2 = s.nextDouble();
        
        System.out.println("Enter a Number for z (P3)");
        p3 = s.nextDouble();
        
        System.out.println("Enter a Number for x (Q1)");
        q1 = s.nextDouble();
        
        System.out.println("Enter a Number for y (Q2)");
        q2 = s.nextDouble();
        
        System.out.println("Enter a Number for z (Q3)");
        q3 = s.nextDouble();
        
        s.close();
        
        //this is where will now do the math to get
        //v1, v2, and v3 for the vector
        double v1 = q1 - p1;
        double v2 = q2 - p2;
        double v3 = q3 - p3;
        
        //here we will take v1, v2, and v3, and square it by multiplying them
        //and with that we will put that number into a and b
        double a = v1 * v1;
        double b = v2 * v2;
        double c = v3 * v3;
        
        //here we will get the distance formula
        double d = Math.sqrt(a + b + c);
        
        //printing out the final stuff 
        System.out.println("The Vector is: <" + v1 + "," + v2 + "," + v3 + ">");
        System.out.println("The Distance is: " + d);
        System.out.println();
        
    }
}