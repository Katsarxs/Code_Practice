public class Customer {  // Define the Customer class
    private String customerCode;  // Declare a private String variable to store the customer's code
    private String name;  // Declare a private String variable to store the customer's name
    private String address;  // Declare a private String variable to store the customer's address
    private double price;  // Declare a private double variable to store the price associated with the customer (likely the amount they owe or spend)

    public void setCode(String customerCode) {  // Setter method for customerCode
        this.customerCode = customerCode;  // Set the customerCode field with the value passed in the method argument
    };

    public void setName(String name) {  // Setter method for name
        this.name = name;  // Set the name field with the value passed in the method argument
    };

    public void setAddress(String address) {  // Setter method for address
        this.address = address;  // Set the address field with the value passed in the method argument
    };

    public void setPrice(double price) {  // Setter method for price
        this.price = price;  // Set the price field with the value passed in the method argument
    };

    public double getPrice() {  // Getter method for price
        return price;  // Return the value of the price field
    };

    @Override
    public String toString() {  // Override the toString() method to return a custom string representation of the object
        return "Customer Code:" + customerCode + " Name:" + name + " Address:" + address + " Price:" + price;  // Return a formatted string with customer details
    }
}