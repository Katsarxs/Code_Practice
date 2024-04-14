#include <iostream> // Include the input/output stream library for standard input/output operations.

/*

Assessment Exercise 1

Implement a program that manages temperatures.
For this reason, implement a class named Temperature which internally stores a temperature in degrees Kelvin.
However, also create the functions setTempKelvin, setTempFahrenheit, and setTempCelsius, which accept an input temperature with the corresponding temperature scale and, in each case, store it in Kelvin format in the class member variable.
Also create a member function that displays the stored temperature in degrees Kelvin.
You are given the function main() in which it reads 2 temperatures and prints the temperature in Kelvin respectively using the member functions of the temp object.
Use the following equations to convert between the three temperature scales:

Kelvin = Celsius + 273.15
Celsius = (5/9) x (Fahrenheit - 32)

*/

using namespace std; // Import the standard namespace to simplify code writing.

class Temperature { // Declare a class named Temperature.

private:

    double theEnd; // Declare a private member variable to store temperature.

public:

    void setTempCelsius(double x) { // Define a method to set temperature in Celsius.

        theEnd = (x + 273.15); // Convert Celsius to Kelvin.

    }

    void setTempFahrenheit(double y) { // Define a method to set temperature in Fahrenheit.

        theEnd = (y - 32) * 5 / 9 + 273.15; // Convert Fahrenheit to Kelvin.

    }

    void displayResult() { // Define a method to display the converted temperature.

        cout << "The temperature in Kelvin is: " << theEnd; // Display the temperature in Kelvin.

    }

};

int main() { // Define the main function.

    Temperature temp; // Create an object of the Temperature class.

    double var_celsius, var_fahr; // Declare variables to store input temperatures.

    cout << "Enter Celsius: "; // Prompt the user to enter a temperature in Celsius.

    cin >> var_celsius; // Read the input Celsius temperature.

    temp.setTempCelsius(var_celsius); // Convert and set the temperature in Celsius.

    temp.displayResult(); // Display the temperature in Kelvin.

    cout << "\nEnter Fahrenheit: "; // Prompt the user to enter a temperature in Fahrenheit.

    cin >> var_fahr; // Read the input Fahrenheit temperature.

    temp.setTempFahrenheit(var_fahr); // Convert and set the temperature in Fahrenheit.

    temp.displayResult(); // Display the temperature in Kelvin.

    return 0; // Return 0 to indicate successful program execution.

}
