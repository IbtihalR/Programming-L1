//Ibtihal
package lab4homework01;
import java.util.Scanner;
public class Lab4Homework01 {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.print("Enter investment amount");
     double investmentAmount= input.nextDouble();
     
     System.out.print("Enter annual interest rate in percentage: ");
     double annualInterestRate= input.nextDouble();
     System.out.print("Enter number of years: ");
     int years=input.nextInt();
     
     double f= investmentAmount*(Math.pow((1+annualInterestRate), (12*years)));
     System.out.print("Enter number of years: "+f);
      
      
    
   
     
    }
    
}
