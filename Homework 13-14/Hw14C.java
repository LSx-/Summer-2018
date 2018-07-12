import java.util.Scanner;
/**
 * Write a description of class Hw14c here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw14c
{
    static double round(double num, int dig)
    {
        num *= Math.pow(10,dig);
        num  = Math.round(num);
        num *= Math.pow(10,-dig);
        return num;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double x; // this is the X starting point
        double y; // this is the Y starting point
        double p; // this will be the X part of the translation (p,q)
        double q; // this will be the Y part of the translation (p,q)
        
        //the title print out 
        System.out.println("Welcome to the 'point translation' Program");
        System.out.println();
        
        //now we will take inputs from the user and normal
        //statement stuff
        System.out.println("Please Enter a Number for starting point for X");
        x = scan.nextDouble();
        
        System.out.println("Please Enter a Number for starting point for Y");
        y = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the translated point X");
        p = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the translated point Y");
        q = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //now that we have the information needed lets do the math!
        //here we will set up the vector and the matrix with the 
        //inputs we were given from the user
        Vector3 v = new Vector3(x,y,1);
        Matrix3 m = new Matrix3(1,0,p,0,1,q,0,0,1);
        
        //now we will make a new vector and do the multiplication 
        Vector3 w = m.multiplyVector(v);
        
        //now we do the outputs
        System.out.print("Translating ("+ x + "," + y);
        System.out.println(") by ("+ p + "," + q + ")");
        System.out.println("gives you (" + round(w.x,4) + "," + round(w.y,4) + ")");
        System.out.println();
        
        
    }
}
