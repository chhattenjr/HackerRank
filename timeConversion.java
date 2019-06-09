import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author chhattenjr
 * @date 06/07/2019
 * @description Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * 
 * @notes Had the most difficulty validating the string input.
 *
 */
public class timeConversion {

	static String timeConversion(String s) {
		String firstSubString = "";
		String secondSubString = "";
		String timeStamp = "";
		
		// Verifying timestamps seems near impossible..
		System.out.println(s.matches("^([0-2][1-9]):[0-5][0-9]:[0-5][0-9](\\s)?(?i)(am|pm)$"));
		
		// %d, \\d = decimal (integer) number (base-10)
		// Using different syntax...
		if(!s.matches("^([0-1][1-9]):[0-5][0-9]:[0-5][0-9](\\s)?(?i)(am|pm)$")) {
			System.out.println("Invalid Time String: " + s);
			System.exit(0);
		}
		
		if(s.contains(" ")) {
			timeStamp = s;
				
			System.out.println("Created Time Stamp with Space: " + timeStamp);
		} else {
			for(int i = 0; i < s.length(); i++) {
				if(Character.isAlphabetic(s.charAt(i))) {
					firstSubString = s.substring(0, i-1);
					secondSubString = s.substring(i-1, s.length());
				
					timeStamp = firstSubString + " " + secondSubString;

					System.out.println("Created Time Stamp: " + timeStamp);
				}	
			}
		}
		
		String timeIn12hour = timeStamp;
		
		System.out.println("Time in 12-hour format: " + timeIn12hour);
		
		System.out.println("PM check: " + s.contains("PM"));
		System.out.println("AM check: " + s.contains("AM"));
		System.out.println();
		
		SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ss a");
		
		String timeIn24hour = null;
		
		try {
			timeIn24hour = date24Format.format(date12Format.parse(timeIn12hour));
			
			System.out.println("Time in 24-hour format: " + timeIn24hour);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return timeIn24hour;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String localTime = "hh:mm:ss a";
		String timeStamp;
		DateFormat dateFormat = new SimpleDateFormat(localTime);
		
		String knownInvalidTimeStamp = "09:00:00PM";
		
		// 1. LocalTime
		LocalTime timeString = LocalTime.now();
		System.out.println("Time using LocalTime: ");
		System.out.println(timeString.format(DateTimeFormatter.ofPattern(localTime)));
		
		System.out.println();
		
		// 2. LocalDateTime
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println("Time using LocalDateTime: ");
		System.out.println(nowTime.format(DateTimeFormatter.ofPattern(localTime)));
		
		System.out.println();
		
		// 3. ZonedDateTime
		ZonedDateTime zonedTime = ZonedDateTime.now();
		System.out.println("Time using ZonedDateTime: ");
		System.out.println(zonedTime.format(DateTimeFormatter.ofPattern(localTime)));
		
		System.out.println();
		
		// 4. Date
		Date today = new Date();
		System.out.println("Time using Date: ");
		System.out.println(dateFormat.format(today));
		
		System.out.println();
		
		// 5. Calendar
		Calendar calToday = Calendar.getInstance();
		System.out.println("Time using calToday: ");
		System.out.println(dateFormat.format(calToday.getTime()));
		
		System.out.println();
		
		timeStamp = timeString.format(DateTimeFormatter.ofPattern(localTime));
		
		timeConversion(timeStamp);
		
		System.out.println();
		
		timeConversion(knownInvalidTimeStamp);
		
	}

}
