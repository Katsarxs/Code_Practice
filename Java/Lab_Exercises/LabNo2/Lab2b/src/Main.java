public class Main { // Define the Main class
    public static void main(String[] args) { // Main method, entry point of the program
        // Create a new CarInsurancePolicy object for carOne with specific policy number, payments, and city
        CarInsurancePolicy carOne = new CarInsurancePolicy(3, 5, "Monaco");
        // Create a new CarInsurancePolicy object for carTwo with specific policy number and payments, default city
        CarInsurancePolicy carTwo = new CarInsurancePolicy(6, 7);
        // Create a new CarInsurancePolicy object for carThree with specific policy number, default payments and city
        CarInsurancePolicy carThree = new CarInsurancePolicy(9);

        // Display the details of carOne
        carOne.display();
        // Display the details of carTwo
        carTwo.display();
        // Display the details of carThree
        carThree.display();
    }
}