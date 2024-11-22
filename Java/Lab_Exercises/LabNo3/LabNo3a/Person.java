public class Person {  // Declare the Person class
    private String name;  // Declare a private String variable to store the person's name
    private int age;  // Declare a private int variable to store the person's age

    public Person(String n, int a) {  // Constructor that takes a name and age as parameters
        name = n;  // Assign the provided name to the 'name' instance variable
        age = a;  // Assign the provided age to the 'age' instance variable
    }

    public void addYears(int years) {  // Method to increase the person's age by a certain number of years
        if (years > 0) {  // Check if the input years is positive
            age += years;  // If the condition is true, increase the person's age by the specified years
        }
    }

    public String toString() {  // Override the toString() method to provide a custom string representation of the object
        return name + " " + age;  // Return the person's name and age as a string
    }
}