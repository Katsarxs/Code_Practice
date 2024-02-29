#include <stdio.h>
#include <stdlib.h>

/*

Laboratory 13, Exercise 1.

A program that generates 100 random numbers from 5-50 and at the end displays how many of them are even and how many are odd.

*/
  
int main() {

    int i, a, x = 0, y = 0;

    srand(time(NULL));

    for (i = 0; i < 100; i++)  {

        a = rand()%46 + 5;

        printf("%d\n", a);

        if (a % 2 == 0) {

            x += 1;

        }

        else {

            y += 1;

        }

    }

    printf("\nOdds : %d", x);
    
    printf("\nEvens : %d", y);

}