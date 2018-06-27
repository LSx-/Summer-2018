import java.util.Scanner;
import net.objecthunter.exp4j.*;
/**
 * Hw7C is the area Program but to an exact number!
 * here we will take a function, start point, and end point from the user
 * after all of that we will do the area program but all with 
 * anti-derivative helping us out! to get a more exact number
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw7c
{
    public static void main(String args[])
    {
        // normal variables stuff
        // here we will have 
        Scanner scan = new Scanner(System.in);
        String func = "";
        
        // these Variables will be used when we split the function
        // example: c*x^n
        double c;  
        double n;
        
        // this is where we will have the starting and ending point
        double start;  //this would be a
        double end;    //this would be b
        
        // the title printout!
        System.out.println("Welcome to the Area and Anti-Derivative Program!");
        
        // here we will do the statement and inputs
        System.out.println("Please Enter a Derivative function!");
        System.out.println("Example: 3*x^4");
        func = scan.nextLine();
        
        System.out.println("Please Enter a Number for the starting point (the left)");
        start = scan.nextDouble();
        
        System.out.println("Please Enter a Number for the ending point (the right)");
        end = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //so here we will do the anti-derivative stuff
        String[] arr = func.split("[\\*\\^]");
        
        //putting the numbers in c and n
        c = Double.parseDouble(arr[0]);
        n = Double.parseDouble(arr[2]);
        n = n + 1;
        
        String aDeriv = (c/n) + "*x^" + (n);
        
        //here we will do all the math needed to get the areas
        Expression f = new ExpressionBuilder(aDeriv).variables("x").build();
        
        double a = f.setVariable("x", start).evaluate();
        double b = f.setVariable("x", end).evaluate();
        
        double answer = b - a;
        
        //now we print out the output!;
        System.out.println("Thex exact Area under " + func);
        System.out.println("Between " + a + " and " + b + " is: " + answer );
        System.out.println();
        
    }
}
