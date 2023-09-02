//Ibtihal
//this code print the muultiplication table of any positive number
package example1lab6;
import java.util.Scanner;
public class Example1Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a positive integar: ");
        number=input.nextInt();
        System.out.println("The muultiplication table of "+ number);
        for(int i=1; i<=10; i++)
        { System.out.println(number+"x"+i+"="+(number*i));
        
        }
    }
    
}
