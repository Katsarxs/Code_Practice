#include <stdio.h> // Include the standard input-output library.

/*

Assessment Exercise 2

Create a C program that accepts 2 property values, the first of 2022 and the second of 2023 and looks and displays the rate of increase or decrease of the values ​​as a percentage to one decimal place (%).

*/

int main(void) { // Main function where the program execution begins.

    double x1, x2; // Declare variables to store the property values.

    scanf("%lf %lf", &x1, &x2); // Read the two property values from the user input.

    printf("%.1lf%%", ((x2 - x1) / x1) * 100); // Calculate and print the rate of increase or decrease as a percentage to one decimal place.

}