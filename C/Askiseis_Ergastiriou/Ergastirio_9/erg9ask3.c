#include <stdio.h>

/*

Laboratory 9, Exercise 3.

A program that reads 10 integers from the user's keyboard and prints their sum and average on the screen.

*/

int main(void) {

    int i = 1, a, b;

    while (i <= 10) {

        scanf("%d", &a);

        b += a;

        i += 1;
    }

    printf("Addition : %d\n", b);

    printf("Average : %f", b / 10);

}