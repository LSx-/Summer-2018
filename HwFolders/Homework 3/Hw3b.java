import java.util.Scanner;
/**
 * Hw3b is a program that helps out with shadow vectors!
 * they user will input the V vector and the G vector so that we can get a 
 * shadow vector and a disctance (A)
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw3b
{
    public static void main(String args[])
    {
        //our typical stuff when it comes to variables and scanner
        Scanner scan = new Scanner(System.in);
        double v1;
        double v2;
        double g1;
        double g2;
        double a; //thie distance of the shadow
        double cos; //this is for cos of theta
        
        System.out.println("Please Enter a Number for V1");
        v1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for V2");
        v2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for G1");
        g1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for G2");
        g2 = scan.nextDouble();
        
        scan.close();
        
        //here we will do the calculation for the dot product!
        //here we have the new variables that we plug we will be pluging 
        //v and w into
        
        double u1; //this is what v1 * g1 is
        double u2; //this is what v2 * g2 is
        double u;  //this is combining u1 + u2
        
        //here we will do the math and calculate the dot formula
        u1 = v1 * g1;
        
        u2 = v2 * g2;
        
        u = u1 + u2;        
        
        //now we will do the Cos of theta
        //here we will have the new variables
        double gs1; //this is the square of G1
        double gs2; //this is the square of G2
        double r2;  //this is the results for G

        
        //squaring W1 and 2 and square rooting them afterwards
        gs1 = g1 * g1;
        gs2 = g2 * g2;
        
        r2 = Math.sqrt(gs1 + gs2);
        
        //adding to Cos of theta
        a = u / r2;
        
        //printing out 
        System.out.println("The distance of the shadow vector (A) is :" + a);
        
        //now we have to do stuff for p
        double pa;
        double gu;
        double ga1;
        double ga2;
        
        gu = gs1 + gs2;
        
        pa = u / gu;
        
        ga1 = pa * g1;
        
        ga2 = pa * g2;
        
        //printing time!
        System.out.println("The Shadow Vector is: <" +ga1+","+ga2+">");
        System.out.println();
        
    }
}
