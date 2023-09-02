//Name: Ibtihal Radhi Almughamisi
//Date:19/11/2021
//This program  count all vowels in a string.
package lab9exercises1;
import java.util.Scanner;
public class Lab9Exercises1 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter your word: ");
    String word=input.nextLine();
    int count=countVowelsInAWord(word);
    System.out.println("the count of all vowels in your word is: "+count);
            
    }
    public static int countVowelsInAWord(String word){//start method
        int count=0;       
       int length=word.length();
       char ch;
       for(int i=0;i<length;i++){//start for loop
          ch=word.charAt(i); 
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//Ibtihal=2vowel in a word bcs 'I' is Uppercase
          count++;
       if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')//Ibtihal=3vowel in a word 
          count++;
       else
           count+=0;
       }//end for loop
        return count;
    }//end method
    
}//end class
