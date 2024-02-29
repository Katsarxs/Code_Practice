#include <stdio.h> // Include the standard input-output library.
#include <math.h> // Include the math library for mathematical functions.

/*

Assessment Exercise 4

Implement a program in C to solve the quadratic equation ax2+bx+c=0 with the help of the Discriminant.
The discriminant is calculated as: d = b2 - 4ac
The program will accept from the input the 3 values ​​of a, b, c and will print the result on the screen depending on the distinguishing d as follows:
If d > 0, then it has two unequal solutions.
An d = 0, then it has a dual solution.
If d < 0, then it has no solution and will print the message "Den exei lysi" (In Latin characters so as not to create any problem with the Greek characters in the program)

*/

int main(void) { // Main function where the program execution begins.

    float a, b, c; // Declare variables to store the coefficients of the quadratic equation.

    printf("Grapse a : "); // Prompt the user to input the value of 'a'.

    scanf("%lf", &a); // Read the value of 'a' from the user input.

    printf("Grapse b : "); // Prompt the user to input the value of 'b'.

    scanf("%lf", &b); // Read the value of 'b' from the user input.

    printf("Grapse c : "); // Prompt the user to input the value of 'c'.

    scanf("%lf", &c); // Read the value of 'c' from the user input.

    float d = ((pow(b, 2)) - (4 * a * c)); // Calculate the discriminant.

    if (d > 0) { // If discriminant is greater than 0.

        float x1 = (((-b) + (sqrt(d))) / (2 * a)); // Calculate the first solution.

        float x2 = (((-b) - (sqrt(d))) / (2 * a)); // Calculate the second solution.

        printf("x1=%lf,x2=%lf", x1, x2); // Print the solutions.

    }
    
    else if (d == 0) { // If discriminant is equal to 0.

        float x = ((-b) / (2 * a)); // Calculate the single solution.

        printf("x=%lf", x); // Print the solution.

    }
    
    else { // If discriminant is less than 0.

        printf("Den exei lysi"); // Print the message indicating no real solutions.

    }

}