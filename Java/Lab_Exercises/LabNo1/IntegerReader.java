import java.util.Scanner; // Import the Scanner class for user input

public class IntegerReader { // Define the main class
    public static void main(String[] args) { // Main method where the program execution starts
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
        int all = 0, odd = 0, even = 0; // Initialize counters for total, odd, and even numbers
        while (true) { // Start an infinite loop to continuously read input
            int number = input.nextInt(); // Read the next integer from the user
            if (number == 0) { // Check if the number is zero
                break; // Exit the loop if the number is zero
            } else if (number % 2 == 0) { // Check if the number is even
                even++; // Increment the even counter
            } else { // If the number is not even, it must be odd
                odd++; // Increment the odd counter
            }
            all++; // Increment the total counter for all numbers entered
        }
        // Print the total number of integers entered
        System.out.println("How Many : " + all);
        // Print the total number of odd integers entered
        System.out.println("How Many odd : " + odd);
        // Print the total number of even integers entered
        System.out.println("How Many even : " + even);
    }
}