
package lab05ex2;
import java.util.Scanner;
public class Lab05Ex2 {

    public static void main(String[] args) {
       
       char userGrade;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a grade: ");
       userGrade=input.next().charAt(0);
       
       switch (userGrade)
       {
        case'A':
             System.out.println("\'A\' grade <==> Excellent ");
             break;
        case'B':
            System.out.println("\'B\' grade <==> Good ");
            break;
        case'C':
             System.out.println("\'C\' grade <==> Average ");
             break;
        case'D':
            System.out.println("\'D\' grade <==> Deficient ");
            break;
        case'F':
             System.out.println("\'F\' grade <==> Failing ");
             break;
        default:
            System.out.println("Invalid grade");
                
       }
       
    }
    
}
