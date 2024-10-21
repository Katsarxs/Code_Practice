public class Student { // Define the Student class
    private String studentName; // Private variable to store the student's name
    private String studentSurName; // Private variable to store the student's surname
    private int studentRegistrationNumber; // Private variable to store the student's registration number

    public void setName(String name) { // Method to set the student's name
        studentName = name; // Assign the provided name to the studentName variable
    }

    public void setSurName(String surName) { // Method to set the student's surname
        studentSurName = surName; // Assign the provided surname to the studentSurName variable
    }

    public void setRegistrationNumber(int registrationNumber) { // Method to set the student's registration number
        studentRegistrationNumber = registrationNumber; // Assign the provided registration number
    }

    @Override // Annotation to indicate that we are overriding the toString method
    public String toString() { // Method to return a string representation of the Student object
        return "\nStudent Name: " + studentName + // Include the student's name in the string
                "\nStudent SurName: " + studentSurName + // Include the student's surname in the string
                "\nRegistration Number: " + studentRegistrationNumber; // Include the registration number in the string
    }
}