/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelargestnum;
import java.util.Scanner;
public class TheLargestnum {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter The numer");
double largestScore=input.nextDouble();
int countLargest=1;
double score = 0;


while (score>=0){
  
 score=input.nextDouble();

if (score>largestScore)
{
     largestScore=score;
     countLargest=0;
      
}
 
 if(score==largestScore)
     countLargest++;
 
 
 
 
}
System.out.println("The Largest score is "+largestScore);
System.out.println("The numer of the largest socer is "+countLargest);
    
    }
    
}
