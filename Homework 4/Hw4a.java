import java.util.Scanner;
/**
 * Hw4a is a program that will take inputs from the user via a scanner
 * that will fill in point P (p1,p2) and Q (q1,q2). with that information
 * we will make the program calculate the points to get the vector and then with
 * that vector we will get points on a line when we do a for loop for T
 * 
 * also P will always be the point we use when doing the calculations (for now)
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw4a
{
    public static void main(String args[])
    {
        //setting up the variables that need inputs and the scanner called scan!
        Scanner scan = new Scanner(System.in);
        double p1;
        double p2;
        double q1;
        double q2;
        
        //the title message!
        System.out.println("Welcome to 'L(t) = <x,y>t + <a,b>' Program!");
        System.out.println("Just to let you know, the P point (p1,p2) will be used for <a,b>");
        System.out.println();
        //time to do the print statements and take inputs for the variables!
        System.out.println("Please Enter a Number for P1");
        p1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for P2");
        p2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for Q1");
        q1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for Q2");
        q2 = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //more variables to make the S vector
        double s1; //We will subtract Q to P  (Q-P) to get S1
        double s2; //We will subtract Q to P  (Q-P) to get S2
        
        //here we will make s1 and s2 have a value to make them useful
        s1 = q1 - p1;
        
        s2 = q2 - p2;
        
        //we will println the L(t) <s1,s2>t + (p1,p2) to show what was inputed
        System.out.println("L(t) = <" + s1 + "," + s2 + ">t + <" + p1 + "," + p2 + ">");
        System.out.println();
        System.out.println("Now we will make T = 0 threw 10");
        System.out.println();
        
        
        //here is where we will all the calculations and print out the after effect
        for(int t = 0; t <= 10; t++)
        {
            double x = (s1 * t) + p1;  //the answer for X
            double y = (s2 * t) + p2;  //the answer for Y
            
            System.out.println("When T = " + t + ", <x,y> = <" + x + "," + y + ">");
        }
        System.out.println();
    }
}
