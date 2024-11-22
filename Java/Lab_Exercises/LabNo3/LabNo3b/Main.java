public class Main {  // Main class where the program execution starts
    public static void main(String[] args) {  // Main method, the entry point for the program
        Company myCompany = new Company("Logitech");  // Create a new Company object with the name "Logitech"

        myCompany.insertCustomers(2);  // Call the insertCustomers method to add 2 customers to the company
        myCompany.displayCustomers();  // Call the displayCustomers method to show the list of customers
        myCompany.insertCustomers(1);  // Call the insertCustomers method to add 1 more customer to the company
        myCompany.displayCustomers();  // Call the displayCustomers method again to show the updated list of customers
        System.out.println("Total Incomes: " + myCompany.totalIncomes());  // Call the totalIncomes method to calculate and print the total incomes of the company
        myCompany.betterCustomer();  // Call the betterCustomer method to identify and display the best (or most valuable) customer
    }
}