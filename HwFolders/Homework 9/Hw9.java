import java.util.Scanner;
/**
 * Hw9 is the sin(x) program!
 * we will have the user give us the number
 * for x by having them input the number!
 * 
 * after we do that we will give them and approx.
 * and under that we will have the exact number of
 * there sin(x) by doing Math.sin(x)
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw9
{
    //the Factorial Method we made!!!
    //we will do all the factorial stuff when a number
    //is provided (the number will be the number from the for loop)
    public static int Factorial(int p)
    {
        int fact = 1;
        
        for(int i = 1; i <= p; i++)
        {
            fact *= i;
        }
        
        return fact;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double q = 1;
        double e = 0;
        double c = 0;
        double sum = 0;
        double x; //the user inputs X
        

        //the title println
        System.out.println("Welcome to the sin(x) Program!");
        System.out.println();

        //the normal statement stuff for the user
        System.out.println("Please provide a Number for x");
        x = scan.nextDouble();

        System.out.println();
        scan.close();

        //now we have the JUICY for loop we made in class today
        for(int m = 0; m <= 21; m++)
        {
            int n; //this variable will be used to alternate between -1, 0, 1
            
            if(m == e)
            {
                n = 0;
                e += 2;
            }
            else if( m == q)
            {
                n = 1;
                q += 4;
            }
            else 
            { 
                n = -1;
            }

            // had to make a  p variable for this because of "divide by 0" errors
            double p = Factorial(m);
            
            //now we will give the answer of C using 
            //the new factorial method we made
            c = n/p;

            //here we will add all this math to sum
            sum = c * Math.pow(x,m);
        }

        //the print outs go here !
        System.out.println("Sin of " + x + " is approx. " + sum);

        //this print out is for exact numbers for sin
        System.out.println("The exact value is: " + Math.sin(x));
        System.out.println();
    }
}
