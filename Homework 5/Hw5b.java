import java.util.Scanner;
/**
 * Hw5b is the point of intersection program.
 * the user will input 10 different values. with those values
 * we will do some calculations to get the point of intersection
 * and print out that info
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw5b
{
    public static void main(String args[])
    {
        //all the normal stuff we do for every homework ever 
        //(scanner and variables)
        Scanner scan = new Scanner(System.in);
        double s1; //the x for the S vector
        double s2; //the y for the S vector
        double s3; //the z for the S vector
        double p1; //the x for point P
        double p2; //the y for point P
        double p3; //the z for point P
        double a;  //the a is from the equation of the plane P
        double b;  //the b is from the equation of the plane P
        double c;  //the c is from the equation of the plane P
        double d;  //the d is from the equation of the plane P
        
        //the title
        System.out.println("Welcome to the 'point of intersection' program!");
        System.out.println();
        
        //normal statement stuff and input stuff
        System.out.println("Please Enter a Number for x in the S Vector (S1)");
        s1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for y in the S vector (S2)");
        s2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for z in the S vector (S3)");
        s3 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for x in the point P (P1)");
        p1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for y in the point P (P2)");
        p2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for z in the point P (P3)");
        p3 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for a for the equation of the plane");
        a = scan.nextDouble();
        
        System.out.println("Please Enter a Number for b for the equation of the plane");
        b = scan.nextDouble();
        
        System.out.println("Please Enter a Number for c for the equation of the plane");
        c = scan.nextDouble();
        
        System.out.println("Please Enter a Number for d for the equation of the plane");
        d = scan.nextDouble();

        System.out.println();
        System.out.println("Calculating...");
        scan.close();
        
        //this is where we will do all the calculations
        //here is all the calculations for Vector S
        double st1 = a * s1;
        double st2 = b * s2;
        double st3 = c * s3;
        
        //here we will do the calculations for Point P
        double pt1 = a * p1; 
        double pt2 = b * p2;
        double pt3 = c * p3;
        
        double totalP = pt1 + pt2 + pt3;  //this is what will be the total of all of Pts
        double totalS = st1 + st2 + st3;  //this is what will be the total of all the Sts
        
        double totalD = d - totalP; //here we will take the total of P and subtract it (or add it) 
        double t = totalD / totalS; //here we will take the total of S and divide it this is what T will =
        
        //alright, now we have all the data we need to do the math to get the final answers we need 
        //aka the point of intersection we are looking for
        double finalX = (s1*t) + p1;
        double finalY = (s2*t) + p2;
        double finalZ = (s3*t) + p3;
        
        System.out.print("Complete!");
        System.out.println();
        System.out.println("(x,y,z) = (" + finalX + "," + finalY + "," + finalZ + ")");
        
    }
}
