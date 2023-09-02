//Name: Ibtihal Radhi Almughamisi
//Date:7/11/2021
/*This program  prompts the user to enter the seconds as a String,
converts the received value to long, and displays the number of years and days 
for the received seconds. 
*/
package lab03homework01;
import java.util.Scanner;

public class Lab03Homework01 {//start class

    public static void main(String[] args) {//start main
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        String secounds=input.next();
        long s=Long.parseLong(secounds);
        
        long years=s/(365*24*60*60*10);
        
        long days=(s%(365*24*60*60*10))/(60*60*24);
        
        
        
        System.out.println("\'"+secounds+"\'"+" secounds is approximately "+"\'"+years+"\'"+" years and \'"+days+"\'"+" days");
        
 
        
    }//end main
    
}//end class
