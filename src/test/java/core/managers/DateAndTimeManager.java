package core.managers;

import java.util.Calendar;

import org.testng.Reporter;



public class DateAndTimeManager {


	
	  public static String f_generate_time_based_unique_integer(){
		  String result;
		  String y,mon,d,h,min,s,mil;
		  
		  Calendar now = Calendar.getInstance();
		  int year = now.get(Calendar.YEAR);
		  int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		  int day = now.get(Calendar.DAY_OF_MONTH);
		  int hour = now.get(Calendar.HOUR_OF_DAY);
		  int minute = now.get(Calendar.MINUTE);
		  int second = now.get(Calendar.SECOND);
		  int millis = now.get(Calendar.MILLISECOND);
		  
		  y = Integer.toString(year);
		  mon = Integer.toString(month);
		  d = Integer.toString(day);
		  h = Integer.toString(hour);
		  min = Integer.toString(minute);
		  s = Integer.toString(second);
		  mil = Integer.toString(millis);
		  
		  
		  result = y+mon+d+h+min+s;
		  Reporter.log("Unique Time based String Generated: " +  result,true);
			  
		  return result;
		  
	  }

}
