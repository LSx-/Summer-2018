import java.util.Scanner;
/**
 * Hw5a is a program that will take 9 
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw5a
{
    public static void main(String args[])
    {
        //all the normal stuff we do for every homework ever 
        //(scanner and variables)
        Scanner scan = new Scanner(System.in);
        double p1; //the x of point P
        double p2; //the y of point P
        double p3; //the z of point P
        double q1; //the x of point Q
        double q2; //the y of point Q
        double q3; //the z of point Q
        double r1; //the x of point R
        double r2; //the y of point R
        double r3; //the z of point R
        
        //the title println
        System.out.println("Welcome to the equation of plane program!");
        System.out.println("Here you will take in inputs for point P, Q, and R.");
        System.out.println("After that we will println out the equation of the plane!");
        System.out.println();
        
        //the basic boring statements
        System.out.println("Please Enter a Number for x of point P (P1)");
        p1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point P (P2)");
        p2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point P (P3)");
        p3 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for x of point Q (Q1)");
        q1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point Q (Q2)");
        q2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point Q (Q3)");
        q3 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for x of point R (R1)");
        r1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point R (R2)");
        r2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for x of point R (R3)");
        r3 = scan.nextDouble();
        System.out.println();
        
        scan.close();
        
        //here we will do all the math for Vector V 
        double v1;
        double v2;
        double v3;
        
        v1 = q1 - p1;
        
        v2 = q2 - p2;
        
        v3 = q3 - p3;
        
        //here we will do all the math for Vector W!
        double w1;
        double w2;
        double w3;
        
        w1 = r1 - p1;
        
        w2 = r2 - p2;
        
        w3 = r3 - p3;
        
        //time to do cross product!
        double n1;
        double n2;
        double n3;
        
        n1 = (v2 * w3) - (w2 * v3);
        
        n2 = -((v1 * w3) - (w1 * v3));
        
        n3 = (v1 * w2) - (w1 * v2);
        
        //n vector is done!
        
        //time to do the odd H vector stuff here
        //we will also have the constant numbers here and they will be called D1-3
        double h1 = p1;
        double h2 = p2;
        double h3 = p3;
        double d1 = n1 * h1;
        double d2 = n2 * h2;
        double d3 = n3 * h3;
        
        //we will add the d1-3 because if it is a negative it will be +- making it still a negative!
        double d = d1 + d2 + d3;
        
        //the output println here is different, we will use print instead
        //plus we will be doing if statements to add + and - to the string if needed
        System.out.print("The equation of the plane (N) is: " + n1 +"x "); 
        if(n2 >= 0)
        {
            System.out.print("+" + n2 +"y ");
        }
        else
        {
            System.out.print(n2 +"y ");
        }
        
        if(n3 >= 0)
        {
            System.out.print("+" + n3 + "z = ");
        }
        else
        {
            System.out.print(n3 + "z = ");
        }
        System.out.print(d);
        System.out.println();
    }
}
