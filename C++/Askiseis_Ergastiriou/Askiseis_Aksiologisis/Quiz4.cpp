#include <iostream> // Include the input/output stream library
#include <string> // Include the string library

/*

Assessment Exercise 4

Implement a C++ program that contains a Person class whose members are a person's first and last name and a unique code.
This unique code is a 3-digit serial number starting from 101.
That is, the first Person object will automatically get the unique code 101, the 2nd 102.
Use a static variable in which to store the sequence number that has been used so far.
Use private variables to store first name, last name, and password.
The creation of objects should be done with a constructor, giving the first and last name (the code will be given automatically).
If no element is given it creates object with name “agnwsto” and last name “agnwsto”.
You don't need to define any method other than the constructor(s) and print().
In main() you will create 2 objects, one with name and surname given by the user and another one without name and surname.
In both you will call the print() member function to print the elements to the screen.

*/

using namespace std; // Use the standard namespace

class Person { // Define a class named Person

private:

    string firstName; // Private member variable to store first name

    string lastName; // Private member variable to store last name

    int uniqueCode; // Private member variable to store unique code

    static int nextUniqueCode; // Static member variable to store the next unique code

public:

    Person(string fName = "agnwsto", string lName = "agnwsto") : // Constructor with default values for first and last name

        firstName(fName), lastName(lName), uniqueCode(nextUniqueCode++) {} // Initialize member variables

    void printPerson() { // Member function to print person's details

        cout << uniqueCode << ") " << "Onoma: " << firstName << ", Epwnymo: " << lastName << endl; // Output person's details

    }

};

int Person::nextUniqueCode = 101; // Initialize static member variable

int main() { // Main function

    string name, surname; // Declare variables to store name and surname

    cin >> name >> surname; // Input name and surname from the user

    Person person1(name, surname); // Create an instance of Person with provided name and surname

    Person person2; // Create another instance of Person with default values

    person1.printPerson(); // Print details of person1

    person2.printPerson(); // Print details of person2

    return 0; // Return 0 to indicate successful completion

}
