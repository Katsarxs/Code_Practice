#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 14, Exercise 4.

A program that, for a one-dimensional array arr of N integer elements (array_basic[N]),
creates a new array (array_new[N)) where the elements of the first array have been separated into negative and positive ones without changing the order of the numbers in the original table.
As a result, the program displays the 2 tables.

Example for the following array with 5 elements:

The original array is: {-4, 5, -2, 7, 3}
The new array is: {-4, -2, 5, 7, 3}

*/

#define N 5

int main(void) {

    int array_basic[N];

    srand(time(NULL));

    // Basic Array Creation

    for (int i = 0; i < N; i++) {

        array_basic[i] = rand() % 21 - 10;

    }

    int array_new[N];

    int j = 0;

    // New Array with Positive Numbers First

    for (int i = 0; i < N; i++) {

        if (array_basic[i] >= 0) {

            array_new[j] = array_basic[i];

            j += 1;

        }
    }

    // New Array with Negative Numbers Second

    for (int i = 0; i < N; i++) {

        if (array_basic[i] < 0) {

            array_new[j] = array_basic[i];

            j += 1;

        }

    }

    // Print Basic Array

    printf("The original array is: { ");

    for (int i = 0; i < (N - 1); i++) {

        printf("%d, ", array_basic[i]);

    }

    printf("%d }\n", array_basic[N - 1]);

    // Print New Array

    printf("The new array is: { ");

    for (int i = 0; i < (N - 1); i++) {

        printf("%d, ", array_new[i]);

    }

    printf("%d }\n", array_new[N - 1]);
    
}