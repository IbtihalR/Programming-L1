//Ibtihal
package intnum;

import java.util.Scanner;
public class IntNum {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an Integer number: ");
     int num = input.nextInt();
     int countP=0, countN=0;
     double total=0;
     
     
    while(num!=0)
     {
         
         total+=num;
         if ( num>0)
            countP++;
         else if (num<0)
         countN++;
         
     System.out.print("Enter an Integer number: ");
     num=input.nextInt();
     
     
    }//end of while
    double average = total/(countP+countN);
    System.out.println("The number of positive is: "+countP);
    System.out.println("The number of negatove is : "+countN);
    System.out.println("The total is : "+total);
    System.out.println("The averge is : "+average);
    
    }
}
