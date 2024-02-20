#include <stdio.h>

/*

Laboratory 15, Exercise 1.

A program that accepts the temperatures and then calculates the average maximum temperature for the month October,
as well as which day had the lowest maximum and the highest maximum respectively.

*/

#define N 31

int main(void) {

    int temperatures[N];

    // Array Creation With Temperatures

    for (int i = 0; i < N; i++) {

        printf("Enter Day %d : ", (i + 1));

        scanf("%d", &temperatures[i]);

    }

    int max = 0, max_day , min = 41, min_day, sum = 0;

    // Find Max and Min Temperature and Day

    for (int i = 0; i < N; i++) {

        if (temperatures[i] > max) {

            max = temperatures[i];

            max_day = (i + 1);

        }

        if (temperatures[i] < min) {

            min = temperatures[i];

            min_day = (i + 1);

        }

        sum += temperatures[i];

    }

    int average = sum / N; // Calculate Average 

    printf("Average Maximum Temperature : %d C\n", average); // Print Average Maximum Temperature

    printf("Lowest Maximum Temperature : %d C, In Day %d\n", min, min_day); // Print Lowest Maximum Temperature

    printf("Highest Maximum Temperature : %d C, In Day %d\n", max, max_day); // Print Highest Maximum Temperature

}