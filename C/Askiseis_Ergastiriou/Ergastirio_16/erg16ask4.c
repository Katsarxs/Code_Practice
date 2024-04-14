#include <stdio.h>      // Include standard input/output library for printf function
#include <stdlib.h>     // Include standard library for rand() and srand() functions
#include <time.h>       // Include time library for time() function

/*

Laboratory 16, Exercise 4.

In the table GRADES[100][3] there are 100 student grades for 3 assignments.
In the CODE table there are respectively the codes (4-digits) of the students.

A program that displays the code and assignment for each student who has received a 10 on the assignment.
In the event that no task with 10 was found, display a corresponding message.

*/

#define S 100           // Define constant S as 100 for the number of students
#define G 3             // Define constant G as 3 for the number of assignments

int main(void) { // Main function where the program execution begins

    srand(time(NULL));  // Seed the random number generator with current time

    int GRADES[S][G];   // Declare a 2D array to store grades for each student and assignment

    // Loop to generate random grades for each student and assignment

    for (int i = 0; i < S; i++) {

        for (int j = 0; j < G; j++) {

            GRADES[i][j] = 0 + rand() % 11; // Assign a random grade between 0 and 10

        }
        
    }

    int CODE[S];        // Declare an array to store student codes

    // Loop to generate random codes for each student

    for (int i = 0; i < S; i++) {

        CODE[i] = 1000 + rand() % 9000;    // Generate a random 4-digit code

    }

    int f = 0;  // Flag variable to indicate if a student with a grade of 10 is found

    // Nested loops to iterate through all students and assignments

    for (int i = 0; i < S; i++) {

        for (int j = 0; j < G; j++) {

            if (GRADES[i][j] == 10) {   // Check if the grade is 10

                printf("Student With Code %d Wrote 10.\n", CODE[i]); // Print the student code if grade is 10

                f = 1;  // Set the flag to indicate that a student with grade 10 is found

            }
            
        }

    }

    if (f == 0) {   // Check if no student with grade 10 is found

        printf("No Student With 10 Found.\n");   // Print corresponding message

    }

}