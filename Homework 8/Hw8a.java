import java.util.Scanner;
/**
 * Hw8a will is a deriv and a antiDeriv program with
 * Sin and Cos. We will take the input from the user
 * (just 1 line) and then we will split the input string
 * and give back the deriv and the anti deriv as the output
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw8a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String input;
        double a; //the number infront of sin/cos
        double b; //the number inside the ()
        String func; //this is what sin/cos will be
        String derivFunc; //the deriv. function
        String antiFunc;  //the antideriv. function
        
        //the title print outs
        System.out.println("Welcome to the Deriv and Anti-Deriv Program!");
        System.out.println("This program is for sin and cos only");
        System.out.println();
        
        //the instrunctions on what to do and also taking the input
        System.out.println("Please Enter a sin or cos Fuinction! ");
        System.out.println("Example: 34*cos(16*x)");
        input = scan.next();
        
        System.out.println();
        scan.close();
        
        //here we will take out the numbers and the function
        String[] arr = input.split("[\\*()]");
        
        //now we will put them in variables
        a = Double.parseDouble(arr[0]);
        func = arr[1];
        b = Double.parseDouble(arr[2]);
        
        
        //this is for the derivative part
        if(func == "sin")
        {
            derivFunc = a + "*cos";
        }
        else
        {
            derivFunc = "-" + a + "*sin";
        }
        
        //making the deriv string
        String deriv = derivFunc + "(" + b + "*x) * " + b;
        //printing it out
        System.out.println("The Deriv. of '" + input + "' is: " + deriv);
        
        //
        //now we have to do the anit deriv!
        if(func == "sin")
        {
            antiFunc = "-" + a+"/"+b + "*cos";
        }
        else
        {
            antiFunc = a+"/"+b + "*sin";
        }
        
        //time to put it into a string!
        String antiDeriv = antiFunc + "(" + b + "*x)";
        
        //printing it out
        System.out.println("The Anti Deriv. of '" + input + "' is: " + antiDeriv);
        System.out.println();
    }
}
