//Ibtihal
package time;
public class Time {
    public static void main(String[] args) 
    {
 // obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

 // obtain the total seconds since midnight, Jan1, 1970
   long totalSeconds = totalMilliseconds / 1000;
   
 // Complute the current second in the minute in the hour 
    long currentSecond = totalSeconds %60;
 
 // obtain the total minutes
   long totalMinutes = totalSeconds / 60;
 
 //comute the current minute in the hour
    long currentMinute = totalMinutes % 60;
 
 // obtain the total hours
 long totalHours =totalMinutes / 60;
 
 
 // cmpute the current hour 
 long currentHour = totalHours % 24;
 
 //Disply results
 System.out.println("current time is "+ currentHour + ":" + currentMinute + ":"
         + currentSecond + " GMT");   
    }
    
}
