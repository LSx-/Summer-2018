import java.util.Scanner;
/**
 * in Hw2c we will take 5 inputs from the user and take that 
 * information and give the user the final position that they 
 * will end up on
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw2c
{
    public static void main(String args[])
    {
        //here will have the scanner and the defined variables
        Scanner s = new Scanner(System.in);
        double x;       //starting point x
        double y;       //starting point y
        double speed;   //how fast (its by pixles a second)
        double degrees; //the angle in degrees (inputed)
        double rad;     //the angle in rad
        double t;       //time (this time is based on seconds)
        double d;       //distance (speed * time)
        double v1;      //Delta X 
        double v2;      //Delta Y
        double q1;      //the end point (X)
        double q2;      //the end point (Y)
        
        //here we have the welcome message!
        System.out.println("Welcome to Hw2C.");
        System.out.println("Here we will get take data from the user");
        System.out.println("and  give them how far it will be from 1 point");
        System.out.println("(the point they provided) to the one we calculate");
        System.out.println();
        
        //here we ill have ALL the statments for the info we need to input
        System.out.println("Please Enter a Number for the Starting point X");
        x = s.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for the Starting point Y");
        y = s.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for how fast you want to go (Pixels per sec)");
        speed = s.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for the angle you wish to go in");
        degrees = s.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a number for how long you want to go");
        t = s.nextDouble();
        System.out.println();
        
        s.close();
        
        //coverting the speed and time to distance (d)
        d = speed * t;
        
        //here we will be converting the degree to rad for the computer
        rad = degrees * ((2*Math.PI)/360);
        
        //here we will take the new d (speed * time) and angle and get the
        //delta X and the Delta Y
        v1 = d * Math.cos(rad);
        v2 = d * Math.sin(rad);
        
        //now that we have the Vector, he have to add the starting points
        // the the Delta X and Delta Y to get what will be q1 and q2
        q1 = x + v1;
        q2 = y + v2;
        
        System.out.println("The end point is: (" + q1 + "," + q2 + ")");
        System.out.println();
    }
}
