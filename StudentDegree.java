/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdegree;
import java.util.Scanner;
public class StudentDegree {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

		// Prompt the user to enter number
		System.out.print("Enter numbers: ");
		int max = input.nextInt();	// Assign the first number to max
		int count = 1;					// Assign 1 to count
		int number = 0;						// Holds future inputs

		// Assume that the input ends with number 0
		while (number > 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			if (number == max)
				count++;
		} 

		// Display to results
		System.out.println("The largest number is " + max);
		System.out.println(
			"The occurrence count of the largest number is " + count);
	}
   
    }
    

