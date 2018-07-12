import java.util.Scanner;
import net.objecthunter.exp4j.*;
/**
 * Write a description of class hw11 here.
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class hw11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String func;   //this is where we will store the function
        double a;  //this is the value for x
        double b;  //this is the value for y
        double h = 0.000001;
        double xDeriv;
        double yDeriv;
        double y;
        double x;
        
        System.out.println("Welcome to HW11 program!");
        System.out.println();
        
        //here we will take the inputs and stuff
        System.out.println("Please Enter a Function!");
        System.out.println("ex: x^2*y^3");
        func = scan.next();
        
        System.out.println("Please Enter a Number for X");
        a = scan.nextDouble();
        
        System.out.println("Please Enter a Number for Y");
        b = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //expression = function
        Expression f = new ExpressionBuilder(func).variables("x","y").build();
        
        //now we do the x derivate
        //so (f(c+h) - f(c)) / h
        double x2 = f.setVariable("x", a+h).setVariable("y",b).evaluate();
        double x1 = f.setVariable("x", a).setVariable("y",b).evaluate();
        xDeriv = (x2-x1)/h;
        
        //now that we got x, let get y by doing the same exact thing
        //so (f(c+h) - f(c) / h
        double y2 = f.setVariable("y", b+h).setVariable("x",a).evaluate();
        double y1 = f.setVariable("y", b).setVariable("x",a).evaluate();       
        yDeriv = (y2-y1)/h;
        
        System.out.println("For the function f(x,y) = " + func + " at the point x = " + a + " y = " + b);
        System.out.println("the x - derivative is " + xDeriv);
        System.out.println("the y - derivative is " + yDeriv);
        System.out.println();
    }
}
