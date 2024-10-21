public class Main { // Define the Main class
    public static void main(String[] args) { // Main method, entry point of the program
        Student studentOne = new Student(); // Create a new Student object for studentOne
        Student studentTwo = new Student(); // Create a new Student object for studentTwo

        studentOne.setName("Alex"); // Set the name of studentOne to "Alex"
        studentOne.setSurName("Cols"); // Set the surname of studentOne to "Cols"
        studentOne.setRegistrationNumber(384958372); // Set the registration number of studentOne

        studentTwo.setName("Peter"); // Set the name of studentTwo to "Peter"
        studentTwo.setSurName("Pols"); // Set the surname of studentTwo to "Pols"
        studentTwo.setRegistrationNumber(384928342); // Set the registration number of studentTwo

        System.out.println(studentOne); // Print the details of studentOne
        System.out.println(studentTwo); // Print the details of studentTwo
    }
}