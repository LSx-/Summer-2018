import java.util.Scanner;
import net.objecthunter.exp4j.*;
/**
 * Hw6B is the Sigma program, the Sigma program will take 
 * inputs from the user for the  function (in a string)
 * the starting point as an int and the end point as an int
 * (no doubles this time around) and at the end we will print out the
 * total which will be put as S
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw6b
{
    public static void main(String args[])
    {
        //the variable and scanner!
        Scanner scan = new Scanner(System.in);
        String func = "";
        int start;
        int end;
        int s = 0;
        
        //the title
        System.out.println("Welcome to the Sigma program!");
        System.out.println();
        
        //here we will have the statement to take in the inputs
        System.out.println("Please Enter a String for the function!");
        System.out.println("also please only enter x as a variable");
        func = scan.nextLine();
        
        System.out.println("Please Enter a Number for the Starting Point");
        start = scan.nextInt();
        
        System.out.println("Please Enter a Number for the Ending Point");
        end = scan.nextInt();
        
        System.out.println();
        scan.close();
        
        //so here we will have Expression stuff from the +libs jar!
        Expression f = new ExpressionBuilder(func).variables("x").build();
        
        //the for loop for the sigma stuff!
        for(int i  = start; i <= end; i++)
        {
            double y = f.setVariable("x" , i).evaluate();
            s += y;
        }
        
        // the output!
        System.out.println("the sum of " + func + " from " + start + " to " + end + " is " + s);
        System.out.println();
    }
}
