#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 14, Exercise 2.

A program that fills an array with 20 random integers from 20 to 100.
Then calculates and displays the maximum element and the average of the array elements.

*/

#define N 20

int main(void) {

    int array[N];

    srand(time(NULL));

    // Array Creation

    for (int i = 0; i < N; i ++) {

        array[i] = 20 + rand() % 81;

    }

    int max = 0;

    int sum = 0;

    // Find Max Number

    for (int i = 0; i < N; i++) {

        if (array[i] > max) {

            max = array[i];

        }

        sum += array[i];

    }

    int average = sum / 10;

    printf("Max Number : %d", max); // Print Max Number

    printf("\nAverage : %d", average); // Print Average 

}