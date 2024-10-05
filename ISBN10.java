//Name: Ibtihal 
//Date: 9/10/2021
/*
This program prompts the user to enter the first 9 digits and displays the
10-digit ISBN 
*/ 
package isbn.pkg10;
import java.util.Scanner;
public class ISBN10 {//start of class
    public static void main(String[] args) {//start of method
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the first 9 digit of an ISBN as integer: ");
    int num = input.nextInt();
    //digit 9
    int d9 = num%10;
    //digit 8
    int x= num/10;
    int d8= x%10;
    //digit7
    int x1 = x/10;
    int d7 =x1%10;
    //digit6
    int x2=x1/10;
    int d6=x2%10;
    //digit5
    int x3=x2/10;
    int d5=x3%10;
    //digit4
    int x4=x3/10;
    int d4=x4%10;
    //digit3
    int x5=x4/10;
    int d3=x5%10;
    //digit 2
    int x6=x5/10;
    int d2=x6%10;
    // digit 1
    int d1=x6/10;
    //d10
    int d10=((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
    //d10=x or 1
    if (d10==10){
        System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"x");
    }
    else
        System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"1");
    }//end of method
}//end of class
