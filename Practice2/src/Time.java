import java.util.Date; 
public class Time { 
 private static int hour; 
 private int minute; 
 private int second; 
  
 public Time(int hour, int minute, int second) { 
  this.hour = hour; 
  this.minute = minute; 
  this.second = second; 
 } 
 private boolean isValidTime(int hour, int minute, int second) { 
        return (hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60); 
    } 
 public void setTime() { 
  if (!isValidTime(hour, minute, second)) { 
            System.out.println("Invalid time provided"); 
        } 
        this.hour = hour; 
        this.minute = minute; 
        this.second = second; 
 } 
 public String toUniversal() { 
   return String.format("%02d:%02d:%02d", hour, minute, second); 
 } 
 public String toStandard() { 
  int hourInStandard = hour % 12; 
        String ampm; 
        if (hour % 12 == 0) { 
         hourInStandard = 12; 
        } else { 
         hourInStandard = hour % 12; 
        } 
        if (hour < 12) { 
         ampm = "AM"; 
        } else { 
         ampm = "PM"; 
        } 
        return String.format("%02d:%02d:%02d %s", hourInStandard, minute, second, ampm); 
 } 
 
 public static int getHour() {
	 return Time.hour;
 }

}
