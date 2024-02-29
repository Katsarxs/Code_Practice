#include <stdio.h> // Include the standard input-output library.

/*

Assessment Exercise 5

The University library charges for photocopying of members of the University unit as follows:

Number of photocopies Price per photocopy
The first 10          2 cents
The next 50           2.5 cents
The next 100          3 cents
All next              4 cents
 

Implement a program in C that requests the number of photocopies and calculates and displays the payment amount in Euros with an accuracy of 2 decimal places.

*/

int main(void) { // Main function where the program execution begins.

    float a; // Declare variable to store the number of photocopies.

    printf("Bale arithmo : "); // Prompt the user to input the number of photocopies.

    scanf("%f", &a); // Read the number of photocopies from the user input.

    if (a <= 10) { // If the number of photocopies is less than or equal to 10.

        printf("%.2f", (a * 0.02)); // Calculate and print the payment amount.

    }

    else if (a >= 10 && a <= 60) { // If the number of photocopies is between 11 and 60.

        printf("%.2f", (0.2 + ((a - 10) * 0.025))); // Calculate and print the payment amount.

    }

    else if (a >= 60 && a <= 160) { // If the number of photocopies is between 61 and 160.

        printf("%.2f", (1.45 + ((a - 60) * 0.03))); // Calculate and print the payment amount.

    }

    else if (a > 160) { // If the number of photocopies is greater than 160.

        printf("%.2f", (4.45 + ((a - 160) * 0.04))); // Calculate and print the payment amount.

    }

}