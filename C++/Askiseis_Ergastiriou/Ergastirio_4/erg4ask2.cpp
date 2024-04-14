#include <iostream> // Include the input/output stream library
#include <string> // Include the string library

using namespace std; // Use the standard namespace

class Trapeze { // Define a class named Trapeze

private: // Private access specifier for class members

    int bigBase; // Integer variable to store the length of the big base of the trapeze

    int smallBase; // Integer variable to store the length of the small base of the trapeze

    int height; // Integer variable to store the height of the trapeze

public: // Public access specifier for class members

    // Constructor with default parameter values for initializing Trapeze objects
    Trapeze(int big_base = 2, int small_base = 2, int height_number = 4) {

        // Initialize the bigBase member variable with the provided argument or default value
        bigBase = big_base;

        // Initialize the smallBase member variable with the provided argument or default value
        smallBase = small_base;

        // Initialize the height member variable with the provided argument or default value
        height = height_number;
    }

    // Member function to calculate and display the area of the trapeze
    void calcAndshowTrapeze() {

        // Calculate the area of the trapeze using the formula ((bigBase + smallBase) * height) / 2
        double calcAnswer = (((bigBase + smallBase) * height) / 2);

        // Display the calculated area of the trapeze
        cout << "The Trapeze is : " << calcAnswer << " Square Units." << endl;
    }

};

int main() { // The starting point of the program

    Trapeze tr_1; // Declare an instance of the Trapeze class using the default constructor

    Trapeze tr_2(1); // Declare another instance of the Trapeze class with one parameter (big base)

    Trapeze tr_3(1, 2); // Declare another instance of the Trapeze class with two parameters (big base and small base)

    Trapeze tr_4(1, 2, 3); // Declare another instance of the Trapeze class with three parameters (big base, small base, and height)

    // Call the calcAndshowTrapeze() member function for each Trapeze object to calculate and display its area
    tr_1.calcAndshowTrapeze();

    tr_2.calcAndshowTrapeze();

    tr_3.calcAndshowTrapeze();

    tr_4.calcAndshowTrapeze();

    return 0; // Indicate successful program execution
    
}
