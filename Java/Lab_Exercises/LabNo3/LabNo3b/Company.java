import java.util.Scanner;  // Import the Scanner class for reading input from the console
public class Company {  // Define the Company class
    private String companyName;  // Declare a private String variable to store the company's name
    private Customer[] customers = new Customer[100];  // Declare an array to hold up to 100 Customer objects
    private int CustomersNumber;  // Declare a variable to track the current number of customers

    public Company(String companyName) {  // Constructor to initialize a Company object with the given name
        this.companyName = companyName;  // Set the company's name to the value provided in the constructor
    }

    public void insertCustomers(int N) {  // Method to add N customers to the company
        if (CustomersNumber + N <= 100) {  // Ensure that the company does not exceed 100 customers
            Scanner input = new Scanner(System.in);  // Create a new Scanner object for user input

            for (int i = 0; i < N; i++) {  // Loop to add N customers
                customers[CustomersNumber + i] = new Customer();  // Create a new Customer object and store it in the array
                System.out.println("Enter Customer Code:");  // Prompt the user to enter the customer code
                customers[CustomersNumber + i].setCode(input.next());  // Set the customer code using the user input
                System.out.println("Enter Customer Name:");  // Prompt the user to enter the customer name
                customers[CustomersNumber + i].setName(input.next());  // Set the customer name using the user input
                System.out.println("Enter Customer Address:");  // Prompt the user to enter the customer address
                customers[CustomersNumber + i].setAddress(input.next());  // Set the customer address using the user input
                System.out.println("Enter Customer Price:");  // Prompt the user to enter the customer price
                customers[CustomersNumber + i].setPrice(input.nextFloat());  // Set the customer price using the user input
            }
            CustomersNumber = CustomersNumber + N;  // Update the number of customers by adding N
        }
    }

    public void displayCustomers() {  // Method to display all customers' information
        for (int i = 0; i < CustomersNumber; i++) {  // Loop through all customers
            System.out.println(customers[i].toString());  // Print the string representation of each customer
        }
    }

    public double totalIncomes() {  // Method to calculate the total income from all customers
        double totalIncome = 0;  // Initialize the total income to 0
        for (int i = 0; i < CustomersNumber; i++) {  // Loop through all customers
            totalIncome += customers[i].getPrice();  // Add the price of each customer to the total income
        }
        return totalIncome;  // Return the total income
    }

    public void betterCustomer() {  // Method to identify and display the customer with the highest price
        double max = -1;  // Initialize max to a very low value to ensure it gets replaced with the actual customer price
        int customerNo = -1;  // Initialize customerNo to store the index of the customer with the highest price

        for (int i = 0; i < CustomersNumber; i++) {  // Loop through all customers
            if (max < customers[i].getPrice()) {  // Check if the current customer's price is greater than the current max
                max = customers[i].getPrice();  // Update max to the new highest price
                customerNo = i;  // Store the index of the customer with the highest price
            }
        }
        System.out.println(customers[customerNo].toString());  // Print the details of the customer with the highest price
    }
}