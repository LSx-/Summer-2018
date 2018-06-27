import java.util.Scanner;
/**
 * Hw7a is the Derivative Program!
 * we will take only 1 input from the user!
 * after we take there input we will then split it
 * and take out the "*x^" and put the numbers in an array
 * after that we will parse them out of the array and do the 
 * math needed to get out right answer
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw7a
{
    public static void main(String args[])
    {
     // normal variables and Scanner stuff   
     Scanner scan = new Scanner(System.in);
     String func = "";
     double c;
     double n;
     
     //the intro to the program
     System.out.println("Welcome to the Derivative Program!");
     System.out.println();
     
     //now we will take the input with a statement
     //this is the first time we have ever taken 1 input!
     System.out.println("Please Provide a power Function to get derived");
     System.out.println("Example: 3*x^4");
     func = scan.next();
     System.out.println(func);
     
     System.out.println();
     
     //here we will now take out the numbers
     String[] arr = func.split("[\\*\\^]");
     
     //and here we will fill in those variables we have (c and n);
     c = Double.parseDouble(arr[0]);
     n = Double.parseDouble(arr[2]);
     
     //here we will set up the deriative string
     String answer = (c*n) + "*x^" + (n-1);
     
     //now we will print out the output!
     System.out.println("The derivative of " + func + " is " + answer);
     System.out.println();
    }
}
