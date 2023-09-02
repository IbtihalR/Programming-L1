/*
Ibtihal ALmughamisi
 */
package readint;
import java.util.Scanner;
public class ReadInt {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number between 0 and 1000:  ");
  int number = input.nextInt();
  // first digit
  int digit1= number %10;
  // secound digit
  int x1 = number/10;
  int digit2= x1%10;
  //third digit
  int x2 = x1/10;
  int digit3=x2%10;
  //compare digit1 with digit3
  if (digit1==digit3)
  {
      System.out.println(number+"  is a palindrome");
  }
  else 
      System.out.println(number+"  is not a palindrome");
         
  
  
    }
    
}
