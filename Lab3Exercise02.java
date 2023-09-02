//Ibtihal
package lab3exercise02;
import java.util.Scanner;
public class Lab3Exercise02 {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter speed and acceleration: ");
    double v=input.nextDouble();
     double a=input.nextDouble();
     double length=(v*v)/(2*a);
     System.out.print("Enter speed and acceleration: "+ length);
     
    
    }
    
}
