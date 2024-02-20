#include <stdio.h>

/*

Laboratory 15, Exercise 4.

A program that generates the following square matrix using an iteration structure:

0   1   1   1   1
-1   0   1   1   1
-1  -1   0   1   1
-1  -1  -1   0   1
-1  -1  -1  -1   0

*/

#define R 5
#define C 5

int main(void) {

    // Declaration of a 5x5 array

    int array[R][C];

    // Loop through each row

    for (int i = 0; i < R; i++) {

        // Loop through each column

        for (int j = 0; j < C; j++) {

            // If row index equals column index, assign 0

            if (i == j) {

                array[i][j] = 0;

            }

            // If row index is greater than column index, assign -1

            else if (i > j) {

                array[i][j] = -1;

            }

            // Otherwise, assign 1

            else {

                array[i][j] = 1;
            }

        }

    }

    // Loop to print the matrix

    for (int i = 0; i < R; i++) {

        // Loop to print each element of the row

        for (int j = 0; j < C; j++) {

            // Printing each element with a width of 3 characters

            printf(" %3d", array[i][j]);

        }

        // Move to the next line after printing each row

        puts("");

    }

}