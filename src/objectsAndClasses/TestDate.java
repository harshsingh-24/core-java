package objectsAndClasses;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
//		System.currentTimeMillis(); 
		Date date = new Date(); // constructs a date objects with milliseconds
		// elapsed since Jan 1, 1970;
		
		System.out.println(date.toString());
		
		// set a specific elapsed time since jan 1, 1970
		Date date2 = new Date(200000000000000L);
		System.out.println(date2.toString());
		
	}

}
