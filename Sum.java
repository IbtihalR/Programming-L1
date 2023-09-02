//Ibtihal
package sum;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  System.out.print("Enter a number between 0 and 1000:  ");
  int number = input.nextInt();
  // first digit
  int digit1= number %10;
  // secound digit
  int digit2= number%100;
  //third digit
  int digit3=number%1000;
  int sum = digit1+digit3+digit2;
  System.out.println("The sum of the digits is "+ sum);
    }
    
}
