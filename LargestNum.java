//Name: Ibtihal Radhi Almughamisi
//Date: 6/10/2021
package largestnum;
import java.util.Scanner;
public class LargestNum {//start class
    public static void main(String[] args) {//start method
    int number1, number2, number3;
int LargestOne;
Scanner input = new Scanner(System.in);
System.out.print("Enter the first integer: ");
number1=input.nextInt();
System.out.print("Enter the second integer: ");
number2= input.nextInt();
System.out.print("Enter the third integer: ");
number3= input.nextInt();
if ( (number1 > number2)&&(number1 > number3))
    {//start if
        LargestOne=number1;
    }//end if 
    else if (number2 > number3)
    {// start else if
        LargestOne=number2;
    }//end else if
    else 
    {//start else
        LargestOne=number3;
    } //end else
    System.out.println("The Largest integer is  "+LargestOne);
    }//end method
    
}//end class
