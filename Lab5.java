
package lab5;
import java.util.Scanner;
public class Lab5 {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter your word: ");
     String word=input.next();
    
     //word.charAt(0);
     //massage.substring(1)
     System.out.println("The original word "+"\""+word+"\"");
     System.out.print("The Output: ");
     System.out.print("\""+ word.substring(1));
     System.out.print(word.charAt(0));
     System.out.println("oi"+"\"");
    }
    
}
