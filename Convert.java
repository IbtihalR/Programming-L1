//Name: Ibtihal Radhi Almughamisi
//Date:25 Oct 2021
/*This program converts kilograms ( from 1 to 199 ) to
pounds and converts pounds (from 20 to 515) to kilograms
*/
package convert;
public class Convert {//start class
    public static void main(String[] args) {//start main
        /*converts kilograms ( from 1 to 199 ) to
pounds*/
        System.out.println("converts kilograms ( from 1 to 199 ) to pounds");
        System.out.print("Kilograms");
      System.out.println("         Pounds");
      
      int countK=1; //number in kullograms
      double p;//in pounds
      
      while (countK<=199)
       {//strat while  
        System.out.print(countK);
        p=countK*2.2;//convert
        System.out.println("                 "+p);
        countK+=2;
       }//end while
   //    converts pounds (from 20 to 515) to kilograms
   System.out.println("converts pounds (from 20 to 515) to kilograms");
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
