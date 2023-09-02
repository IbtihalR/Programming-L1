//
// this program about promet choose m to k or k to m 
/*
m x 1000
k/1000
*/
package convert;
import java.util.Scanner;
public class Convert {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("choose convert m to k or k to m? ");
    
   
      System.out.print("If you want convert m to k write 1 if you want k to m write any number ");
    int x= input.nextInt(); 
     double num;
     double k;
     double m;
     
     while(x>=0||x<0){ 
     if (1==x)
     {
       System.out.print("Enter your number ");
    num=input.nextDouble(); 
    k= num*1000;
        System.out.println(num+"m"+"="+k+"k"); 
        break;
     }
     else if (x==2) {
         System.out.print("Enter your number ");
    num=input.nextDouble();
     m= num/1000;
     System.out.println(num+"k"+"="+m+"m");
     break;
     
    }
     else
         System.out.print("If you want convert m to k write 1 if you want k to m write any number ");
    x= input.nextInt(); 
           
    
     }     
        }
    }
            
    
    

