//Name: Ibtihal 

//Date:11 /10/2021
//Quiz2
/*this program promet from the user to enter the whight of her family
and print the total of the wights 
*/ 

package quiz;
import java.util.Scanner;
public class Quiz {//start class

    public static void main(String[] args) {//start main
 Scanner input=new Scanner(System.in);
 System.out.print("Enter the number of your family: ");
 int numF=input.nextInt();
 int i=1;
 double wight;
 double total=0;
 while(i<=numF){//start loop
 System.out.print("Enter the wight of the person"+i+": ");
 wight=input.nextDouble();
 i++;
 
 total+=wight;
 
         }//end loop
 System.out.println("The sum of the wights of your family is: "+total);
 
    }//end main
    
}//end class
