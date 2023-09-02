//Ibtihal
package lab4example01;
import java.util.Scanner;
public class Lab4Example01 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the lenght: ");
        double lenght=input.nextDouble();
        System.out.print("Enter the width: ");
        double width=input.nextDouble();
        System.out.print("Enter the height: ");
        double height=input.nextDouble();
        System.out.print("Enter the number of doors: ");
        double door=input.nextDouble();
        System.out.print("Enter the number of windows: ");
        double window=input.nextDouble();
        double total=2*((lenght*width)+(lenght*height)+(width*height));
        
        
        
        
    }
    
}
