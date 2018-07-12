import java.util.Scanner;
/**
 * Hw8b is a program where we will see if the input has a antiDerivative form!
 * we will take the input of a Derivied function and then see if it can go backwards
 * the function must contain a cos or sin for it to work, once supplied with one 
 * we see if it has a form and let them know what the form is
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw8b
{
    public static void main(String args[])
    {
        //normal variable stuff
        Scanner scan = new Scanner(System.in);
        double a; //the number outside the ()
        double b; //the power of x outside the ()
        double c; //the number inside the ()
        double d; //the power of x inside the ()
        double cPrime; //this = c*d
        double dPrime; //this = d-1
        String input; //the users input
        String func;  //what we will put sin or cos
        String antiDeriv; //the string after we do the if statement
        
        
        //the Title println!
        System.out.println("Welcome to the Anti Derivative seeker program!");
        System.out.println();
        
        //give the usual statement and example for the user on how to input the problem
        System.out.println("Please provide a sin or cos Function to see if");
        System.out.println("it has an anti Derivative form.");
        System.out.println("Example: 10*x^4*sin(2*x^5)");
        input = scan.next();
        
        System.out.println();
        scan.close();
        
        //here we will be splitting up the long string, we will be taking out the *, ^, and the ()
        String[] arr = input.split("[\\*\\^()]");
        
        //this is longer then normal but we are taking all the important 
        //stuff out of the array and putting them into variables
        a = Double.parseDouble(arr[0]);
        b = Double.parseDouble(arr[2]);
        c = Double.parseDouble(arr[4]);
        d = Double.parseDouble(arr[6]);
        func = arr[3];
        
        //setting up the cPrime and dPrime
        cPrime = c*d;
        dPrime = d-1;
        
        //now we are going to get the anti deriv of the function (sin or cos)
        //and we will put it into the anti Deriv String in the format it should be in
        //**We will need this if the answer is yes**
        if(func == "sin")
        {
            antiDeriv = "-cos("+ c + "*x^" + d + ")";
        }
        else
        {
            antiDeriv = "sin("+ c + "*x^" + d + ")";
        }
         
        // now we have to see if a = cP and b = dP
        // if they do then we can give them the antiDeriv println
        // if not then give them the "no" println
        if(a == cPrime && b == dPrime)
        {
            System.out.println("Yes! the antiDeriv. is: " + antiDeriv);
            System.out.println();
        }
        else
        {
            System.out.println("No, this deriv. function does not have a AntiDeriv. form");
            System.out.println();
        }
    }
}
