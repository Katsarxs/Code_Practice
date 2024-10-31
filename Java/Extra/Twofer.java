public class Twofer { // Define the Twofer class
    public String twofer(String name) { // Method that takes a name and returns a formatted string
        String outputUser; // Declare a variable to hold the output string
        if (name != null) { // Check if the name is not null
            outputUser = "One for " + name + ", one for me."; // Format the string with the provided name
        } else { // If the name is null
            outputUser = "One for you, one for me."; // Use the default message
        }
        return outputUser; // Return the formatted output string
    }
}