
package findTheLargestNum;

/**
 *
 * @author Ibtihal
 */
import java.util.Scanner;
public class FindTheLargestNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int number1, number2, number3;
int largestOne;
Scanner input = new Scanner(System.in);
System.out.print("Enter the first integer: ");
number1 = input.nextInt();
System.out.print("Enter the second integer: ");
number2 = input.nextInt();
System.out.print("Enter the third integer: ");
number3 = input.nextInt();
if ( (number1 > number2) && (number1 > number3) )
{
largestOne = number1;
}
else if (number2 > number3)
{
largestOne = number2;
}
else
{
largestOne = number3;    // TODO code application logic here
 }
System.out.println("The largest integer is "
+ largestOne);   
}
    
}
