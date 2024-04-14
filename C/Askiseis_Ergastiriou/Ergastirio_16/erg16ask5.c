#include <stdio.h>      // Include standard input/output library for printf function
#include <stdlib.h>     // Include standard library for rand() and srand() functions
#include <time.h>       // Include time library for time() function

/*

Laboratory 16, Exercise 5.

In the GRADES table there are 100 student scores.
In the CODE table there are respectively the codes (4-digits) of the students.
For the year 2016-17, 3 scholarships will be awarded to female students.
The students with the best grade will receive €1000, with the second best performance €500 and with the third €250.
A program that will display the list (Position, Code) of the students who will receive a scholarship.
Assume that there is no tie.

*/

#define S 100           // Define constant S as 100 for the number of students

int main(void) { // Main function where the program execution begins

    srand(time(NULL));  // Seed the random number generator with current time

    int GRADES[S];      // Declare an array to store student grades
    int CODE[S];        // Declare an array to store student codes

    // Loop to generate random grades for each student

    for (int i = 0; i < S; i++) {

        GRADES[i] = 0 + rand() % 11;    // Assign a random grade between 0 and 10

    }

    // Loop to generate random codes for each student

    for (int i = 0; i < S; i++) {

        CODE[i] = 1000 + rand() % 9000; // Generate a random 4-digit code

    }

    int temp;   // Temporary variable for swapping values during sorting

    // Bubble sort to sort the grades and corresponding codes in descending order

    for (int i = 0; i < S; i++) {

        for (int j = i + 1; j < S; j++) {

            if (GRADES[i] < GRADES[j]) {   // Check if grade i is less than grade j

                // Swap grades

                temp = GRADES[i];

                GRADES[i] = GRADES[j];

                GRADES[j] = temp;

                // Swap codes

                temp = CODE[i];

                CODE[i] = CODE[j];

                CODE[j] = temp;

            }

        }

    }

    // Print the students who will receive scholarships

    printf("First The Student With code : %d\n", CODE[0]);   // Print code of top-performing student

    printf("Second The Student With code : %d\n", CODE[1]);  // Print code of second top-performing student

    printf("Third The Student With code : %d\n", CODE[2]);   // Print code of third top-performing student

}