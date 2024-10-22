import java.text.NumberFormat; // Importing NumberFormat for formatting currency
import java.util.Scanner; // Importing Scanner for user input handling

// Defining the MortgageCalculator class
public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12; // Constant for the number of months in a year
    final static byte PERCENT = 100; // Constant for percentage conversion

    // Main method where program execution begins
    public static void main(String[] args) {
        int principal = (int) readValue("Principal ($1K - $1M): ", 1_000, 1_000_000); // Reading principal amount from user
        float annualInterestRate = (float) readValue("Annual Interest Rate: ", 0, 30); // Reading annual interest rate from user
        byte years = (byte) readValue("Period (Years): ", 1, 30); // Reading loan period in years from user

        calculateAndDisplayMortgage(principal, annualInterestRate, years); // Calculating and displaying monthly mortgage payment
        calculateAndDisplayRemainingBalance(principal, annualInterestRate, years); // Calculating and displaying remaining balance schedule
    }

    // Method to read a numeric value from user
    public static double readValue(String userPrompt, double min, double max) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for input
        double value; // Variable to store the user input

        while (true) { // Loop to ensure valid input
            System.out.print(userPrompt); // Prompting user for input
            value = scanner.nextFloat(); // Reading user input

            if (value < min || value > max) { // Checking if the value is within the specified range
                System.out.println("Enter a value between " + min + " and " + max + "."); // Error message
                continue; // Continue loop for new input
            }
            break; // Exit loop if input is valid
        }
        return value; // Return the validated input value
    }

    // Method to calculate monthly mortgage payment
    public static void calculateAndDisplayMortgage(int principal, float annualInterestRate, byte years) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR; // Calculating monthly interest rate
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // Calculating total number of payments
        double mortgage = principal * ((monthlyInterestRate * Math.pow(monthlyInterestRate + 1, numberOfPayments)) / (Math.pow(monthlyInterestRate + 1, numberOfPayments) - 1)); // Calculating monthly mortgage payment
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + toDollar(mortgage)); // Displaying monthly mortgage payment
    }

    // Method to calculate remaining balance
    public static void calculateAndDisplayRemainingBalance(int principal, float annualInterestRate, byte years) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR; // Monthly interest rate for balance calculation
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR); // Total number of payments
        double loanBalance = 1; // Initializing loan balance variable
        int i = 1; // Initializing payment count
        System.out.println("\nPAYMENT SCHEDULE\n----------------"); // Header for payment schedule

        while (loanBalance != 0) { // Loop to calculate and display remaining balance
            loanBalance = principal * ((Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, i)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1)); // Calculating remaining loan balance
            System.out.println(toDollar(loanBalance)); // Displaying remaining balance as currency
            i += 1; // Incrementing payment count
        }
    }

    // Method to format a number as currency
    public static String toDollar(double number) {
        return NumberFormat.getCurrencyInstance().format(number); // Returning formatted currency string
    }
}