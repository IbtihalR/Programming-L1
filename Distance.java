//Name: Ibtihal 
//Date: Sat,2 Oct 2021
/*
This program prompts the user to enter two points
and then calculates the distance between them
finally displays the distance between them.
*/ 
package distance;
import java.util.Scanner;
public class Distance {

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter x1 and y1:");//(x1,y1)
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print("Enter x2 and y2:"); //(x2,y2)
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    
    // A=(x2-x1)
    // A2=A^2 
    double A = x2-x1;
    double A2 = Math.pow(A, 2);
    // B= (y2-y1)
    // B2= B^2
    double B = y2-y1;
    double B2 = Math.pow(B, 2);
    // C=A2+B2
    double C= A2+B2;
    double distance = Math.pow(C, 0.5);
    System.out.println("The distance between the two points is"+" "+ distance);
    }//end of main()
    
}//end of class Distance
