#include <stdio.h>     // Including standard input-output header file
#include <stdlib.h>    // Including standard library header file
#include <time.h>      // Including time header file for generating random numbers

/*

Assessment Exercise 11

Write a program that reads the elements of two 3x3 two-dimensional arrays, 
first the elements of one and then the second, will add their respective elements 
creating a new 3x3 array and display it as a result on the screen.
Example for the tables:
3 5 6     5 4 2
4 8 7  +  3 4 6
2 6 3     7 2 1
It will display:
The resulting array is:
8 9  8
7 12 13
9 8  4

*/

#define R 3    // Defining the number of rows as 3
#define C 3    // Defining the number of columns as 3

int main(void) { // Main function where the program execution begins.

    int array1[R][C];    // Declaring first 2D array of size RxC

    int array2[R][C];    // Declaring second 2D array of size RxC

    srand(time(NULL));   // Seeding the random number generator with the current time

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            array1[i][j] = 0 + rand() % 101;   // Assigning random values to array1 elements

        }

    }

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            array2[i][j] = 0 + rand() % 101;   // Assigning random values to array2 elements

        }

    }

    int array_addition[R][C];   // Declaring a third 2D array to store the sum of corresponding elements

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            array_addition[i][j] = (array1[i][j] + array2[i][j]);   // Summing up corresponding elements from array1 and array2

        }

    }

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            printf("%3d ", array_addition[i][j]);   // Printing the resulting array

        }

        puts("");   // Printing a newline after each row

    }

}
