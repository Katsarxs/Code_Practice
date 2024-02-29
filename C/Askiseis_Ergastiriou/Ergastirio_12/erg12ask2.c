#include <stdio.h>

/*

Laboratory 12, Exercise 2.

A function that accepts an integer and returns 1 if it is odd 2 if it is even.
Using it in a program that reads a number from input and displays whether it is odd or even.

*/

int check(int);

int number;

int main(void) {

    scanf("%d", &number);

    check(number);

}

int check(int a) {

    if ((a % 2) == 0) {

        printf("Even");

    }

    else if ((a % 2) == 1) {

        printf("Odd");

    }

}