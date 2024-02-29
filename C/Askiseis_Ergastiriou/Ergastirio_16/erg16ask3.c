#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

Laboratory 16, Exercise 3.

In a Sailing Race, 7 boats participate.
To determine the winner, 6 races are run and the final score is the sum of the 5 best races.
The boat with the lowest score is the winner.

A program that will implement a 7x6 results table where each row of the 7 represents a participating boat and each column is the results for each of the 6 races.
The elements in the table contain the position that each vessel left [1-7].
For example, if results[3][2] has the value 5, this means that the fourth boat (as long as the array pointers start at 0) came 5th in the third race.
In order not to type many elements, initialize the results table with random numbers from 1-7.
Then the program should announce the winner.
It will calculate the sum of the positions for each boat and subtract the worst position (1=best position, 7=worst).

*/

#define B 7
#define S 6

int main(void) {

    int results[B][S];

    srand(time(NULL));

    for (int i = 0; i < B; i++) {

        for (int j = 0; j < S; j++) {

            results[i][j] = 1 + rand() % 7;

        }
        
    }

    printf("Results : \n\n");

    for (int i = 0; i < B; i++) {

        for (int j = 0; j < S; j++) {

            printf("%d ", results[i][j]);

        }

        puts("");
        
    }

    printf("\n\n");

    int worst[B];

    int worst_time;

    for (int i = 0; i < B; i++) {

        worst_time = 0;

        for (int j = 0; j < S; j++) {

            if (results[i][j] > worst_time) {
                
                worst_time = results[i][j];
                
            }
            
        }

        worst[i] = worst_time;
        
    }

    int sum[B];

    for (int i = 0; i < B; i++) {

        sum[i] = 0;

    }

    for (int i = 0; i < B; i++) {

        for (int j = 0; i < S; j++) {

            sum[i] += results[i][j];

        }

        sum[i] -= worst[i];
        
    }

    int min = 100;

    int i;

    for (i = 0; i < B; i++) {

        if (sum[i] < min) {

            min = sum[i];

        }

    }

    printf("The winner is boat number : %d", (i + 1));
    
}