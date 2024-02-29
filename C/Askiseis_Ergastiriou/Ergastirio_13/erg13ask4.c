#include <stdio.h>

/*

Laboratory 13, Exercise 4.

A function named factorial that accepts a positive integer and returns its factorial.

*/

int factorial(int);

int main(void) {

    int input;

    scanf("%d", &input);

    factorial(input);

}

int factorial(int a) {

    int x = 1, i = 1;

    do {

        x *= i;

        i += 1;

    } while (i <= a);

    printf("%d", x);

}