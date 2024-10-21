public class CarInsurancePolicy { // Define the CarInsurancePolicy class
    private int policyNumber; // Private variable to store the policy number
    private int paymentsNumber; // Private variable to store the number of payments per year
    private String residentCity; // Private variable to store the resident city

    // Constructor that initializes all three fields
    public CarInsurancePolicy(int number, int payments, String city) {
        policyNumber = number; // Assign the provided number to policyNumber
        paymentsNumber = payments; // Assign the provided payments to paymentsNumber
        residentCity = city; // Assign the provided city to residentCity
    }

    // Constructor that initializes policyNumber and paymentsNumber, with a default city
    public CarInsurancePolicy(int number, int payments) {
        policyNumber = number; // Assign the provided number to policyNumber
        paymentsNumber = payments; // Assign the provided payments to paymentsNumber
        residentCity = "Athens"; // Set residentCity to a default value "Athens"
    }

    // Constructor that initializes policyNumber with a default paymentsNumber and city
    public CarInsurancePolicy(int number) {
        policyNumber = number; // Assign the provided number to policyNumber
        paymentsNumber = 2; // Set paymentsNumber to a default value of 2
        residentCity = "Athens"; // Set residentCity to a default value "Athens"
    }

    // Method to display the policy details
    public void display() {
        // Print the policy details including number, payments, and city
        System.out.println("\nInsurance Number: " + policyNumber +
                "\nPayments per Year: " + paymentsNumber +
                "\nResident City: " + residentCity);
    }
}