import java.util.Scanner;
/**
 * Hw4c is actually a program for the Cross product
 * in Multivariable Math! We will take the input from the user for
 * v1,v2,v3,w1,w2 and w3. after taking all the information, we will then 
 * turn that into vectors for i,j,and k. after we do the calculations for
 * i,j, and k, we will turn it into 1 big vector called n
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw4c
{
    public static void main(String args[])
    {
        //here come alot of variables! also the Scanner we need 
        Scanner scan = new Scanner(System.in);
        double v1;
        double v2;
        double v3;
        double w1;
        double w2;
        double w3;
        double n1; //this is Vector I
        double n2; //this is Vector J
        double n3; //this is Vector K
        
        //our Welcome title!
        System.out.println("Welcome to the Cross Product Program!");
        System.out.println();
        
        //here come the buttload of statements we need so we can have values
        //for all the variables that need inputs
        System.out.println("Please Enter a Number for V1");
        v1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for V2");
        v2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for V3");
        v3 = scan.nextDouble();
        System.out.println();
        
        System.out.println("Please Enter a Number for W1");
        w1 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for W2");
        w2 = scan.nextDouble();
        
        System.out.println("Please Enter a Number for W3");
        w3 = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //now its time to give the n variables some  values via the cross product!
        n1 = (v2 * w3) - (w2 * v3);
        n2 = -((v1 * w3) - (w1 * v3));
        n3 = (v1 * w2) - (w1 * v2);
        
        //now time to print out the results!
        System.out.println("Vector N is: <" + n1 + "," + n2 + "," + n3 + ">");
        System.out.println();
    }
}
