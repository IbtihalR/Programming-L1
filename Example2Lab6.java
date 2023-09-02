//Ibtihal Radhi

package example2lab6;
import java.util.Scanner;
public class Example2Lab6 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int userInput;
    int factorial;
    int i;
    do 
    {
        System.out.print("Enter a positive integer: ");
        userInput=input.nextInt();
        if (userInput==999)
        {
            System.out.println("The program will be terminated...\n"+"Good Bye...");
            System.exit(0);
            
        } 
        factorial=1;
        i=1;
        while(i<=userInput)
        {
            factorial*=i;
            i++;
        }
        System.out.println("The factorial of "+userInput+" = "+factorial);
    
    }while(userInput!=999);
    }
    
}//end class
