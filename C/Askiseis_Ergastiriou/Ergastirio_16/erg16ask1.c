#include <stdio.h>     // Including standard input-output header file
#include <stdlib.h>    // Including standard library header file
#include <time.h>      // Including time header file for generating random numbers

/*

Laboratory 16, Exercise 1.

A program that, for a 4x4 two-dimensional array of integers, will transpose its elements along the main diagonal.
Example for the table

4 5 9 8               4 2 4 7
2 2 5 8 will display: 5 2 7 9
4 7 5 9               9 5 5 7
7 9 7 3               8 8 9 3

*/

#define R 4    // Defining the number of rows as 4
#define C 4    // Defining the number of columns as 4

int main(void) { // Main function where the program execution begins.

    int arr1[R][C];    // Declaring the original 2D array

    int arr2[R][C];    // Declaring the transposed 2D array

    srand(time(NULL));   // Seeding the random number generator with the current time

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            arr1[i][j] = 0 + rand() % 10;   // Assigning random values to arr1 elements

        }
        
    }

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            arr2[i][j] = arr1[j][i];   // Transposing arr1 elements to arr2
            
        }
        
    }

    for (int i = 0; i < R; i++) {   // Loop for iterating over rows

        for (int j = 0; j < C; j++) {   // Loop for iterating over columns

            printf("%3d ", arr2[i][j]);   // Printing the transposed array elements
            
        }

        puts("");   // Printing a newline after each row
        
    }

}