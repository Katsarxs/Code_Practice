class LeapYear { // Define the LeapYear class
    boolean isLeapYear(int year) { // Method to check if the given year is a leap year
        boolean isIt = false; // Initialize isIt as false
        if (year % 4 == 0) { // Check if the year is divisible by 4
            if (year % 100 == 0) { // Check if the year is divisible by 100
                isIt = year % 400 == 0; // Set isIt based on divisibility by 400
            } else {
                isIt = true; // Set isIt to true if divisible by 4 but not by 100
            }
        }
        return isIt; // Return the result
    }
}