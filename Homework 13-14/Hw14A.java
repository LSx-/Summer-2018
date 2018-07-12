import java.util.Scanner;
/**
 * Write a description of class Hw14a here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw14a
{
    static double round(double num,int dig)
    {
        num *= Math.pow(10,dig);
        num = Math.round(num);
        num *= Math.pow(10,-dig);
        return num;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double angle;
        double rad;
        
        //the welcome message
        System.out.println("Welcome to the 2D Matrix Program!");
        System.out.println();
        
        //here we will have the statements to get the inputs
        System.out.println("Please Enter a Number for point X");
        x = scan.nextDouble();
        
        System.out.println("Please Enter a NUmber for point Y");
        y = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the Angle(degrees)");
        angle = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //before any of this we have to convert the angle
        //which is in degrees and turn it into rad
        rad = angle * ((2*Math.PI)/360);
        
        
        //now that we have the information needed lets do the math!
        //here we will set up the vector and the matrix with the 
        //inputs we were given from the user
        Vector2 v = new Vector2(x,y);
        Matrix2 m = new Matrix2(Math.cos(rad),-Math.sin(rad),Math.sin(rad),Math.cos(rad));
        
        //now we will make a new vector and do the multiplication 
        Vector2 w = m.multiplyVector(v);
        
        
        //the output for the user
        System.out.print("The point ("+x+","+y);
        System.out.println(") rotated by "+angle+" degrees");
        System.out.println("is ("+ round(w.x,3) +","+ round(w.y,3) +")");
        System.out.println();
        
    }
}

