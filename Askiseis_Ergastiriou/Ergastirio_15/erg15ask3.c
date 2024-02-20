#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 15, Exercise 3.

For the month of October, the maximum and minimum temperatures have been recorded in a 2x31 table.
The first line contains the minimum temperatures and the second line contains the maximum.
This is a program that,
a) accepts the temperatures for the table,
b) calculates the average of the minimum temperatures and
c) creates a new table of 31 elements which will contain the difference of the maximum from the minimum temperature for each day.

*/

#define D 31
#define LM 2

int main(void) {

    int minmaxtemperatures[LM][D];

    srand(time(NULL));

    // Array Creation

    for (int i = 0; i < D; i++) {

        for (int j = 0; j < LM; j++) {

            // minmaxtemperatures[i][j] = 0 + rand() % 41; For Debugging

            scanf("%d", &minmaxtemperatures[i][j]);

        }
        
    }

    // Addition Of Minimum Temperatures

    int sum = 0;

    for (int i = 0; i < D; i++) {

        sum += minmaxtemperatures[0][i];
        
    }

    // Subtraction Of Max Min Temperatures And Store It In One Array

    int subtraction[D];

    for (int i = 0; i < D; i++) {

        subtraction[i] = (minmaxtemperatures[1][i] - minmaxtemperatures[0][i]);        

    }

    // Print The New Array

    for (int i = 0; i < D; i++) {

        printf("Day %d : %d", (i + 1), subtraction[i]);

    }

    int average = (sum / D); // Calculation Of Average Of The Minimum Temperatures

    printf("Average : %d", average); // Print The Result
    
}