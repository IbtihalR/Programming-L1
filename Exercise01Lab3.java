//Ibtihal 
package exercise01lab3;
import java.util.Scanner;
public class Exercise01Lab3 {//start class
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter Integer nimber between 0 to 1000 ");
     int num= input.nextInt();
     // digit 1
     int d1=num%10;
     //digit2
     int num2=num/10;
     int d2=num2%10;
     //digit 3
     int num3=num2/10;
     int d3=num3%1000;
     int total=d1+d2+d3;
     System.out.println("The sum of the digit is "+total);
     
             
    }//end main 
}// end class
