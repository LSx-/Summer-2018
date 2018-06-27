import java.util.Scanner;
import net.objecthunter.exp4j.*;
/**
 * Hw6C is the Area program, in this program we will take
 * inputs from the user that will fill in all the need
 * variables so that we can have a area!
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Hw6c
{
   public static void main(String args[])
   {
       //the variables and scanner!
       Scanner scan = new Scanner(System.in);
       String func = "";  // the finction in a string
       double start;      // this is the left side 
       double end;        // this is the right side
       double boxArea = 0;
       double numBoxes = 10000;
       double area = 0;
       
       //the title
       System.out.println("Welcome to the Area program!");
       System.out.println();
       
       //the statements and stuff
       System.out.println("Please Enter a String for the function!");
       func = scan.nextLine();
       
       System.out.println("Please Enter a Number for the left side point");
       start = scan.nextDouble();
       
       System.out.println("Please Enter a Number for the right side point");
       end = scan.nextDouble();
       
       System.out.println();
       scan.close();
       
       // expression = function
       Expression f = new ExpressionBuilder(func).variables("x").build();
       
       double dx = (end-start)/numBoxes;
       
       //the for loop to get the area and stuff
       for(double x = start + dx; x<= end; x += dx)
       {
           boxArea = f.setVariable("x",x).evaluate() * dx;
           area += boxArea;
       }
       
       //the output!
       System.out.println("The Area is: " + area);
   }
}
