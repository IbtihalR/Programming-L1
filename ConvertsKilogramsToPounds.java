//Name: Ibtihal 
//Date: Sat,23 Oct 2021
/*This program converts kilograms ( from 1 to 199 ) to
pounds.
*/

package convertskilogramstopounds;

public class ConvertsKilogramsToPounds {//start class
    
    public static void main(String[] args) {//start main
        
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
    }//end main   
}//end class
