import java.util.Scanner;
import net.objecthunter.exp4j.*;
/**
 * The Volume program! here we will take the inputs from starting points of x and y 
 * and the ending point of x and y. we will also take the forumla from them as well
 * and use the exp4j library
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw12
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String func;
        double a;
        double b;
        double c;
        double d;
        double h =100;
        double dx;
        double dy;
        double vol = 0;
        
        //the welcome println
        System.out.println("Welcome to the Volume Program");
        System.out.println();
        
        //normal input and println stuff
        System.out.println("Please Enter a Formula!");
        func = scan.next();
        
        System.out.println("Please Enter a Number for X start point");
        a = scan.nextDouble();
        
        System.out.println("Please Enter a Number for X end point");
        b = scan.nextDouble();
        
        System.out.println("Please Enter a Number for Y start point");
        c = scan.nextDouble();
        
        System.out.println("Please Enter a Number for Y end point");
        d = scan.nextDouble();
        
        System.out.println();
        scan.close();
        
        //Expression = function
        Expression f = new ExpressionBuilder(func).variables("x","y").build();
        
        //here we will get the DX and DY
        dx = (b-a)/h;
        dy = (d-c)/h;
        
        for(double x = a; x<b; x+=dx)
        {
            for(double y = c; y<d; y+=dy)
            {
                vol += f.setVariable("x",x).setVariable("y",y).evaluate() * dx * dy;
            }
        }
        
        System.out.println("The volume of " + func);
        System.out.println("for x, between " + a + " to " + b);
        System.out.println("and y between " + c + " to " + d);
        System.out.println("is approx. " + vol);
    }
}
