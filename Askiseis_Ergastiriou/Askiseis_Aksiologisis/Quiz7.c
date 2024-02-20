#include <stdio.h> // Include standard input/output library.
#include <math.h> // Include math library for pow function.

/*

Assessment Exercise 7

Write a function named get_bmi which takes as parameters the height in meters and the weight in kilograms of a person and returns the body mass index (BMI – Body Mass Index) based on the formula: BMI = Weight in kilograms / ( Height in meters)2.
Write a second function named print_status that accepts a person's BMI and displays a person's status according to the table:

BMI                        Person status Display message
Smaller than 18.5          Ellipovares   Ellipovares
Between 18.5 and under 25  Physiologiko  Fysiologiko
Between 25 and under 30    Overweight    Ypervaro
From 30 and over           Obese         Pachysarko

Finally, write a program that repeatedly requests the height and weight of individuals and using the above functions to display the status of the individual.
The iterative process will stop when the user enters 0 for any weight or height value.

*/

float get_bmi(float, int), print_status(float); // Function prototypes for get_bmi and print_status.

float a, height; // Declare variables for BMI and height.

int weight; // Declare variable for weight.

int main(void) { // Main function where the program execution begins.

    do {

        scanf("%f %d", &height, &weight); // Read height and weight input from the user.

        if (height == 0 || weight == 0) { // If either height or weight is zero, exit loop.

            break;
            
        }

        a = get_bmi(height, weight); // Calculate BMI using the get_bmi function.

        print_status(a); // Print the status based on BMI using the print_status function.

    } while(1); // Infinite loop until break statement is encountered.
    

}

float get_bmi(float height, int weight) {

    float x = (weight / pow(height, 2)); // Calculate BMI using the provided formula.

    return x; // Return the calculated BMI.

}

float print_status(float y) {

    if (y < 18.5) { // If BMI is less than 18.5.

        printf("Ellipovares\n"); // Print status: Ellipovares.

    }

    else if (y >= 18.5 && y < 25) { // If BMI is between 18.5 and 25.

        printf("Fysiologiko\n"); // Print status: Fysiologiko.

    }

    else if (y >= 25 && y < 30) { // If BMI is between 25 and 30.

        printf("Ypervaro\n"); // Print status: Ypervaro.

    }

    else if (y >= 30){ // If BMI is 30 or greater.

        printf("Pachysarko\n"); // Print status: Pachysarko.

    }

}