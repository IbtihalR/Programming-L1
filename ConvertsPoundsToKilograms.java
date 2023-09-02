//Name: Ibtihal Radhi Almughamisi
//Date: Sat,23 Oct 2021
//This programconverts pounds (from 20 to 515) to kilograms
package convertspoundstokilograms;
public class ConvertsPoundsToKilograms {//start class   
    public static void main(String[] args) {//start main

      System.out.print("Pounds");
      System.out.println("         Kilograms");
      
       int countP=20;//number in pounds
       double k;//in kilograms
       
       while (countP<=515)
       {//strat while  
        System.out.print(countP);
        k=countP/2.2;//convert
        System.out.println("             "+k);
        countP+=5;
       }//end while
       

    }//end main
}//end class
