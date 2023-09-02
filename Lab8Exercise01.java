//Name: Ibtihal Radhi Almughamisi

//Date:13 November 2021
//This program converts foot to meter and meter to foot

package lab8exercise01;

public class Lab8Exercise01 {//start class
    public static double footToMeter(double foot){//start footToMeter method
     return 0.305*foot;
     
    }//end methods foot to meter
    public static double meterToFoot(double meter){//start meterToFoot method
        return meter*3.279;
        
    }//start meterToFoot method
    public static void main(String[] args) {//start main
        
            
            System.out.println("1.0 foot= "+footToMeter(1.0)+" meter");
            System.out.println("2.0 foot= "+footToMeter(2.0)+" meter");
            System.out.println("3.0 foot= "+footToMeter(3.0)+" meter");
        
            System.out.println("20.0 meter= "+meterToFoot(20.0)+" foot");
            System.out.println("21.0 meter= "+meterToFoot(21.0)+" foot");
            System.out.println("22.0 meter= "+meterToFoot(22.0)+" foot");
        
    }//end main
    
}//end class
