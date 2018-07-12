import java.util.Scanner;
/**
 * Write a description of class HW15b here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class HW15b
{
    /**
     * this class is used to 
     */
    static double round(double num,int dig)
    {
        num *= Math.pow(10,dig);
        num  = Math.round(num);
        num *= Math.pow(10,-dig);
        
        return num;
    }
    
    public static void main(String args[])
    {
        //all the input variables we need (minus the scanner)
        Scanner scan = new Scanner(System.in);
        double angle1;
        double p1;
        double q1;
        double angle2;
        double p2;
        double q2;
        double x;
        double y;
        
        //our welcome message!
        System.out.println("Welcome to the Translations and rotations with matrices program!");
        System.out.println();
        
        //here we will get all the info we need from the user
        System.out.println("Please Enter a Number for the first Angle(degrees)");
        angle1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the first translated point X");
        p1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the first translated point Y");
        q1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the second Angle(degrees)");
        angle2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the second translated point X");
        p2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the second translated point Y");
        q2 = scan.nextDouble();
        
        System.out.println("Now that we finished all of that!");
        System.out.println("Please Enter a Number for the Starting point X");
        x = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the Starting point Y");
        y = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //that was alot of inputs! now we will do all the other stuff here:
        //here we will set up the vector and the matrix with the 
        //inputs we were given from the user
        Vector3 v = new Vector3(x,y,1);
        Matrix3 m1 = Matrix3.makeTransform(angle1,p1,q1);
        Matrix3 m2 = Matrix3.makeTransform(angle2,p2,q2);
        
        System.out.println("M1=");
        m1.print();
        System.out.println("M2=");
        m2.print();
        System.out.println("M1*v=");
        m1.multiplyVector(v).print();
        System.out.println("M2*M1=");
        m2.multiplyMatrix(m1).print();
        
        //we will now do dot products with the 2 new matrices and the vector v
        //we should be getting the same after for both no matter what
        //they are solving different ways but should still have the same
        //output
        Vector3 w1 = m2.multiplyVector(m1.multiplyVector(v));
        Vector3 w2 = m2.multiplyMatrix(m1).multiplyVector(v);
        
        //time for the output
        System.out.println("Final point using Method 1: (" + round(w1.x,4) +","+ round(w1.y,4)+")");
        System.out.println("Final point using Method 2: (" + round(w2.x,4) +","+ round(w2.y,4)+")");
        
        System.out.println();
    }
}
