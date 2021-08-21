import java.util.*;

public class SlowTime {
	
	static long milliseconds = System.currentTimeMillis();
	
	static TimeZone offsetTimeZone = 
			TimeZone.getTimeZone("America/Indianapolis");
	static long totalMilliseconds = milliseconds 
			+ offsetTimeZone.getOffset(Calendar.ZONE_OFFSET);	

	public static void main(String[] args) {

		// convert to total seconds from milliseconds since January 1, 1970;
		// some results are truncated because of integer division and casting	

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = (int) (totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;

		long currentMinute = (int) (totalMinutes % 60);

		long totalHours = totalMinutes / 60;
		long currentHour = (int) (totalHours % 24);

		System.out.println("\nIf Indianapolis didn't use daylight savings time,\n" 
		        + "the time would be " + currentMinute + " minute(s)" 
			+ " and " + currentSecond + " second(s)\nafter " + currentHour + "." 
			+ "\n\nThe zone used by the computer as an offset from\n"
			+ "Greenwich Mean Time (GMT) would still be \"America/Indianapolis\"\n"
			+ "or \"America/Indiana/Indianapolis\"!\n");		
	}	
}

