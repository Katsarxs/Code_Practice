#include <stdio.h>     // Including standard input-output header file
#include <stdlib.h>    // Including standard library header file
#include <time.h>      // Including time header file for generating random numbers

/*

Laboratory 16, Exercise 2.

A program which, for an array of m NxN integers, calculates and displays:
a) The sum of the elements of its main diagonal,
b) the average of the elements of the secondary diagonal,
c) the largest of the elements above the main diagonal,
d) The smallest of the elements below the main diagonal.

*/

#define N 3    // Defining the size of the square matrix

int main(void) { // Main function where the program execution begins.

    int array[N][N];    // Declaring the 2D array

    srand(time(NULL));   // Seeding the random number generator with the current time

    for (int i = 0; i < N; i++) {   // Loop for iterating over rows

        for (int j = 0; j < N; j++) {   // Loop for iterating over columns

            array[i][j] = 0 + rand() % 10;   // Assigning random values to array elements

        }
                
    }

    int sum_md = 0;    // Variable to store the sum of the main diagonal elements

    int sum_sd = 0;    // Variable to store the sum of the secondary diagonal elements

    for (int i = 0; i < N; i++) {   // Loop for iterating over rows

        for (int j = 0; j < N; j++) {   // Loop for iterating over columns

            if (i == j) {    // Condition to check if the current element is on the main diagonal

                sum_md += array[i][j];    // Adding the element to the sum of main diagonal

            }

            else if ((i + j) == (N - 1)) {   // Condition to check if the current element is on the secondary diagonal

                sum_sd += array[i][j];    // Adding the element to the sum of secondary diagonal

            }
            
        }
                
    }

    int max = array[0][1];    // Variable to store the maximum element above the main diagonal

    int min = array[1][0];    // Variable to store the minimum element below the main diagonal

    for (int i = 0; i < N; i++) {   // Loop for iterating over rows

        for (int j = 0; j < N; j++) {   // Loop for iterating over columns

            if (j > i) {   // Checking if the current element is above the main diagonal

                if (array[i][j] > max) {   // Comparing the current element with the current maximum

                    max = array[i][j];    // Updating the maximum if the current element is greater

                }

            }

            else if (j < i) {   // Checking if the current element is below the main diagonal

                if (array[i][j] < min) {   // Comparing the current element with the current minimum

                    min = array[i][j];    // Updating the minimum if the current element is smaller

                }

            }
            
        }
                
    }

    float average = (sum_sd / N);    // Calculating the average of the secondary diagonal elements

    printf("The sum of the elements of its main diagonal : %d\n", sum_md);    // Printing the sum of main diagonal elements

    printf("The average of the elements of the secondary diagonal : %.2f\n", average);    // Printing the average of secondary diagonal elements

    printf("The largest of the elements above the main diagonal : %d\n", max);    // Printing the maximum element above the main diagonal

    printf("The smallest of the elements below the main diagonal : %d", min);    // Printing the minimum element below the main diagonal

}