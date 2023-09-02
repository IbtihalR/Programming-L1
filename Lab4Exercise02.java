//Ibtihal
package lab4exercise02;
import java.util.Scanner;
public class Lab4Exercise02 {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter x1 and y1: ");
    double x1=input.nextDouble();
    double y1=input.nextDouble();
     System.out.print("Enter x2 and y2: ");
     double x2=input.nextDouble();
    double y2=input.nextDouble();
    double x=(x2-x1)*(x2-x1);
    double y=(y2-y1)*(y2-y1);
    double xy= x+y;
    double distance=Math.pow(xy,0.5);
    System.out.println("The distance between the two point is  "+distance);
         
     
    
    }
    
}
