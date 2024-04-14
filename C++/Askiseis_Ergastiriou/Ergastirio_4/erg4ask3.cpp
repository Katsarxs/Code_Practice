#include <iostream> // Include the input/output stream library
#include <string> // Include the string library

using namespace std; // Use the standard namespace

// Function to calculate the average of two numbers
void average(double a, double b) {

    double avrg = (a + b) / 2; // Calculate the average of the two numbers

    cout << "The average is : " << avrg << endl; // Display the calculated average

}

// Function to calculate the average of an array of numbers
void average(double c[], int d) {

    double sum = 0; // Variable to store the sum of elements in the array

    // Loop through the array and calculate the sum of its elements
    for (int i = 0; i < d; i++) {

        sum += c[i]; // Add each element of the array to the sum

    }

    // Calculate and display the average of the array elements
    cout << "The average is : " << sum / d << endl;

}

int main() { // The starting point of the program

    double e[6] = {1, 2, 3.3, 4, 5, 6}; // Declare and initialize an array of numbers

    average(1, 3); // Call the function to calculate the average of two numbers

    average(e, 6); // Call the function to calculate the average of elements in an array

    return 0; // Indicate successful program execution

}
