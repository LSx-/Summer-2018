import java.util.Scanner;
import net.objecthunter.exp4j.*;

/**
 * The derivative program! aka Hw6A
 * This program will take inputs from the user.
 * the first input is a string that will be the function and then we will have the X value added in
 * after all of that, we will 
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw6a
{
    public static void main(String args[])
    {
        //the varuables and the scanner!
        Scanner scan = new Scanner(System.in);
        String func = "";
        double y;
        double y1;
        double y2;
        double x;
        double h = 0.000000001;
        
        //the title println
        System.out.println("Welcome to the derivative program!");
        System.out.println();
        
        //here we will have the statement and input stuff
        System.out.println("Please Enter a String for the function!");
        System.out.println("also, please only have the 'x' variable");
        func = scan.nextLine();
        
        System.out.println("Please Enter a Number for x of 'f(x)'");
        x = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        // expression = function
        Expression f = new ExpressionBuilder(func).variables("x").build();
        
        //(f(c+h) - f(c)) / h
        y2 = f.setVariable("x", x+h).evaluate();
        y1 = f.setVariable("x", x).evaluate();
        double deriv = (y2-y1)/h;
        
        // the output stuff!
        System.out.println("When f(x) = " + func);
        System.out.println("f'(" + x + ") is approx. " + deriv);
        System.out.println();
        
    }
}
