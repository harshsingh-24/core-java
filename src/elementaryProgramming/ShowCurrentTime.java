package elementaryProgramming;

public class ShowCurrentTime {

	public static void main(String[] args) {
		
		// Obtain the total milliseconds since midnight Jan1, 1970
		long totalMilliSeconds = System.currentTimeMillis(); // 12932904903793287 milliseconds
		
		// Obtain the total seconds since jan1, 1970
		long totalSeconds = totalMilliSeconds / 1000; 
		
		// Compute the current second in the current
		long currentSecond = totalSeconds % 60;
		
		// Obtain the totalMinutes
		long totalMinutes = totalSeconds / 60;
		
		// Current Minutes
		long currentMinute = totalMinutes % 60;
		
		// Total Hours
		long totalHours = totalMinutes / 60;
		
		// Current Hour
		long currentHour = totalHours % 24;
		System.out.println("Current time is: " + currentHour + " : " + currentMinute + 
				 " : " + currentSecond);
		
// remainder operator (% num) : [0 .. num - 1] [0,1,2]
				
				// 5000 seconds [0, 1, 2, 3.. 59] (% 60), 61 - 1, 62 - 2, 120 - 0 ( % 60)
				// minutes = [0, 1, 2, 3 ... 59] (% 60)
				// hours = [0, 1, 2 ... 23] (% 24) 25 hours = 25 % 24 = 1 
	}

}
