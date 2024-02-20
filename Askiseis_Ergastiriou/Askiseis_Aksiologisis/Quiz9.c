#include <stdio.h> // Include standard input/output library.

/*

Assessment Exercise 9

Write a program that reads N student grades (scale 0 to 10) and stores them in the one-dimensional array grades[N].
Then count and display how many people passed and how many didn't (score >= 5 means passed).
Your program will be tested for N = 10 scores so define the size N of the array with a macro (#define N 10).

*/

int main(void) { // Main function where the program execution begins.

    float myArray[10]; // Declare array to store student grades.

    int i, x = 0, y = 0; // Declare variables for loop control and counting passed and failed students.

    for (i = 0; i < 10; i++) { // Loop to read grades for 10 students.

        float a; // Declare variable to store current grade.

        scanf("%f", &a); // Read grade input.

        myArray[i] = a; // Store grade in the array.

        if (a >= 5) { // Check if the grade represents a passing score.

            x += 1; // Increment the count of passed students.

        }

        else { // If the grade represents a failing score.

            y += 1; // Increment the count of failed students.

        }

    }

    printf("No of students passed: %d\n", x); // Print the number of students who passed.

    printf("No of students failed: %d", y); // Print the number of students who failed.

}