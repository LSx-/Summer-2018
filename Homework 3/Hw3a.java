import java.util.Scanner;
/**
 * Hw3a is a program that will take inputs from the user and do the 
 * dot product from multivariable math! it will do the calculations,
 * and then give out the results from the dot product, but also the 
 * Cos of Theta, the Sin of Theta, and the Cos of Theta again,
 * but this time in degrees for the user to understand
 *
 * @author Michael Casitllo
 * @version 1.0
 */
public class Hw3a
{
    public static void main(String args[])
    {
        //here we have the variables we need and the scanner
        Scanner scan = new Scanner(System.in);
        double v1;
        double v2;
        double w1;
        double w2;
        double cos; 
        double sin; 
        
        //the welcome println
        System.out.println("Welcome to the dot Product Program!");
        System.out.println("here we will get you the result for the");
        System.out.println("dot product, the Cos of Theta, the Sin of Theta");
        System.out.println("and the Cos of Theta in Degrees");
        System.out.println();
        //here we will have the statements and take the inputs from the scanner
        System.out.println("Please Enter a Number for V1");
        v1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for V2");
        v2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for W1");
        w1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for W2");
        w2 = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //here we will do the calculation for the dot product!
        //here we have the new variables that we plug we will be pluging 
        //v and w into
        
        double u1; //this is what v1 * g1 is
        double u2; //this is what v2 * g2 is
        double u;  //this is combining u1 + u2
        
        //here we will do the math and calculate the dot formula
        u1 = v1 * w1;
        
        u2 = v2 * w2;
        
        u = u1 + u2;
        
        //here we will print it out!
        System.out.println("The result from the dot formula is: " + u);
        
        
        //now we will do the Cos of theta
        //here we will have the new variables
        double vs1; //this is the square of V1
        double vs2; //this is the square of V2
        double ws1; //this is the square of W1
        double ws2; //this is the square of W2
        double r1;  //this is the results for V
        double r2;  //this is the results for W
        
        //squaring V1 and 2 and square rooting them afterwards
        vs1 = v1 * v1;
        vs2 = v2 * v2;
        
        r1 = Math.sqrt(vs1 + vs2);
        
        //squaring W1 and 2 and square rooting them afterwards
        ws1 = w1 * w1;
        ws2 = w2 * w2;
        
        r2 = Math.sqrt(ws1 + ws2);
        
        //adding to Cos of theta
        cos = u /(r1 * r2);
        
        //println time!
        System.out.println("The Cos of Theta in radian is: " + cos);
        
        //time to do the sin calculations!
        double cos2; //this is for squaring cos
        
        cos2 = cos * cos;
        sin = Math.sqrt(1 - cos2);
        
        //printing time!
        System.out.println("The Sin of Theta in radian is: " + sin);
        
        //now we output the degrees from Cos theta
        double ca; //the is Cos -1
        double r3; //the results for this problem
        
        ca = Math.acos(cos);
        
        r3 = ca * (360/(2 * Math.PI));
        
        //println time!
        System.out.println("The Degrees of Cos of Theta is: " + r3);
        System.out.println();
        
    }
}
