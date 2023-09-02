//Name: Ibtihal Radhi Almughamisi
//Date: Sat,2 Oct 2021
/*
This program reads in investment amount,annual interest rate,
and number of years, and displays the future investment value.
*/ 
package futureinvestment;
import java.util.Scanner;
public class FutureInvestment {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        //investment amount
        System.out.print("Enter investment amount:"+" ");
        double investmentAmount =input.nextDouble();
        //annual interest rate
        System.out.print("Enter annual interest rate in percenrage:"+" ");
        double monthlyInterestRate = input.nextDouble();
        //number of years
        System.out.print("Enter number of years:"+" ");
        double numberOfYears = input.nextDouble();
        //The formula
        double futureInvestmentValue = investmentAmount*(Math.pow((1+monthlyInterestRate),(numberOfYears*12))); 
        System.out.println("Accumulated value is"+" "+"$"+ futureInvestmentValue);
    }//end of main()
    
}//end of class Distance
