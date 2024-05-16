package streamAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * How will you get the current date and time using Java 8 Date and Time API?
 */

public class CurrentDateTime {

	public static void main(String[] args) {
		System.out.println("Current Local Date: " + LocalDate.now());
		// Used LocalDate API to get the date
		System.out.println("Current Local Time: " + LocalTime.now());
		// Used LocalTime API to get the time
		System.out.println("Current Local Date and Time: " + LocalDateTime.now());
		// Used LocalDateTime API to get both date and time
	}

}
