import java.text.NumberFormat; // Importing NumberFormat class for formatting currency
import java.util.Scanner; // Importing Scanner class for user input

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12; // Constant for the number of months in a year
        final byte PERCENT = 100; // Constant for converting percentage to a decimal
        int principal = 0; // Variable to hold the loan principal amount
        float monthlyInterestRate = 0; // Variable to hold the monthly interest rate
        int numberOfPayments = 0; // Variable to hold the total number of payments (months)

        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for input

        // Loop to get a valid principal amount from the user
        while (true) {
            System.out.print("Principal ($1K - $1M): "); // Prompt for principal amount
            principal = scanner.nextInt(); // Read the principal amount

            // Check if the principal is within the valid range
            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000."); // Error message
                continue; // Restart the loop for valid input
            }
            break; // Exit the loop if input is valid
        }

        // Loop to get a valid monthly interest rate from the user
        while (true) {
            System.out.print("Monthly Interest Rate: "); // Prompt for monthly interest rate
            monthlyInterestRate = scanner.nextFloat(); // Read the monthly interest rate

            // Check if the interest rate is within valid bounds
            if (monthlyInterestRate <= 0 || monthlyInterestRate > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30."); // Error message
                continue; // Restart the loop for valid input
            }
            monthlyInterestRate = monthlyInterestRate / PERCENT / MONTHS_IN_YEAR; // Convert percentage to decimal
            break; // Exit the loop if input is valid
        }

        // Loop to get a valid number of payment years from the user
        while (true) {
            System.out.print("Period (Years): "); // Prompt for number of years
            numberOfPayments = scanner.nextInt(); // Read the number of years

            // Check if the number of years is within valid range
            if (numberOfPayments < 1 || numberOfPayments > 30) {
                System.out.println("Enter a value between 1 and 30."); // Error message
                continue; // Restart the loop for valid input
            }
            numberOfPayments *= MONTHS_IN_YEAR; // Convert years to months
            break; // Exit the loop if input is valid
        }

        // Calculate the monthly mortgage payment using the formula
        double monthlyPayment = principal * ((monthlyInterestRate * Math.pow(monthlyInterestRate + 1, numberOfPayments))
                / (Math.pow(monthlyInterestRate + 1, numberOfPayments) - 1));

        // Display the calculated monthly payment formatted as currency
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
    }
}