import java.time.LocalDate; // Importing LocalDate class to handle dates
import java.time.LocalDateTime; // Importing LocalDateTime class to handle date and time

public class Gigasecond { // Defining the Gigasecond class
    final int gigasecondToSeconds = 1_000_000_000; // Constant for the number of seconds in a gigasecond
    private LocalDateTime dateAfterGigasecond; // Variable to store the date after adding a gigasecond

    public Gigasecond(LocalDate moment) { // Constructor that takes a LocalDate as input
        dateAfterGigasecond = moment.atStartOfDay().minusSeconds(-gigasecondToSeconds); // Convert to LocalDateTime and add gigaseconds
    }

    public Gigasecond(LocalDateTime moment) { // Constructor that takes a LocalDateTime as input
        dateAfterGigasecond = moment.minusSeconds(-gigasecondToSeconds); // Add gigaseconds directly
    }

    public LocalDateTime getDateTime() { // Method to retrieve the calculated date and time
        return dateAfterGigasecond; // Return the date after gigaseconds have been added
    }
}
