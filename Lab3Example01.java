//Ibtihal
//convert Fahrenheit to Celsius
package lab3example01;
import java.util.Scanner;
public class Lab3Example01 {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System .in );
        System.out.print("Enter a degree in Fahrenheit ");
        double fahrenheit=input.nextDouble();
        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("fehrenheit\""+fahrenheit+"\"is\""+celsius+"\" in Celsius");
        
    }
    
}
