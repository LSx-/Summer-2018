import java.util.Scanner;
import net.objecthunter.exp4j.*;

/**
 * Write a description of class Hw10a here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw10a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String x = "";
        String y = "";
        double y1;
        double y2;
        double x1;
        double x2;
        double t;
        double theta = 0;
        double h = 0.0000001;
        
        //the title println
        System.out.println("Welcome to the Hw10A program!");
        System.out.println();
        
        //here we will have the inputs and statements like normal
        System.out.println("Please enter a function for x!");
        x = scan.next();
        
        System.out.println("Please enter a function for y!");
        y = scan.next();
        
        System.out.println("Please enter a number value for t");
        t = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //expression function
        Expression func1 = new ExpressionBuilder(x).variables("t").build();
        Expression func2 = new ExpressionBuilder(y).variables("t").build();
        
        //now we will have them put into the functions
        double xPoint = func1.setVariable("t", t).evaluate();
        double yPoint = func2.setVariable("t", t).evaluate();
        
        //now expressions to do deriv and add stuff
        //doing the first Deriv
        Expression f1 = new ExpressionBuilder(x).variables("t").build();
        
        //(f(c+h) - f(c)) / h
        x2 = f1.setVariable("t", t+h).evaluate();
        x1 = f1.setVariable("t", t).evaluate();
        double xDeriv = (x2-x1)/h;
        
        //doing the 2nd Deriv
        Expression f2 = new ExpressionBuilder(y).variables("t").build();
        
        //(f(c+h) - f(c)) / h
        y2 = f1.setVariable("t", t+h).evaluate();
        y1 = f1.setVariable("t", t).evaluate();
        double yDeriv = (y2-y1)/h;
        
        //now we have to get the theta!
        double rad = Math.atan2(yDeriv,xDeriv);
        double degrees = rad * (360/(2*Math.PI));
        theta = degrees;
        
        //print the stuff out now!
        System.out.println("For the function f(t) = <" + x +","+ y + "> at t = " + t);
        System.out.println("The tangent line is L(t) = <" + xDeriv + "," + yDeriv + ">t+<" + xPoint + "," + yPoint + ">");
        System.out.println("The angle is " + theta + " degrees");
        System.out.println();
    }
}
