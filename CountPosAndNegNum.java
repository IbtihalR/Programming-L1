
package countPosAndNegNum;

/**
 *
 * @author Ibtihal
 */
import java.util.Scanner;
public class CountPosAndNegNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.print("Enter an Integer number: ");
     int num = input.nextInt();
     int countP=0;
     int countN=0;
     double total=0;
     while(num!=0){
         total+=num;
         if ( num>0)
             countP++;
         else if(num<0)
                countN++;
       System.out.print("Enter an Integer number: ");  
        num = input.nextInt();  
     }
       System.out.println("P"+countP);
       System.out.println("N"+countN);
       System.out.println("T"+total);
       System.out.println("a"+(total/(countP+countN)));
       
    }
    
}
